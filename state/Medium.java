package state;

import java.util.Random;

public class Medium {
    private ArithmeticGame game;

    public Medium(ArithmeticGame game){
        this.game = game;
        game.setState(game.getMediumState());
    }
    public int getNum(){
        Random rand = new Random();
        int num = rand.nextInt(26);
        return num;
    }
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
    public void increaseDifficulty(){
        game.setState(game.getHardState());
        System.out.println("Level increased to: Hard");
    }
    public void decreaseDifficulty(){
        game.setState(game.getEasyState());
        System.out.println("Level decreased to: Easy");
    }
}
