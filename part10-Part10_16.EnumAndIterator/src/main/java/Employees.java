
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 *
 * @author michael
 */
public class Employees {
    
    private ArrayList<Person> persons = new ArrayList<>();
    
    public void add(Person personToAdd) {
        persons.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        for (Person person : peopleToAdd) {
            persons.add(person);
        }
    }
    
    public void print() {
        Iterator<Person> iterator = persons.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = persons.iterator();
        
        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                System.out.println(iterator.next());
            }
        }
    }
    
    public void fire(Education education) {
         Iterator<Person> iterator = persons.iterator();
        
        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
