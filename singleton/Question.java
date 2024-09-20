package singleton;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Creates a question, which has a question, array list of possible answers, and a correct answer
 * @author Sophia Spadaro
 */
public class Question {
    private String question;
    private ArrayList<String> answers;
    private int correctAnswer;

    /**
     * Creates a question, which has a question, array list of possible answers, and a correct answer
     * @param question the question being asked
     * @param correctAnswer the index of the correct answer
     * @param answers an array list of possible answers
     */
    public Question(String question, int correctAnswer, String... answers){
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.answers = new ArrayList<>(Arrays.asList(answers));
    }
    /**
     * Returns how the question and answers should be printed out
     */
    public String toString(){
        return "\n"+question+"\n"+"1. "+answers.get(0)+"\n"
        +"2. "+answers.get(1)+"\n"
        +"3. "+answers.get(2)+"\n"
        +"4. "+answers.get(3)+"\n";
    }
    /**
     * Checks if the user's answer matches the correct answer
     * @param userAnswer the user's answer
     * @return true if the user was correct and false if the user was incorrect
     */
    public boolean isCorrect(int userAnswer){
        return userAnswer == correctAnswer+1;
    }
    /**
     * Return the correct answer
     * @return the correct answer
     */
    public String getCorrectAnswer(){
        return answers.get(correctAnswer);
    }
}
