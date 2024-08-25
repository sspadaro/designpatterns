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
     * @param title 
     * @param people
     * @param searchBehavior
     */
    public Attendees(String title){
        this.title = title;
        this.people = new ArrayList<>();
        this.searchBehavior = new LinearSearch();
    }
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
    public String getTitle(){
        return title;
    }
    public void setSearchBehavior(SearchBehavior searchBehavior){
        this.searchBehavior = searchBehavior;
    }
    public List<Person> getList(){
        Collections.sort(people);
        return people;
    }
}
