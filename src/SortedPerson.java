import java.util.Comparator;
import java.util.TreeSet;

public class SortedPerson {
    public static void main(String[] args) {

//        Comparator<Person2> nameComp = (p1,p2)->p1.getName().compareTo(p2.getName());

//        Comparator<Person2> ageComp = (p1,p2) -> p1.getAge()- p2.getAge();

        TreeSet<Person2> people = new TreeSet<>();
        people.add(new Person2("LILI",22));
        people.add(new Person2("Polo",21));
        people.add(new Person2("Sam",19));

        for (Person2 p : people){
            System.out.println(p);
        }

    }
}
