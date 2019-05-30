import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author zhengfawei
 * @create 2019-03-26 下午4:17
 * @desc
 **/
public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        int dayOfMonth = now.getDayOfMonth();
        System.out.println(dayOfMonth);
        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        String format = formatter.format(now);
        System.out.println(format);
    }
}
