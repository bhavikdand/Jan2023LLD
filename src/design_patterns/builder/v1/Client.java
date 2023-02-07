package design_patterns.builder.v1;

public class Client {

    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setName("Bhavik");
        builder.setAge(26);
        builder.setEmail("bhavik.dand_1@scaler.com");
        builder.setUnivName("Mumbai University");
        builder.setGradYear(2023);
        builder.setPsp(80.01);


        Student st = new Student(builder);

        System.out.println("DEBUG");
    }
}
