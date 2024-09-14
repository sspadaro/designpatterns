package state;

public class ArithmeticGame {
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;

    public ArithmeticGame(){
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        state = easyState;
        score = 0;
    }
    public Question getQuestion(){
        int num1 = state.getNum();
        int num2 = state.getNum();
        Operation operation = state.getOperation();
        return new Question(num1, num2, operation);
    }
    public void increaseScore(){
        score++;
        if(score == 3){
            state.increaseDifficulty();
            score = 0;
        }
    }
    public void decreaseScore(){
        score--;
        if(score == -3){
            state.decreaseDifficulty();
            score = 0;
        }
    }
    public void setState(State state){
        this.state = state;
    }
    public State getEasyState(){
        return easyState;
    }
    public State getMediumState(){
        return mediumState;
    }
    public State getHardState(){
        return hardState;
    }
}
