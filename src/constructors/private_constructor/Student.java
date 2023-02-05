package constructors.private_constructor;

public class Student {

    public String name;
    protected int age;

    String email;
    private String universityName;

    private Student(){
        name = "Bhavik";
        email = "bd@gmail.com";
    }


    void print(){
        System.out.println(universityName);
        System.out.println(age);
        System.out.println(email);
        System.out.println(name);
    }

}
