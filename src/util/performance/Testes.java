package util.performance;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import util.JoinStringsImplBuilder;
import util.JoinStringsImplString;

class Testes {
    private String[] strings = {"Hello", "World!"};
    private String delimiter = " ";
    private String result = "Hello World!";

    @Test
    void builderTest()
    {
        JoinStringsImplBuilder str = new JoinStringsImplBuilder();
        assertEquals(result, str.join(strings, delimiter));
    }

    @Test
    void concatenationTest()
    {
        JoinStringsImplString str = new JoinStringsImplString();
        assertEquals(result, str.join(strings, delimiter));
    }
}
