package constructors.custom_constructor;

public class Client {

    public static void main(String[] args) {
        Student st = new Student("Bhavik", 26);

        Student st1 = new Student("Bhavik", "bhavik.dand@gmail.com", 26);

        System.out.println("Debug");
    }
}
