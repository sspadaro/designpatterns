package observer;

import java.util.ArrayList;
import java.util.HashMap;

public class FanReads implements Observer{
    
    private Subject subject;
    private HashMap<Genre, ArrayList<Book>> recommendations;

    public FanReads(Subject subject, String firstName, String lastName){
        this.subject = subject;
        this.recommendations = new HashMap<>();
        for(Genre genre: Genre.values()){
            recommendations.put(genre, new ArrayList<>());
        }
        subject.registerObserver(this);
    }
    public void update(Book book){
        recommendations.get(book.getGenre()).add(book);
    }
    public ArrayList<Book> getRecommendations(Genre genre){
        return recommendations.get(genre);
    }
}
