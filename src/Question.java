
public class Question {
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String question;
    private String answer;

    public Question( String aQuestion, String a, String b, String c, String d, String anAnswer){
        optionA = a;
        optionB = b;
        optionC = c;
        optionD = d;
        question = aQuestion;
        answer = anAnswer;
    }

    public String[] getOptionList(){
        return new String[] {optionA, optionB, optionC, optionD};
    }

    public String getQuestion(){
        return question;
    }

    public String getAnswer(){
        return answer;
    }
}
