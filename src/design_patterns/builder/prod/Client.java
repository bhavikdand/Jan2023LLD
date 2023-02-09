package design_patterns.builder.prod;

public class Client {

    public static void main(String[] args) {
//        Builder builder = new Builder();
//        builder.setName("Bhavik");
//        builder.setAge(26);
//        builder.setEmail("bhavik.dand_1@scaler.com");
//        builder.setUnivName("Mumbai University");
//        builder.setGradYear(2023);
//        builder.setPsp(80.01);
//
//
//        Student st = new Student(builder);  // Breaking because Student const is private

        /*
        #1: Create a public static method in Student -> getBuilder(). Returns a builder object.
        #2: Move validation from Student constructor to build() in Builder
        #3: Refactored all the setters in Builder to return the Builder object at the end.

        Now we can create object of 1 student using the syntax below.
         */

        Student st2 = Student.getBuilder()
                .setAge(26)
                .setName("Bhavik")
                .setEmail("email")
                .build();



        System.out.println("DEBUG");
    }
}
