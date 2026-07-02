import java.util.Scanner;
public class feng7guo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入开始数字");
        int start = sc.nextInt();
        while (start<= 100) {
            if (start%7 == 0||start%10 ==7||start/10%10 ==7) {
                System.out.println("过");
            }else{
                System.out.println(start);
            }
        
            start++;
            
        }

    }
}
