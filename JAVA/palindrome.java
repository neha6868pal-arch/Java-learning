import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
      //用StringBuilder重写回文数
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        String number = sc.nextLine();
        if (sb.append(number).reverse().toString().equals(number)){
            System.out.println("是");
        }else {
            System.out.println("不是");
        }
    }
}
