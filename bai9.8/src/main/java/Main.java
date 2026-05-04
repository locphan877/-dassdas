import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Ung dung dang khoi chay...");
        System.out.println("--- Day la san pham thuc thi cua Loc ---");
        System.out.println("Lop: UET - VNU");
        logger.info("Ket thuc chuong trinh.");
    }

    public int add(int a, int b) {
        return a + b;
    }
}