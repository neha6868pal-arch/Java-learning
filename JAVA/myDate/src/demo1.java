import java.util.Date;

public class demo1 {
    public static void main(String[] args){
      //默认时间后一年
        Date di = new Date(1000L*60*60*24*365);//L提前转化为long
//        long time = di.getTime();
//        time = time + 1000L*60*60*24*365;
//        di.setTime(time);
        System.out.println(di);//di本身是默认时间，传入的是后移时间
    }
}
