import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {
    private static final Logger logger = LoggerFactory.getLogger(MathUtilsTest.class);

    @Test
    void testExample() {
        logger.info("Dang chay test cho du an MathUtils...");

        // Phep thu don gian: 1 + 1 phai bang 2
        int result = 1 + 1;
        assertEquals(2, result, "Phep toan phai ra ket qua la 2");

        logger.info("Test hoan thanh, moi thu deu on!");
    }
}