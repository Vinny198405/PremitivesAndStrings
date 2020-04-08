package stringsAndImmutableMutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringsAndBuilder {
    @Test
    void testStringReplace() {
        String str = "Hello";
        str = str.replace("l", "*");
        assertEquals("He**o", str);
    }

    @Test
    void testStringBuilder() {
        StringBuilder str = new StringBuilder("Hello");
        str.replace(2, 4, "**");
        assertEquals("He**o", str.toString());
    }
}
