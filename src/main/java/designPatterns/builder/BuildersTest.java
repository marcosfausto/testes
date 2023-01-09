package designPatterns.builder;

public class BuildersTest {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Gilmar","Silva")
                .build();

        User user2 = new User.UserBuilder("Antonio","Souza")
                .address("Somewhere")
                .age(30)
                .phone("25meia9meiadura")
                .build();

        System.out.println(user1);
        System.out.println(user2);

        Student student1 = Student.StudentBuilder.newBuilder()
                .firstName("Frederico")
                .lastName("Pires")
                .build();

        System.out.println(student1);
    }
}
