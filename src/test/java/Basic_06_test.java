import org.bcit.comp2522.midterm.bonus.Basic_05_BadPasswordException;
import org.bcit.comp2522.midterm.bonus.Basic_05_Password;
import org.bcit.comp2522.midterm.bonus.Basic_05_WrongPasswordException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Basic_06_test {

    private Basic_05_Password password;

    @BeforeEach
    public void setUp() {
        password = new Basic_05_Password("password");
    }

    @Test
    public void testConstructingBadPassword() {
        Assertions.assertThrows(Basic_05_BadPasswordException.class, () -> {
            Basic_05_Password password = new Basic_05_Password("pass");
        });
    }

    @Test
    public void testConstructingGoodPassword() {
        Assertions.assertDoesNotThrow(() -> {
            Basic_05_Password password = new Basic_05_Password("password");
        });
    }

    @Test
    public void testSettingBadPassword() {
        Assertions.assertThrows(Basic_05_BadPasswordException.class, () -> {
            password.setPassword("pass");
        });
    }

    @Test
    public void testSettingGoodPassword() {
        Assertions.assertDoesNotThrow(() -> {
            password.setPassword("newPassword");
        });
    }

    @Test
    public void testCheckingIncorrectPassword() {
        Assertions.assertThrows(Basic_05_WrongPasswordException.class, () -> {
            password.correctPassword("passwordBad");
        });
    }

    @Test
    public void testCheckingCorrectPassword() {
        Assertions.assertDoesNotThrow(() -> {
            password.correctPassword("password");
        });
    }
}
