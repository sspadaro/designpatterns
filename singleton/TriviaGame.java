package singleton;

import java.util.Random;
import java.util.ArrayList;

public class TriviaGame {
    private static TriviaGame triviaGame;
    private int score;
    private int numGames;
    private Random rand;
    private ArrayList<Question> questions;

    private TriviaGame(){
        score = 0;
        numGames = 0;
        rand = new Random();
        questions = DataLoader.getTriviaQuestions();
    }
    public static TriviaGame getInstance(){
        if (triviaGame == null) {
			triviaGame = new TriviaGame();
		}
		return triviaGame;
    }
    public Question getQuestion(){
        if(hasMoreQuestions()){
            return questions.remove(rand.nextInt(questions.size()));
        }else{
            return null;
        }
    }
    public boolean hasMoreQuestions(){
        if(questions.isEmpty()){
            return false;
        }else{
            return true;
        }
    }
    public void winRound(){
        score++;
        numGames++;
    }
    public void loseRound(){
        numGames++;
    }
    public String getScores(){
        return "You scored "+score+"/"+numGames;
    }
}
