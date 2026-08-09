import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) throws ParseException {
      //请使用代码实现计算你活了多少天
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的出生日期（格式：yyyy-MM-dd）");
        String birthDateString = sc.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birthDate = dateFormat.parse(birthDateString);
        Date currentDate = new Date();
        long timeDifference = currentDate.getTime() - birthDate.getTime();
        long daysLived = timeDifference / (24 * 60 * 60 * 1000);
        System.out.println("你活了" + daysLived + "天");
        System.out.println("-----------------");
        LocalDate l1 = LocalDate.of(2000, 1, 1);
        LocalDate l2 = LocalDate.now();
        long daysBetween = ChronoUnit.DAYS.between(l1, l2);
        System.out.println("2000年1月1日到今天一共有" + daysBetween + "天");
    }
}
