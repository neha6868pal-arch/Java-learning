import java.util.Scanner;
public class test623 {
    public static void main(String[] args) {
        //不用乘除模的运算符，计算除法
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被除数");
        float n1 = sc.nextFloat();
        System.out.println("请输入除数");
        float n2 = sc.nextFloat();
        int count = 0;
        while (n1 >= n2) {
            float i = n1 - n2;
            n1 = n1 - n2;
            count++;
            
        }
        System.out.println(count);
        System.out.println(n1);

     
    }
}
