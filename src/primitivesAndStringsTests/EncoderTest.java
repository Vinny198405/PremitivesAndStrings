package primitivesAndStringsTests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EncoderTest {

    @Test
    void testCode (){
        Encoder encoder = new Encoder("9876543210");
        assertEquals("876", encoder.code(123));
        Encoder encoder1 = new Encoder("+-");
        assertEquals("-+-",encoder1.code(5));
    }

    @Test
    void testDecode (){
        Encoder encoder = new Encoder("9876543210");
        assertEquals(123, encoder.decode("876"));
        Encoder encoder2 = new Encoder("9876543210");
        assertEquals(-1, encoder2.decode("+76"));
        Encoder encoder1 = new Encoder("+-");
        assertEquals(5,encoder1.decode("-+-"));
    }
}
