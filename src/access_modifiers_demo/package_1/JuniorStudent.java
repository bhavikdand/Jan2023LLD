package access_modifiers_demo.package_1;

public class JuniorStudent extends Student{

    void printStudent(){
//        System.out.println(universityName); ERROR: Private cannot be accessed
        System.out.println(age);
        System.out.println(email);
        System.out.println(name);
    }

}
