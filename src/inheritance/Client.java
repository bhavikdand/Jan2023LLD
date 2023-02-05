package inheritance;

public class Client {

    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.i);
//        System.out.println(b.j);  Because j is private
        b.print();
    }
}

class A{
    int i;
    private int j;

    public void print(){
        System.out.println("Print from A");
    }
}

class B extends A {

}
