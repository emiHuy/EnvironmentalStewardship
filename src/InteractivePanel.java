import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class InteractivePanel extends JPanel implements ActionListener {
    private JPanel impactsSection;
    private JPanel reduceImpactsSection;
    private JPanel programsSection;
    private JPanel resultsSection;
    private JButton goToSection2 = new JButton("Next Section");
    private JButton goToSection3 = new JButton("Next Section");
    private JButton finishInteractive = new JButton("Finish Interactive");
    private JPanel impactsButtonPanel = new JPanel();
    private JPanel reduceImpactsButtonPanel = new JPanel();
    private JPanel programsButtonPanel = new JPanel();
    private ArrayList<QuestionPanel> questionPanelList = new ArrayList<>();

    public InteractivePanel(){
        setupComponents();
    }

    private void setupComponents(){
        setLayout(new CardLayout());

        // Create sections
        impactsSection = createSection(true, "Interactive - Impact of Technology", 0);
        reduceImpactsSection = createSection(false, "Interactive - Reducing Negative Impacts", 0);
        programsSection = createSection(false, "Interactive - Programs and Initiatives", 0);
        resultsSection = createSection(false, "Interactive - Results", 50);

        InteractiveUtility.createQuestions();
        createQuestionPanels();

        // Modify transition buttons
        JButton[] buttonList = {goToSection2, goToSection3, finishInteractive};
        for(JButton button : buttonList){
            button.setFont(new Font("Arial", Font.PLAIN, 32));
            button.setSize(new Dimension(300, 50));
            button.addActionListener(this);
        }

        // Create button panels and add them to sections
        addButtonPanel(impactsSection, impactsButtonPanel, goToSection2);
        addButtonPanel(reduceImpactsSection, reduceImpactsButtonPanel, goToSection3);
        addButtonPanel(programsSection, programsButtonPanel, finishInteractive);
    }

    private JPanel createSection(boolean isVisible, String headerText, int ySpacing){
        // Create panel with layout
        JPanel section = new JPanel(new FlowLayout(FlowLayout.CENTER));
        section.setVisible(isVisible);
        add(section);

        // Add header to panel
        JLabel header = new JLabel(headerText, JLabel.CENTER);
        header.setBorder(new EmptyBorder(ySpacing, 1000, ySpacing, 1000));
        header.setFont(new Font("Arial", Font.BOLD, 48));
        section.add(header);

        return section;
    }

    private void createQuestionPanels(){
        Question[] questionList = InteractiveUtility.getQuestionList();
        int count = 0;
        QuestionPanel questionPanel;

        for(Question question : questionList){
            questionPanel = new QuestionPanel(questionList[count]);

            // Add question panel to the correct section
            if(count < 4){
                impactsSection.add(questionPanel);
            }
            else if(count < 8){
                reduceImpactsSection.add(questionPanel);
            }
            else{
                programsSection.add(questionPanel);
            }

            questionPanel.setBorder(new EmptyBorder(0, 500, 0, 500));
            questionPanelList.add(questionPanel);
            count++;
        }
    }

    // Put transition button onto a button panel and add button panel to section screen
    private void addButtonPanel(JPanel section, JPanel buttonPanel, JButton button){
        section.setBorder(new EmptyBorder(50,0,0,0));
        section.add(buttonPanel);
        button.setBackground(new Color(210,224,221));
        buttonPanel.add(button);
        buttonPanel.setBorder(new EmptyBorder(50, 0,0,0));
    }

    private boolean checkEachQuestionState(int start, int end, JPanel panel){
        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.PLAIN, 22));
        UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 18));

        for(int x = start; x <= end; x++){
            // Check if all questions are answered
            if(!questionPanelList.get(x).checkState()){
                JOptionPane.showMessageDialog(panel, "Please answer all questions.", "Input Warning", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }
        return true;
    }

    private JTextPane displaySectionResults(String section, int start, int end){
        JTextPane pane = new JTextPane();
        String displayString = "";
        Question question;
        int numCorrect = 0;

        for(int x = start; x <= end; x++){
            question = questionPanelList.get(x).getQuestionObj();
            // Add question and user selected answer to string for display
            displayString += "Question: " + question.getQuestion() +"\nYour Answer: " + questionPanelList.get(x).getSelectedAnswer() + "\n";

            // Add question result to string for display
            if(questionPanelList.get(x).isAnswerCorrect()){
                displayString += "Result: Correct\n\n";
                numCorrect++;
            }
            else{
                displayString += "Result: Incorrect\n\n";
            }
        }
        // Add section score to string for display
        displayString += "Section Score: " + numCorrect + "/ 4";

        pane.setFont(new Font("Arial", Font.PLAIN, 28));
        pane.setBackground(new Color(238,238,238));
        pane.setBorder(new EmptyBorder(25,0,0,0));
        pane.setText(displayString);
        return pane;
    }

    private void updateVisibility(JPanel section){
        JPanel[] panels = {impactsSection, reduceImpactsSection, programsSection, resultsSection};
        section.setVisible(true);
        for(JPanel panel : panels){
            if(!panel.equals(section)){
                panel.setVisible(false);
            }
        }
    }

    private void addSectionPanelToTabbedPane(JTabbedPane tabbedPane, String sectionTitle, int startQ, int endQ){
        JPanel section = new JPanel();
        JTextPane results = displaySectionResults(sectionTitle, startQ, endQ);
        section.add(results);
        tabbedPane.add(section, sectionTitle);
    }
    private void setupResultsSectionPanel(){
        resultsSection.setBackground(new Color(210, 224, 221));

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setPreferredSize(new Dimension(1400, 800));
        tabbedPane.setFont(new Font("Arial", Font.BOLD, 32));
        tabbedPane.setBackground(new Color(210, 210, 210));
        resultsSection.add(tabbedPane);

        addSectionPanelToTabbedPane(tabbedPane, "Impact of Technology Section", 0, 3);
        addSectionPanelToTabbedPane(tabbedPane, "Reducing Negative Impacts Section", 4, 7);
        addSectionPanelToTabbedPane(tabbedPane, "Programs and Initiatives Section", 8, 11);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        boolean valid;
        if(e.getSource() == goToSection2){
            valid = checkEachQuestionState(0, 3, impactsSection);
            if(valid){
                updateVisibility(reduceImpactsSection);
            }
        }
        else if(e.getSource() == goToSection3){
            valid = checkEachQuestionState(4, 7, reduceImpactsSection);
            if(valid){
                updateVisibility(programsSection);

            }
        }
        else if(e.getSource() == finishInteractive){
            valid = checkEachQuestionState(8, 11, programsSection);
            if(valid){
                updateVisibility(resultsSection);
                setupResultsSectionPanel();
            }
        }
    }
}
