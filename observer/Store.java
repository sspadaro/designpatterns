package observer;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class Store implements Observer{

    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;

    public Store(Subject subject){
        this.subject = subject;
        bestSellers = new LinkedList<>();
        subject.registerObserver(this);
    }
    public void update(Book book){
        bestSellers.add(book);
        if(bestSellers.size()>5){
            bestSellers.poll();
        }
    }
    public List<Book> getBestSellers(){
        return (List)bestSellers;
    }
}
