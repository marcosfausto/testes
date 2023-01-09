package designPatterns.builder;

public class Student {

    //All final attributes
    private final String firstName; // required
    private final String lastName; // required
    private final int age; // optional
    private final String phone; // optional
    private final String address; // optional

    private Student(StudentBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    //All getter, and NO setter to provde immutability
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getPhone() {
        return phone;
    }
    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student: "+this.firstName+", "+this.lastName+", "+this.age+", "+this.phone+", "+this.address;
    }


    public static class StudentBuilder
    {
        private String firstName;
        private String lastName;
        private int age;
        private String phone;
        private String address;

        public static StudentBuilder newBuilder() {
            return new StudentBuilder();
        }

        public Student.StudentBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Student.StudentBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Student.StudentBuilder age(int age) {
            this.age = age;
            return this;
        }
        public Student.StudentBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }
        public Student.StudentBuilder address(String address) {
            this.address = address;
            return this;
        }
        //Return the finally consrcuted User object
        public Student build() {
            Student student =  new Student(this);
            validateUserObject(student);
            return student;
        }
        private void validateUserObject(Student student) {
            //Do some basic validations to check
            //if user object does not break any assumption of system
        }
    }


}
