package strategy;

import java.util.List;
/**
 * Defines a search behavior that determines if a person is already in the list or not
 */
public interface SearchBehavior {
    /**
     * Determine if a person is already in the list of Persons
     * @param people the list being searched
     * @param person the person being searched for
     * @return true if the person is in the list and false if the person is not in the list
     */
    public boolean contains(List<Person> people, Person person);
}
