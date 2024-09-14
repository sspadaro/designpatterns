package state;

public class Question {
    private String question;
    private int answer;

    public Question(int num1, int num2, Operation operation){
        question = num1+ " "+operation+" "+num2+":";
        if(operation.label.equals("+")){
            answer = num1 + num2;
        }else if(operation.label.equals("-")){
            answer = num1 - num2;
        }else if(operation.label.equals("*")){
            answer = num1 * num2;
        }else{
            answer = num1/num2;
        }
    }
    public String toString(){
        return question;
    }
    public int getAnswer(){
        return answer;
    }
    public boolean isCorrect(int answer){
        if(this.answer == answer){
            return true;
        }else{
            return false;
        }
    }
}