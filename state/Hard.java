package state;

import java.util.Random;

public class Hard {
    private ArithmeticGame game;

    public Hard(ArithmeticGame game){
        this.game = game;
    }
    public int getNum(){
        Random rand = new Random();
        int num = rand.nextInt(50) + 1;
        return num;
    }
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
    public void increaseDifficulty(){
        System.out.println("Good job");
    }
    public void decreaseDifficulty(){
        game.setState(game.getMediumState());
        System.out.println("Level decreased to: Medium");
    }
}