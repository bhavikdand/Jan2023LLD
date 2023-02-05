package inheritance;

public class ObjectCreation {
    public static void main(String[] args) {
        CC cc = new CC();
    }
}

class AA{
    public AA(){
        System.out.println("Form AA's constructor");
    }
}

class BB extends  AA{
    public BB(){
        System.out.println("Form BB's constructor");
    }
}

class CC extends  BB{
    public CC(){
        System.out.println("Form CC's constructor");
    }
}
