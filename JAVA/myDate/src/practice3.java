import java.util.Scanner;

public class practice3 {
    public static void main(String[] args){
      //定义一个方法自己实现toBinaryString方法的效果，将一个十进制整数转成字符串表示的二进制
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int number = sc.nextInt();
        //除基数取余法：不断地除以基数（几进制基数就是几），直到商为0，然后将所有余数倒序排列，就是该数字的几进制表示。
        String result = toBinary(number);
        System.out.println(result);
    }

    private static String toBinary(int number) {
        String binaryString = "";
        while (number != 0){
            binaryString = number %2+ binaryString;
            number = number /2;
        }
        return binaryString;
    }
}
