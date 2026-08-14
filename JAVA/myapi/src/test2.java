import java.util.Arrays;

public class test2 {
    public static void main(String[] args){
        //不死神兔
        //从出生后第三个月开始，每个月都会生一对兔子
        int month = 12;
        //每个月记录当前的兔子对数
        int[] rabbit = new int[month];
        for (int i = 0; i < rabbit.length; i++) {
            rabbit[i] = rabbitNumber(i);
        }
        System.out.println("每个月的兔子对数为："+Arrays.toString(rabbit));
    }


    public static int rabbitNumber(int month){
        if (month == 0 || month == 1){
            return 1;
        }else {
            //每隔两个月生一对兔子
            return rabbitNumber(month - 1) + rabbitNumber(month - 2);
        }
    }
}
