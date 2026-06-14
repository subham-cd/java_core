import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SteamDemo2 {
    public static void main(String[] args) {
        List<String > basket = Arrays.asList("mango","banana","apple","papaya","orange");
//        basket.forEach(System.out::println);
//
//
//        basket.stream().forEach(System.out::println);

        Stream<String> str = Stream.of("Mango","banana","Apple","papaya","Orange");
//        str.sorted().forEach(System.out::println);

//        str.map(s->s.toUpperCase()).forEach(System.out::println);
        str.filter(s->s.contains("a")).forEach(System.out::println);
    }
}
