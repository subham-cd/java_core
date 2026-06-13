package Collection_Api;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {

        LinkedList<String> lst = new LinkedList<>();
        lst.add("Microsoft");
        lst.add("Google");
        lst.add("Apple");
        lst.add("Oracle");
        lst.add(2, "Apache");

        // For loop
        System.out.println("-- Iterating using for loop");
        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i));
        }

        // Iterator
        System.out.println("-- Iterating using Iterator");
        Iterator<String> itr = lst.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // For-each
        System.out.println("-- Iterating using for-each");
        for (String e : lst) {
            System.out.println(e);
        }

        // ArrayList
        ArrayList<String> arr = new ArrayList<>();
        arr.add("IBM");
        arr.add("Apple");
        arr.add("JBoss");

        // Merge LinkedList into ArrayList
        arr.addAll(lst);

        System.out.println("-- Iterating over merged collection");
        for (String e : arr) {
            System.out.println(e);
        }
        HashSet<String> set = new HashSet<>(arr);
        System.out.println("--iterating over set collection");
        for(String e:arr){
            System.out.println(e);
        }

        // TreeSet (Sorted + Unique)
        TreeSet<String> tree = new TreeSet<>();
        tree.addAll(arr);

        System.out.println("-- Iterating over sorted collection");
        for (String e : tree) {
            System.out.println(e);
        }
    }
}