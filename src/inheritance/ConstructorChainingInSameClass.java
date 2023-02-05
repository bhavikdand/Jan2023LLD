package inheritance;

public class ConstructorChainingInSameClass {


}

class User{
    String name; // optional
    String email; // optional
    String password;


    public User(String n, String e, String p){
        name = n;
        email = e;
        password = p;
        //validatePassword()
    }

//    public User(String n, String p){
//        name = n;
//        email = "default_email";
//        password = p;
//        // validatePassword()
//    }

    public User(String n, String p){
       this(n, "default_email", p);
    }
}

// Assignment to try to do constructor chaining with super + this both
