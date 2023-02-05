package constructors.default_constructor;

public class Student {

    public String name;
    protected int age;

    String email;
    private String universityName;

    //Not added any custom constructor, still we are able to create object

    void print(){
        System.out.println(universityName);
        System.out.println(age);
        System.out.println(email);
        System.out.println(name);
    }

}
