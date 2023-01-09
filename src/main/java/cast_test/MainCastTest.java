package cast_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainCastTest {
    public static void main(String[] args) {
        List<Professor> professors = new ArrayList<>(Arrays.asList(new ProfessorDeFisica(),new ProfessorDeMatematica()));

        for (Professor professor: professors) {
            ProfessorDeFisica professorDeFisica = (ProfessorDeFisica) professor;
            professorDeFisica.ensinar();
        }
    }
}
