package observer;

import java.util.ArrayList;
/**
 * Creates a list of the best selling books and notifies observers every time a new book is added
 */
public class BestSellers implements Subject{
    private ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;
    /**
     * Creates a list of books and a list of observers
     */
    public BestSellers(){
        observers = new ArrayList<>();
        bestSellers = new ArrayList<>();
    }
    /**
     * Adds and observer to the list of observers
     * @param observer the observer being added to the list
     */
    public void registerObserver(Observer observer){
        observers.add(observer);
    }
    /**
     * Removes an observer from the list of observers
     * @param observer the observer being removed from the list
     */
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    /**
     * Tells the observers when a book is added to the best sellers list
     * @param book the book that is added to the list
     */
    public void notifyObservers(Book book){
        for(Observer observer : observers){
            observer.update(book);
        }
    }
    /**
     * Creates a new book and adds it to the best sellers list
     * @param title title of the book
     * @param genre genre of the book
     * @param authorFirstName the author of the book's first name
     * @param authorLastName the author of the book's last name
     * @param description description of the book
     */
    public void addBook(String title, Genre genre, String authorFirstName, String authorLastName, String description){
        Book addBook = new Book(title, genre, authorFirstName, authorLastName, description);
        bestSellers.add(addBook);
        notifyObservers(addBook);
    }
}
