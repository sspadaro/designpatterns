package state;

import java.util.Random;
/**
 * Creates an easy state of the game
 * @author Sophia Spadaro
 */
public class Easy implements State{
    private ArithmeticGame game;
    /**
     * Creates an easy state of the game
     * @param game game that is being given an easy state
     */
    public Easy(ArithmeticGame game){
        this.game = game;
        game.setState(game.getEasyState());
    }
    /**
     * Return a random number from 1-10
     * @return a random integer
     */
    public int getNum(){
        Random rand = new Random();
        int num = rand.nextInt(10) + 1;
        return num;
    }
    /**
     * Randomly return either addition or subtraction operation
     * @return a random operation
     */
    public Operation getOperation(){
        Random rand = new Random();
        int num = rand.nextInt(2);
        if(num == 0){
            return Operation.PLUS;
        }else{
            return Operation.MINUS;
        }
    }
    /**
     * Change from an easy state to a medium state
     */
    public void increaseDifficulty(){
        game.setState(game.getMediumState());
        System.out.println("Level increased to: Medium");
    }
    /**
     * Tell the user that they are not doing well and keep the state at easy
     */
    public void decreaseDifficulty(){
        System.out.println("Study more");
    }
}
