package state;

import java.util.Random;
/**
 * Create a medium state of the arithmetic game
 * @author Sophia Spadaro
 */
public class Medium implements State{
    private ArithmeticGame game;
    /**
     * Creates a medium state of the game
     * @param game The arithmetic game that is being set to a medium state
     */
    public Medium(ArithmeticGame game){
        this.game = game;
        game.setState(game.getMediumState());
    }
    /**
     * Return a random integer from 1-25
     * @return a random integer
     */
    public int getNum(){
        Random rand = new Random();
        int num = rand.nextInt(25) +1;
        return num;
    }
    /**
     * Randomly return either the addition, subtraction, or multiplication operation
     * @return a random operation
     */
    public Operation getOperation(){
        Random rand = new Random();
        int num = rand.nextInt(3);
        if(num == 0){
            return Operation.PLUS;
        }else if(num == 1){
            return Operation.MINUS;
        }else{
            return Operation.MULTIPLY;
        }
    }
    /**
     * Change from a medium state to a hard state
     */
    public void increaseDifficulty(){
        game.setState(game.getHardState());
        System.out.println("Level increased to: Hard");
    }
    /**
     * Change from a medium state to an easy state
     */
    public void decreaseDifficulty(){
        game.setState(game.getEasyState());
        System.out.println("Level decreased to: Easy");
    }
}
