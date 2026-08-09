import java.util.Calendar;
import java.util.Scanner;

public class practice5 {
    public static void main(String[] args){
      //判断任意的一个年份是闰年还是平年要求:用JDK7和JDK8两种方式判断提示:二月有29天是闰年一年有366天是闰年
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份");
        int year = sc.nextInt();
        Calendar c = Calendar.getInstance();
        c.set(year,3,1);
        c.add(Calendar.DAY_OF_MONTH,-1);
        if (c.get(Calendar.DAY_OF_MONTH) == 28){
            System.out.println(year + "年是平年");
        } else {
            System.out.println(year + "年是闰年");
        }
    }
}
