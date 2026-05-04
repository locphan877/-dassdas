
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class Main thuc hien các thao tac co ban.
 */
public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public int multiply(int a, int b) {
        logger.info("Dang thuc hien phep nhan: {} x {}", a, b);
        return a * b;
    }
}