import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    Main app = new Main();

    @Test
    void testSquare() {
        assertEquals(16, app.square(4));
    }

    @Test
    void testCheckNumber() {
        assertEquals("Positive", app.checkNumber(10));
        assertEquals("Negative", app.checkNumber(-5));
        assertEquals("Zero", app.checkNumber(0));
    }
}