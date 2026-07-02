import java.util.Random;
//需求：生成10个1~100之间的随机数存入数组
//1）求出所有数据的和
//2）求出所有数据的平均shu
//3）统计有多少个数比平均数小
public class arrSum {
    public static void main(String[] args) {
        Random r = new Random();
        //要先定义数组，才能存入随机数
        //因为随机数对应动态，不能用静态的直接套
        int []arr = new int[10];
        //之前的随机数只生成一个，现在要10个，而且要存入数组
        //用循环生成10个随机数，利用索引存入数据
        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(100)+1;
            arr[i] = number;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("数组中所有数据的和为"+sum);
       
        int average = sum/ arr.length;
        System.out.println(average);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i< average) {
                count++;
            }
        }
        System.out.println("一共有"+count+"个数据比平均值小");
        //验证数组是否正确
        //删去Sout里的ln代表不换行，再在打印里面加上" "代表空格
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
