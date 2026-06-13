public class Person2 implements Comparable<Person2> {
    private  String name;
    private int age;

    public Person2(){

    }
    public Person2(String name,int age){
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person [name="+ name +", age=" + age + "]";
    }

    public String getName() {
            return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person2 o) {
        return this.age - o.age;
    }
}



