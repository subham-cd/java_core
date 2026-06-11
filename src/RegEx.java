public class RegEx {
    public static void main(String[] args) {
        String name = "Subham";
        String cell = "2158432165";
        String email="subham@gmail.com";

        String nameRegex = "[A-Z]{1}[a-z]{3,}";
        String cellRegex = "[6-9]{1}[0-9]{9}";
        String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";

        System.out.println(name.matches(nameRegex));
        System.out.println(cell.matches(cellRegex));
        System.out.println(email.matches(emailRegex));
    }
}
