package strategy;

import java.util.Collections;
import java.util.List;
/**
 * Creates a binary search that implements the SearchBehavior interface
 */
public class BinarySearch implements SearchBehavior{
    /**
     * Use binary search to check if a person is already contained in the list
     * @param people the list being searched
     * @param person the person being searched for
     * @return true if the person is in the list and false if the person is not
     * I got my binarySearch method from the internet
     */
    public boolean contains(List<Person> people, Person person){
        return Collections.binarySearch(people, person) >= 0;
    }
}