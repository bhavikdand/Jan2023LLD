package design_patterns.builder.prod;

public class Student {

    String name;
    String univName;
    int age;
    String email;
    String phone;
    double psp;
    int gradYear;


    private Student(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.gradYear = builder.gradYear;
        this.email = builder.email;
        this.psp = builder.psp;
        this.univName = builder.univName;
        this.phone = builder.phone;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    static class Builder {
        String name;
        String univName;
        int age;
        String email;
        String phone;
        double psp;
        int gradYear;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getUnivName() {
            return univName;
        }

        public Builder setUnivName(String univName) {
            this.univName = univName;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public String getPhone() {
            return phone;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Student build(){
            if(this.gradYear >= 2022){
                throw new IllegalArgumentException("Grad year should be less than 2022");
            }


            return new Student(this);
        }
    }
}
