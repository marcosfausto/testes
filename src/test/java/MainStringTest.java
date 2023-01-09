import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.StringJoiner;

import static org.junit.jupiter.api.Assertions.*;

public class MainStringTest {

    @Test
    public void testArrayString() {
        String[] parts = "john,peter,mary".split(",");
        String[] parts2 = { "john", "peter", "mary" };
        assertArrayEquals(parts,parts2);
    }

    @Test
    public void testStringJoiner() {
        StringJoiner joiner = new StringJoiner(",", "[", "]");
        joiner.add("Red")
                .add("Green")
                .add("Blue");

        assertEquals("[Red,Green,Blue]", joiner.toString());
    }

    @Test
    public void testStringIntern() {
        String s1 = "Baeldung";
        String s2 = new String("Baeldung");
        String s3 = new String("Baeldung").intern(); // intern cria uma copia do objeto na heap
        assertNotSame(s1, s2);
        assertSame(s1, s3);
    }

    @Test
    public void testStringFormat() {
        String title = "Baeldung";
        String formatted = String.format("Title is %s", title);
        assertEquals("Title is Baeldung", formatted);
    }


}
