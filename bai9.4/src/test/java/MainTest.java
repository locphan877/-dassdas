import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import java.io.File;

public class MainTest {

    @Test
    void testPathCompatibility() {
        // Chạy hàm xử lý đường dẫn từ class Main
        String result = Main.getSafePath("data", "user.db");

        // Kiểm tra xem nó có chứa dấu gạch tương ứng với OS không
        // Windows là \, Linux/Mac là /
        String expectedSeparator = File.separator;
        
        assertTrue(result.contains(expectedSeparator), 
            "Lỗi: Đường dẫn không tương thích với hệ điều hành này!");
    }

    @Test
    void testLogicExample() {
        // Một test đơn giản khác để đảm bảo JUnit hoạt động
        assertTrue(1 > 0);
    }
}