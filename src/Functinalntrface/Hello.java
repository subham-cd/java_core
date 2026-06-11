package Functinalntrface;

public interface Hello {
    String sayHello();

    default String sayBye(){
        return "GoodBoy";
    }
    static void greeting(){
        System.out.println("Hola amigo");
    }
}
