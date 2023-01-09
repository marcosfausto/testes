package equals_test;

public class MainEqualsTest {
    public static void main(String[] args) {
        User user = User.builder()
                .id(123)
                .nome("Gilmar")
                .endereco("Rua do mo")
                .build();

        User user2 = User.builder()
                .id(123)
                .nome("Frederico")
                .endereco("Rua do bla")
                .build();

        if (user.equals(user2)) { // hashcode e equals está sobreecrito para id apenas
            System.out.println("Equals é iqual");
        }

        if(user == user2) { // só sera true se user2 apontar para user
            System.out.println("operador == é iqual");
        } else {
            System.out.println("operador == não é iqual");

        }

    }
}
