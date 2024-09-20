package singleton;

import java.util.Random;
import java.util.ArrayList;

/**
 * Creates a new trivia game
 * @author Sophia Spadaro
 */
public class TriviaGame {
    private static TriviaGame triviaGame;
    private int score;
    private int numGames;
    private Random rand;
    private ArrayList<Question> questions;
    /**
     * Creates a trivia game using an array list of questions from the data loader. The singleton.
     */
    private TriviaGame(){
        score = 0;
        numGames = 0;
        rand = new Random();
        questions = DataLoader.getTriviaQuestions();
    }
    /**
     * return an instance of trivia game
     * @return an instane of trivia game
     */
    public static TriviaGame getInstance(){
        if (triviaGame == null) {
			triviaGame = new TriviaGame();
		}
		return triviaGame;
    }
    /**
     * Return a random question and remove it from the array list
     * @return a random question
     */
    public Question getQuestion(){
        if(hasMoreQuestions()){
            return questions.remove(rand.nextInt(questions.size()));
        }else{
            return null;
        }
    }
    /**
     * Check if the array list has any more questions
     * @return true if there are questions left and false if the list of questions is empty
     */
    public boolean hasMoreQuestions(){
        if(questions.isEmpty()){
            return false;
        }else{
            return true;
        }
    }
    /**
     * Increase the user's score and number of questions asked
     */
    public void winRound(){
        score++;
        numGames++;
    }
    /**
     * Increase number of questions asked
     */
    public void loseRound(){
        numGames++;
    }
    /**
     * Return number of questions the user got right out of number of questions answered
     * @return the user's final score
     */
    public String getScores(){
        return "You scored "+score+"/"+numGames;
    }
}
