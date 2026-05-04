import java.nio.file.Path;
import java.nio.file.Paths;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    /**
     * Lấy đường dẫn file an toàn cho mọi hệ điều hành.
     * Sử dụng java.nio.file.Path (Refactor từ Bài 4).
     */
    public static String getSafePath(String folder, String file) {
        Path path = Paths.get(folder, file);
        String result = path.toString();
        logger.info("Generated path: {}", result);
        return result;
    }

    public static void main(String[] args) {
        logger.info("BankSystem is starting...");
        String configPath = getSafePath("config", "settings.txt");
        System.out.println("Path: " + configPath);
    }
}