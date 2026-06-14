import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        //convert integer array into list of integers
        Integer[] arr = {2,3,4,5,9,8,7,3,4,6};
        List<Integer> numbers = Arrays.asList(arr);
        //news way to iterate over collection
//       numbers.forEach(System.out::println); // :: method refrence


        //CREATING A STREAM FOR NUMBERS LIST
        Stream<Integer> str = numbers.stream();
//        str.forEach(System.out::println);//terminal operation
        //performing again shall give error
//        str.forEach(System.out::println)


        //shorthand to do the same
//        numbers.stream().forEach(System.out::println);

        //Perform intermediate operation before terminal
//        numbers.stream().distinct().forEach(System.out::println);  //distinct() is intermediate operation

//        System.out.println(numbers.stream().distinct().count());  //count() is terminal operation

        //sorting distinct values before printing
//        numbers.stream().distinct().sorted().forEach(System.out::println);  //sorted()is intermdiate operation

        //calculating sum of numbers in 2 ways
//        System.out.println(numbers.stream().distinct().reduce(0,(a,b)->a+b));
//        System.out.println(numbers.stream().distinct().reduce(0,Integer::sum));


        //creatimng and working with stream of numbers
//        System.out.println(IntStream.range(1,99).count());
//        System.out.println(IntStream.range(1,9).sum());
//
//        System.out.println(IntStream.range(1,9).skip(5).sum());


        //common statics on Integer stream

        IntStream str1 = IntStream.of(2,5,7,6,8,3,4,5);
        IntSummaryStatistics stats = str1.summaryStatistics();
        System.out.println(stats);



    }
}
