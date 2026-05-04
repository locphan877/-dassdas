import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void testAdd() {
        Main app = new Main();
        assertEquals(5, app.add(2, 3));
    }

    // Ham main de chay nhanh tren IDE theo y cua Loc
    public static void main(String[] args) {
        Main app = new Main();
        System.out.println("Chay thu test add(2,3): " + (app.add(2,3) == 5 ? "PASS" : "FAIL"));
    }
}