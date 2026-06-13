package Collection_Api;

import java.util.HashMap;

public class MapsDemo {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("Scott","tiger");
        map.put("jack","jill");
        map.put("polo","lili");
        map.put("jack","rose");

        System.out.println("Scott" + map.get("Scott"));
        System.out.println("Polo"+map.get("polo"));
        System.out.println("Jack"+map.get("jack"));

        for (String key : map.keySet())
            System.out.println(key+":"+map.get(key));

    }
}
