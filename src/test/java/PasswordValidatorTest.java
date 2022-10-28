import de.neufische.PasswordValidator;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordValidatorTest {

    @Test
    public void testGetLengthOfPassword()
    {
        boolean expected = true;
        boolean actual = PasswordValidator.isPasswordLongEnough("Hello03jewrewrewer");
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
