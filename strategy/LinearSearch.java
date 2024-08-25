package strategy;

import java.util.List;
/**
 * create a linear search that implements the SearchBehavior interface
 */
public class LinearSearch implements SearchBehavior{
    /**
     * Use linear search to check if a person is already contained in the list
     * @param people the list being searched
     * @param person the person being searched for
     * @return true if the person is in the list and false if not
     * I got my linear search method from the internet
     */
    public boolean contains(List<Person> people, Person person){
        for (Person p : people) {
            if (p.equals(person)) {
                return true;
            }
        }
        return false;
    }
}
