package access_modifiers_demo.package_2;

import access_modifiers_demo.package_1.Student;

public class Client2 {

    public static void main(String[] args) {
        Student st = new Student();
//        System.out.println(st.universityName); ERROR: Private cannot be accessed
//        System.out.println(st.age); ERROR: Client2 is not subclass of Student
//        System.out.println(st.email); ERROR: Different packages
        System.out.println(st.name);
    }
}
