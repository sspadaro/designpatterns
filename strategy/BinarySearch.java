package strategy;

import java.util.Collections;
import java.util.List;

public class BinarySearch implements SearchBehavior{
    public boolean contains(List<Person> people, Person person){
        return Collections.binarySearch(people, person) >= 0;
    }
}