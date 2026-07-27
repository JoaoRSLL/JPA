import domain.Person;


public class Main {
    public static void main(String[] args) {

        Person p1 = new Person(01, "Kiki", "kiki@gmail.com");
        Person p2 = new Person(02, "Pantera", "pantera@gmail.com");
        Person p3 = new Person(03, "Frajola", "frajola@gmail.com");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}