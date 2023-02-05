package access_modifiers_demo.package_1;

public class Student {

    public String name;
    protected int age;

    String email;
    private String universityName;

    void print(){
        System.out.println(universityName);
        System.out.println(age);
        System.out.println(email);
        System.out.println(name);
    }

}
