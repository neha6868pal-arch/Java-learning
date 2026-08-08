import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Date;
import java.util.Set;

public class demo3 {
    public static void main(String[] args){
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date d = new Date(36000000L);
        String str = sdf.format(d);
        System.out.println(str);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
        String str2 = sdf2.format(d);
        System.out.println(str2);

    }
}
