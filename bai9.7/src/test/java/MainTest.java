
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void testMultiply() {
        Main app = new Main();
        assertEquals(20, app.multiply(4, 5));
        assertEquals(0, app.multiply(0, 10));
    }
}