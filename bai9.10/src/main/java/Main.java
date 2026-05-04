import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        // Sử dụng Logback Classic thay cho System.out.println
        logger.info("Dự án MathUtils đang khởi động...");
        
        try {
            // Kiểm tra sự hiện diện của Hibernate Core
            Class.forName("org.hibernate.Session");
            logger.info("Thư viện Hibernate 6.2.0.Final đã sẵn sàng.");
        } catch (Exception e) {
            logger.error("Lỗi: Không tìm thấy thư viện cần thiết!");
        }
    }
}