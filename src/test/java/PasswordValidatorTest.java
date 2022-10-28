import de.neufische.PasswordValidator;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordValidatorTest {

    @Test
    public void testGetLengthOfPassword()
    {
        int expected = 5;
        int actual = PasswordValidator.getLengthOfPassword("Hello");
        assertEquals(expected,actual);
    };

    @Test
    public void testIsStringWithLetters()
    {
        boolean expected = true;
        boolean actual = PasswordValidator.isStringWithLetters("Hello");
        assertEquals(expected,actual);
    };
}
