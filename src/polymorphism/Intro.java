package polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Intro {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new TA("Rohan"));
        users.add(new Instructor("Bhavik"));
        users.add(new Mentor("Pawan"));
        users.add(new Student("Hetal"));

        printUserNames(users);

        User u =new User(""); // This is allowed
        User u1 = new TA(""); // This is allowed becasue of polymorphism

//        TA ta = new User(""); // This is not allowed
    }

    public static void printUserNames(List<User> users){
        for(User u: users){
            System.out.println(u.name);
        }
    }
}


class User{
    String name;

    User(String n){
        name = n;
    }
}

class TA extends User{

    public TA(String n){
        super(n);
    }
}

class Mentor extends User{

    public Mentor(String n){
        super(n);
    }
}

class Student extends User{

    public Student(String n){
        super(n);
    }
}

class Instructor extends User{

    public Instructor(String n){
        super(n);
    }
}

