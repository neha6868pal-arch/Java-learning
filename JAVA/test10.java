import java.util.Scanner;
public class test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入开始");
        int start = sc.nextInt();
        System.out.println("请输入结束");
        int end = sc.nextInt();
        for (int i = start;i<=end;i++){
            if (i%3 ==0 && i%5== 0){
                System.out.println(i);
            }
          

        }
    }
}
