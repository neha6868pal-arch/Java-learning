import java.util.Date;
import java.util.Random;

public class demo2 {
    //指定时间后比较哪个在前那个在后
    public static void main(String[] args){
        Random r = new Random();
        Date d1 = new Date(Math.abs(r.nextInt()));
        Date d2 = new Date(Math.abs(r.nextInt()));
        System.out.println(d1);
        System.out.println(d2);
        long time1 = d1.getTime();
        long time2 = d2.getTime();
        String result = time1>time2?"第一个":"第二个";
        System.out.println(result+"更大");
    }
}
