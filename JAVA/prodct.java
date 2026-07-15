import java.util.Scanner;

public class prodct {
    public static void main(String[] args){
      //算两个字符串形式的非负整数，返回乘积，以字符串的形式
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字1");
        String num1 = sc.next();
        int number1 = getNumber(num1);
        System.out.println("请输入数字2");
        String num2 = sc.next();
        int number2 = getNumber(num2);
        String result = "这是字符串"+number1*number2;
        System.out.println(result);
    }
    public static int getNumber(String str){
        int progress = 0;
        for (int i = 0; i < str.length(); i++) {
            progress = progress*10+(str.charAt(i)-48);
        }
        return progress;
    }
}
