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
    private String answer;
    private String selectedAnswer;
    private Question questionObj;

    public QuestionPanel(Question questionObject){
        add(parentPanel);
        parentPanel.setPreferredSize(new Dimension(1500, 170));

        questionLabel.setBorder(new EmptyBorder(25,0,0,0));
        questionLabel.setText(questionObject.getQuestion());
        answer = questionObject.getAnswer();
        questionObj = questionObject;

        String[] optionList = questionObject.getOptionList();
        choiceA.setText(optionList[0]);
        choiceB.setText(optionList[1]);
        choiceC.setText(optionList[2]);
        choiceD.setText(optionList[3]);

        ButtonGroup group = new ButtonGroup();
        group.add(choiceA);
        group.add(choiceB);
        group.add(choiceC);
        group.add(choiceD);
    }

    public boolean checkState() {
        JRadioButton[] choices = {choiceA, choiceB, choiceC, choiceD};
        for (JRadioButton choice : choices) {
            if (choice.isSelected()) {
                storeSelectedAnswer(choice);
                return true;
            }
        }
        return false;
    }

    private void storeSelectedAnswer(JRadioButton selectedButton){
        selectedAnswer = selectedButton.getText();
    }

    public boolean isAnswerCorrect(){
        if(selectedAnswer.equals(answer)){
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
        return questionObj;
    }
}
