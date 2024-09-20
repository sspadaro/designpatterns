package singleton;

import java.util.ArrayList;

public class Question {
    private String question;
    private ArrayList<String> answers;
    private int correctAnswer;

    public Question(String question, int correctAnswer, ArrayList<String> answers){
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.answers = answers;
    }
    public String toString(){
        return question+"\n"+"1. "+answers.get(0)+"\n"
        +"2. "+answers.get(1)+"\n"
        +"3. "+answers.get(2)+"\n"
        +"4. "+answers.get(3)+"\n";
    }
    public boolean isCorrect(int userAnswer){
        if(userAnswer == correctAnswer){
            return true;
        }else{
            return false;
        }
    }
    public String getCorrectAnswer(){
        return answers.get(correctAnswer);
    }
}
