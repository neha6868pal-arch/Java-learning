import java.util.Scanner;

public class practice2 {
    public static void main(String[] args){
      // 自己实现parseInt方法的效果，将字符串形式的数据转成整数。
      // 要求:字符串中只能是数字不能有其他字符.最少一位，最多10位.0不能开头
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入1~10位的数字");
        String regex = "[1-9]\\d{0,9}";
        String number = sc.nextLine();
        if (number.matches(regex)){
            int sum = 0;
            for (int i = 0; i < number.length(); i++) {
                sum = sum*10+(number.charAt(i)-48);
                System.out.println(number.charAt(i)+0);
            }
            System.out.println(sum);
        }else {
            System.out.println("格式错误");
        }

    }
}
