package design_patterns.builder.v1;

public class Student {

    String name;
    String univName;
    int age;
    String email;
    String phone;
    double psp;
    int gradYear;


    public Student(Builder builder){
        if(builder.gradYear >= 2022){
            throw new IllegalArgumentException("Grad year should be less than 2022");
        }
        // All validations

        this.name = builder.name;
        this.age = builder.age;
        this.gradYear = builder.gradYear;
        this.email = builder.email;
        this.psp = builder.psp;
        this.univName = builder.univName;
        this.phone = builder.phone;
    }
}
