import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo4 {

    public static void main(String[] args) {
        Map<String,String> people = new HashMap<>();
        people.put("POLO","pune");
        people.put("mili","mumbai");
        people.put("den","delhi");

        people.values().stream().forEach(System.out::println);


        //collect all the cities in upper case into a list of string named cities and print

        List<String> cities = people.values().stream().map(c->c.toUpperCase()).sorted().collect(Collectors.toList());

        cities.forEach(System.out::println);

        Map<String,List<String>> contacts = new HashMap<>();
        contacts.put("freudo", Arrays.asList("1235-2152","6461-5461","9566-5484"));
        contacts.put("sean", Arrays.asList("6552-5456","2454-1265","6558-6546"));
        contacts.put("baren", Arrays.asList("4878-6543","2155-8756"));

//        contacts.values().stream().flatMap(Collection::stream).forEach(System.out::println);

        contacts.values().stream().flatMap(Collection::stream).filter(s->s.contains("8")).forEach(System.out::println);
    }
}
