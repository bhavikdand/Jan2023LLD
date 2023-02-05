package polymorphism.compile_time;

public class Demo {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print();
        p.print("String sent from Demo");
        p.print("Random", 5);
    }
}

class Printer{
    void print(){
        System.out.println("No params here");
    }

    void print(String s){
        System.out.println(s);
    }

    void print(String n, int i){
        System.out.println(n + "-----" + i);
    }
}
