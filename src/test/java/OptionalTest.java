import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionalTest {
    @Test
    public void givenNonNull_whenCreatesNullable_thenCorrect() {
        String name = "baeldung";
        Optional<String> opt = Optional.ofNullable(name);
        assertTrue(opt.isPresent());
        assertFalse(opt.isEmpty());
        assertEquals(name,opt.get());
    }

    @Test
    public void whenOrElseWorks_thenCorrect() {
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElse("john");
        assertEquals("john", name);
    }

    @Test
    public void whenOrElseThrowWorks_thenCorrect() {
        String nullName = null;
//        try {
//            String name = Optional.ofNullable(nullName).orElseThrow(
//                    IllegalArgumentException::new);
//        } catch (IllegalArgumentException e) {
//            assertEquals(e.toString(),"java.lang.IllegalArgumentException");
//        }
        assertThrows(IllegalArgumentException.class, () -> Optional.ofNullable(nullName).orElseThrow(IllegalArgumentException::new));
    }
}
