package state;

/**
 * Create an arithmetic question based on the difficulty of the state
 * @author Sophia Spadaro
 */
public class Question {
    private String question;
    private int answer;
    /**
     * Create an arithmetic question using random integers and operations based on which state the game is in
     * @param num1 random integer
     * @param num2 random integer
     * @param operation operation being conducted between the two integers
     */
    public Question(int num1, int num2, Operation operation){
        question = num1+ " "+operation.label+" "+num2;
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
    /**
     * return the question in the correct format
     */
    public String toString(){
        return question;
    }
    /**
     * return the answer to the question
     * @return the answer to the question
     */
    public int getAnswer(){
        return answer;
    }
    /**
     * Check if the user's answer is equal to the correct answer
     * @param answer the user's answer
     * @return true if the user was correct and false if they were incorrect
     */
    public boolean isCorrect(int answer){
        if(this.answer == answer){
            return true;
        }else{
            return false;
        }
    }
}