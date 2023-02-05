package inheritance;

public class ObjectCreation2 {
    public static void main(String[] args) {
        CCC cc = new CCC();
    }
}

class AAA{
    public AAA(){
        System.out.println("Form AAA's constructor");
    }
}

class BBB extends  AAA{
//    public BBB(){
//        System.out.println("Form BBB's constructor");
//    }
    public BBB(String s){
        System.out.println(s);
    }

    public BBB(int i){
        System.out.println(i);
    }

}

class CCC extends  BBB{
    public CCC(){
//        super("This is the string");
        super(5);

        System.out.println("Form CCC's constructor");
//        super(5); super should be the 1st stmt in a constructor
    }

}
