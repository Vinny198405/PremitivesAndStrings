package primitivesAndStringsTests;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class PrimitivesAndStringsTests {
    @Test
    void testInteger() {
        Integer A = 500;
        Integer B = 100;
        Integer C = 500;
        Integer D = 100;
        assertEquals(A, C);
        assertNotSame(A, C);
        assertEquals(B, D);
        assertSame(B, D);
    }

    @Test
    void testDouble() {
        double a = Double.NaN;
        double b = Double.NaN;
        assertSame(Double.isNaN(a), Double.isNaN(b));
        double pi1 = 3.14;
        double pi2 = 3.1472065;
        assertNotEquals(pi1, pi2, 0.0);
        assertEquals(pi1, pi2, 0.01);
    }

    @Test
    void testString() {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        assertSame(str1, str2);
        assertNotSame(str1, str3);
        assertEquals(str1, str3);
    }

    @Test
    void  testStr(){
        int[] ar = {18, 713710, 633834};
        StringBuilder str = new StringBuilder();
        for (int num: ar){
            str.append(Integer.toString(num, 32)).append(" ");
        }
        System.out.println(str);
    }
}
