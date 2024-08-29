package strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 * Creates a list of attendees
 */
public class Attendees {
    private String title;
    private List<Person> people;
    private SearchBehavior searchBehavior;

    /**
     * Creates a list of attendees
     * @param title The title of the list
     * @param people The list of Persons
     * @param searchBehavior The search behavior
     */
    public Attendees(String title){
        this.title = title;
        this.people = new ArrayList<>();
        this.searchBehavior = new LinearSearch();
    }
    /**
     * Adds a person the list
     * @param firstName The person's first name
     * @param lastName The person's last name
     * @param phoneNumber The person's phone number
     * @param reminder The note saved about the person
     * @return the person being added
     */
    public Person add(String firstName, String lastName, String phoneNumber, String reminder){
        Person person = new Person(firstName, lastName, phoneNumber, reminder);
        
        Collections.sort(people);
        if (searchBehavior.contains(people, person)) {
            return null;
        } else {
            people.add(person);
            return person;
        }
    }
    /**
     * Return the title of the list
     * @return the title
     */
    public String getTitle(){
        return title;
    }
    /**
     * Set the search behavior
     * @param searchBehavior search behavior
     */
    public void setSearchBehavior(SearchBehavior searchBehavior){
        this.searchBehavior = searchBehavior;
    }
    /**
     * Return the list of attendees
     * @return the list of Persons
     */
    public List<Person> getList(){
        Collections.sort(people);
        return people;
    }
}
