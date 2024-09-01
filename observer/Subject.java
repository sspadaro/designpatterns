package observer;
/**
 * Creates a new subject which keeps track of the observers and notifies them
 */
public interface Subject {
    /**
     * Register a new observer to the list of observers
     * @param observer observer being added
     */
    public void registerObserver(Observer observer);
    /**
     * Remove an observer from the list of observers
     * @param observer observer being removed
     */
    public void removeObserver(Observer observer);
    /**
     * Notifies all observers when a new book is added to the best selling list
     * @param book book being added to the list
     */
    public void notifyObservers(Book book);
}
