public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee(1200);
        System.out.println(e1.getSalary());

        Manager m1 = new Manager(1500,700);
        System.out.println(m1.getSalary());

        Clerk c1 = new Clerk(1300,400);
        System.out.println(c1.getSalary());


//        Employee em = m1;
//        System.out.println(em.getSalary());

        showSalary(m1);
        showSalary(c1);




    }
    private static  void showSalary(Employee e){//this is polymorphism
//        System.out.println("Employee salary: "+ e.getSalary());

        if(e instanceof Manager){
            System.out.println("Manager salary:"+e.getSalary());
        } else {
            System.out.println("Clerk salary:"+e.getSalary());
        }
    }



    //this is method overloading
//    private static void showSalary(Manager m1) {
//        System.out.println("Clerk salary:"+ m1.getSalary());
//    }
//    private static void showSalary(Clerk c1) {
//        System.out.println("Manager salary: "+ c1.getSalary());
//    }

}
