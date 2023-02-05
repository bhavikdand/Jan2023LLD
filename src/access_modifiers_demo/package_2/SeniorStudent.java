package access_modifiers_demo.package_2;

import access_modifiers_demo.package_1.Student;

public class SeniorStudent extends Student {
    void printStudent(){
//        System.out.println(universityName); ERROR: Private cannot be accessed
        System.out.println(age);
//        System.out.println(email);  ERROR: Different package
        System.out.println(name);
    }
}
