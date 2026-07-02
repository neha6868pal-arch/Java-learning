import java.util.Scanner;
public class test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字回文数");
        //回文数正着看反着看一样，所以先拆后拼
        int i = sc.nextInt();
        int x = i;
        int number = 0;
        while (i != 0 ) {
           int ge = i % 10;
           i = i / 10;
           number = number*10 + ge;
           //因为利用上循环了，要在循环里拼接，所以按循环的思路怎么拆的怎么拼
           //每次/10的拆，就每次*10的拼
           //储存的*10再相加         
        }
       System.out.println(number == x);
    }
}
