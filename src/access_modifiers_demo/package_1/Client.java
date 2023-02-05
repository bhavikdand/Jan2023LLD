package access_modifiers_demo.package_1;

public class Client {

    public static void main(String[] args) {
        Student st = new Student();
//        System.out.println(st.universityName); ERROR: Private cannot be accessed
        System.out.println(st.age);
        System.out.println(st.email);
        System.out.println(st.name);
    }
}
