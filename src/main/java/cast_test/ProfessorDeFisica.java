package cast_test;

import cast_test.Professor;

public class ProfessorDeFisica implements Professor {
    @Override
    public void ensinar() {
        System.out.println("Ensina Fisica");
    }
}
