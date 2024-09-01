package observer;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
/**
 * Creates a new observer and a list that shows the five best selling books
 */
public class Store implements Observer{

    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;
    /**
     * Registers Store as an observer and creates a best selling books list
     * @param subject The subject that is registering Store as an observer
     */
    public Store(Subject subject){
        this.subject = subject;
        bestSellers = new LinkedList<>();
        subject.registerObserver(this);
    }
    /**
     * Adds a new book to the best sellers list and keeps only the five latest books
     */
    public void update(Book book){
        bestSellers.add(book);
        if(bestSellers.size()>5){
            bestSellers.poll();
        }
    }
    /**
     * Returns the list of best selling books
     * @return the best sellers list
     */
    public List<Book> getBestSellers(){
        return (List)bestSellers;
    }
}
