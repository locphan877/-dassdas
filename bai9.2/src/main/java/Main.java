import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Lớp chính để chạy chương trình
public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Hệ thống ngân hàng đang khởi động...");
        
        BankService service = new BankService();
        service.transfer("ACC123", "ACC456", 500.0);
    }
}

// Các class hỗ trợ có thể viết liền phía dưới (không để public)
class BankService {
    private static final Logger logger = LoggerFactory.getLogger(BankService.class);

    public void transfer(String from, String to, double amount) {
        logger.debug("Đang xử lý chuyển khoản từ {} sang {} số tiền {}", from, to, amount);
        
        if (amount <= 0) {
            logger.error("Giao dịch thất bại: Số tiền không hợp lệ ({})", amount);
            return;
        }
        
        // Giả định logic thành công
        logger.info("Giao dịch thành công: {} đã chuyển {} cho {}", from, amount, to);
    }
}