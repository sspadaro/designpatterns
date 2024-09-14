package state;

import java.util.Random;

public class Easy implements State{
    private ArithmeticGame game;

    public Easy(ArithmeticGame game){
        this.game = game;
        game.setState(game.getEasyState());
    }
    public int getNum(){
        Random rand = new Random();
        int num = rand.nextInt(10) + 1;
        return num;
    }
    public Operation getOperation(){
        Random rand = new Random();
        int num = rand.nextInt(2);
        if(num == 0){
            return Operation.PLUS;
        }else{
            return Operation.MINUS;
        }
    }
    public void increaseDifficulty(){
        game.setState(game.getMediumState());
        System.out.println("Level increased to: Medium");
    }
    public void decreaseDifficulty(){
        System.out.println("Study more");
    }
}
