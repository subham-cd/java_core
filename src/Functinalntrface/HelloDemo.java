package Functinalntrface;

public interface HelloDemo {

    public static void main(String[] args) {
        Hello h = ()->"Hello world"; //Lambda expression

        System.out.println(h.sayBye());//calling default method
        System.out.println(h.sayHello());

        Hello h2 =()-> {
            String msg = "Hola Monde";
            return msg;
        };
        System.out.println(h2.sayHello());

        Hello.greeting();//calling static method
    }
}
