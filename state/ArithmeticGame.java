package state;

/**
 * Creates an arithmetic game that asks the user math questions based on which state the game is in
 * @author Sophia Spadaro
 */
public class ArithmeticGame {
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;
    /**
     * Creates an arithmetic game starting in the easy state
     */
    public ArithmeticGame(){
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        state = easyState;
        score = 0;
    }
    /**
     * Creates a question using two random integers and a random operation based on the state
     * @return a math question
     */
    public Question getQuestion(){
        int num1 = state.getNum();
        int num2 = state.getNum();
        Operation operation = state.getOperation();
        return new Question(num1, num2, operation);
    }
    /**
     * Increases the user's score by 1 and increases the state difficulty if the user's score is 3
     */
    public void increaseScore(){
        score++;
        if(score == 3){
            state.increaseDifficulty();
            score = 0;
        }
    }
    /**
     * Decreases the user's score by 1 and decreases the state difficulty if the user's score is -3
     */
    public void decreaseScore(){
        score--;
        if(score == -3){
            state.decreaseDifficulty();
            score = 0;
        }
    }
    /**
     * Set the state of the game
     * @param state the state that the game is being set to
     */
    public void setState(State state){
        this.state = state;
    }
    /**
     * Return easy state of the game
     * @return easy state
     */
    public State getEasyState(){
        return easyState;
    }
    /**
     * Return medium state of the game
     * @return medium state
     */
    public State getMediumState(){
        return mediumState;
    }
    /**
     * Return hard state of the game
     * @return hard state
     */
    public State getHardState(){
        return hardState;
    }
}
