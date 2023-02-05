package constructors.custom_constructor;

public class Student {

    public String name;
    protected int age;

    String email;
    private String universityName;

//    public Student(){
//        age = 21;
//    }

    public Student(String student_name, int student_age){
        name = student_name;
        age = student_age;
    }

    public Student(String student_name, String student_email, int student_age){
        name = student_name;
        age = student_age;
        email = student_email;
    }


    void print(){
        System.out.println(universityName);
        System.out.println(age);
        System.out.println(email);
        System.out.println(name);
    }

}
