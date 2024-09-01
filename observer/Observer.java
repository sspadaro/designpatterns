package observer;
/**
 * Defines an observer who is updated when new books are added to the list
 */
public interface Observer {
    /**
     * Update the observer when a new book is added to the list
     * @param book the book that is being added
     */
    public void update(Book book);
}
