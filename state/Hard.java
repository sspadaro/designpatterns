package state;

import java.util.Random;
/**
 * Creates a hard state of the arithmetic game
 * @author Sophia Spadaro
 */
public class Hard implements State{
    private ArithmeticGame game;
    /**
     * Creates a hard state of the game
     * @param game The game that is being given a hard state
     */
    public Hard(ArithmeticGame game){
        this.game = game;
    }
    /**
     * Return a random integer from 1-50
     * @return a random integer
     */
    public int getNum(){
        Random rand = new Random();
        int num = rand.nextInt(50) + 1;
        return num;
    }
    /**
     * Randomly return either the addition, subtraction, multiplication, or division operation
     * @return a random operation
     */
    public Operation getOperation(){
        Random rand = new Random();
        int num = rand.nextInt(4);
        if(num == 0){
            return Operation.PLUS;
        }else if(num == 1){
            return Operation.MINUS;
        }else if(num == 2){
            return Operation.MULTIPLY;
        }else{
            return Operation.DIVIDE;
        }
    }
    /**
     * Remain in the hard state and tell the user they are doing well
     */
    public void increaseDifficulty(){
        System.out.println("Good job");
    }
    /**
     * Change from a hard state to a medium state
     */
    public void decreaseDifficulty(){
        game.setState(game.getMediumState());
        System.out.println("Level decreased to: Medium");
    }
}