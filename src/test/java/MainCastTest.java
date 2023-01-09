import cast_test.Professor;
import cast_test.ProfessorDeFisica;
import cast_test.ProfessorDeMatematica;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class MainCastTest {

    @Test
    public void whenExceptionThrown_thenAssertionSucceeds() {
        assertThrows(ClassCastException.class, () -> {
            List<Professor> professors = new ArrayList<>(Arrays.asList(new ProfessorDeFisica(),new ProfessorDeMatematica()));
            for (Professor professor: professors) {
                ProfessorDeFisica professorDeFisica = (ProfessorDeFisica) professor; // will throw ClassCastException
            }
        });
    }

//    @Test
//    public void whenExceptionThrown_thenAssertionSucceeds2() {
//        assertThrows(ClassCastException.class, () -> {
//            ClassB classB = (ClassB) new ClassA();
//        });
//    }

//    @Test
//    public void whenExceptionThrown_thenAssertionSucceeds3() {
//        assertThrows(ClassCastException.class, () -> {
//            ClassA classB = (ClassB) new ClassA();
//        });
//    }
}
