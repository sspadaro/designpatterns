package observer;

import java.util.ArrayList;
import java.util.HashMap;
/**
 * Creates lists of books for each genre using a hashmap
 */
public class FanReads implements Observer{
    
    private Subject subject;
    private HashMap<Genre, ArrayList<Book>> recommendations;
    /**
     * Creates lists of books for each genre using a hashmap and registers FanReads as an observer of the book list
     * @param subject The subject that is registering FanReads as an observer
     * @param firstName
     * @param lastName
     */
    public FanReads(Subject subject, String firstName, String lastName){
        this.subject = subject;
        this.recommendations = new HashMap<>();
        for(Genre genre: Genre.values()){
            recommendations.put(genre, new ArrayList<>());
        }
        subject.registerObserver(this);
    }
    /**
     * Add a book to the recommendations according to its genre
     * @param book the book being added
     */
    public void update(Book book){
        recommendations.get(book.getGenre()).add(book);
    }
    /**
     * Return a list of all the books in one genre
     * @param genre The genre of books being returned
     * @return A list of books of the specified genre
     */
    public ArrayList<Book> getRecommendations(Genre genre){
        return recommendations.get(genre);
    }
}
