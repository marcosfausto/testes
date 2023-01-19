package designPatterns.prototype;

public class MainTestUserClone {
    public static void main(String[] args) {
        User user = new User(1,"Frederico");
        User user2 = user.clone();

        System.out.println(user);
        System.out.println(user2);

    }
}
