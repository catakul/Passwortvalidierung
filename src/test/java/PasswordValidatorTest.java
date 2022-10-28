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
    public void testNotGetLengthOfPassword()
    {
        boolean expected = false;
        boolean actual = PasswordValidator.isPasswordLongEnough("Hello");
        assertEquals(expected,actual);
    };

    @Test
    public void testContainsStringLetters()
    {
        boolean expected = true;
        boolean actual = PasswordValidator.containsLetters("StringWithoutNumers");
        assertEquals(expected,actual);
    };
    
    @Test
    public void testNotContainsStringLetters()
    {
        boolean expected = false;
        boolean actual = PasswordValidator.containsLetters("1234567890");
        assertEquals(expected,actual);
    };

    @Test
    public void testContainsNumbers()
    {
        boolean expected = true;
        boolean actual = PasswordValidator.containsNumbers("StringWith12345");
        assertEquals(expected,actual);
    };
    
    @Test
    public void testNotcontainsNumbers()
    {
        boolean expected = false;
        boolean actual = PasswordValidator.containsNumbers("StringWithoutNumers");
        assertEquals(expected,actual);
    };
    
    @Test
    public void testIsSimple()
    {
        boolean expected = true;
        boolean actual = PasswordValidator.isSimple("StringWith123456");
        assertEquals(expected,actual);
    };
    
    @Test
    public void testIsNotSimple()
    {
        boolean expected = false;
        boolean actual = PasswordValidator.isSimple("StringWithoutNumers");
        assertEquals(expected,actual);
    };
    
    
}
