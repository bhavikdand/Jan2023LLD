package polymorphism.runtime;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Demo {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        Random random = new Random();
        for(int i=0; i<100; i++){
            int r = random.nextInt();
            if(r%4==0){
                users.add(new TA(String.valueOf(i)));
            } else if(r%4==1){
                users.add(new Mentor(String.valueOf(i)));
            }else if(r%4==2){
                users.add(new Student(String.valueOf(i)));
            } else {
                users.add(new Instructor(String.valueOf(i)));
            }
        }

        printUserNames(users);


    }

    public static void printUserNames(List<User> users){
        for(User u: users){
            u.printName();
        }
    }
}


class User{
    String name;

    public void printName(){
        System.out.println(name);
    }

    User(String n){
        name = n;
    }
}

class TA extends User {

    public TA(String n){
        super(n);
    }

    public void printName(){
        super.printName();
        System.out.println("I am TA, my name is " + name);
    }
}

class Mentor extends User {

    public Mentor(String n){
        super(n);
    }

    public void printName(){
        System.out.println("I am mentor, my name is " + name);
    }
}

class Student extends User {

    public Student(String n){
        super(n);
    }

    public void printName(){
        System.out.println("I am Student, my name is " + name);
    }
}

class Instructor extends User {

    public Instructor(String n){
        super(n);
    }

    public void printName(){
        System.out.println("I am Instructor, my name is " + name);
    }
}

