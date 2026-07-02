import java.util.Scanner;
public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int number2 = sc.nextInt();
        //给了两个说明，①如果其中一个为6②如果他们的和为6的倍数
        //每个true用Boolean判断
        //所有为true的都写出来，用或链接，因为只要满足一个就为true
        boolean result = number1 == 6 || number2 == 6 || (number1 + number2)%6 == 0;
        System.out.println(result);


    }
}
