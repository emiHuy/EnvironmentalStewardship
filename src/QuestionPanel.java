import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class QuestionPanel extends JPanel {
    private JPanel parentPanel;
    private JLabel questionLabel;
    private JRadioButton choiceA;
    private JRadioButton choiceB;
    private JRadioButton choiceC;
    private JRadioButton choiceD;
    private String selectedAnswer;
    private Question questionObject;

    public QuestionPanel(Question aQuestionObject){
        questionObject = aQuestionObject;
        setupComponents();
    }

    private void setupComponents(){
        // Setup panel
        add(parentPanel);
        parentPanel.setPreferredSize(new Dimension(1500, 170));

        questionLabel.setBorder(new EmptyBorder(25,0,0,0));
        questionLabel.setText(questionObject.getQuestion());

        // Set MC options
        String[] optionList = questionObject.getOptionList();
        choiceA.setText(optionList[0]);
        choiceB.setText(optionList[1]);
        choiceC.setText(optionList[2]);
        choiceD.setText(optionList[3]);

        // Create button group of MC options - this will only allow one option to be selected at a time
        ButtonGroup group = new ButtonGroup();
        group.add(choiceA);
        group.add(choiceB);
        group.add(choiceC);
        group.add(choiceD);
    }

    private void storeSelectedAnswer(JRadioButton selectedButton){
        selectedAnswer = selectedButton.getText();
    }

    public boolean checkState() {
        JRadioButton[] choices = {choiceA, choiceB, choiceC, choiceD};
        for (JRadioButton choice : choices) {
            // Check if JRadioButton was selected
            if (choice.isSelected()) {
                storeSelectedAnswer(choice);
                return true;
            }
        }
        // At this point, none of the JRadioButtons have been selected
        return false;
    }

    public boolean isAnswerCorrect(){
        if(selectedAnswer.equals(questionObject.getAnswer())){
            return true;
        }
        else{
            return false;
        }
    }

    public String getSelectedAnswer(){
        return selectedAnswer;
    }

    public Question getQuestionObj(){
        return questionObject;
    }
}