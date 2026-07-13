import java.util.Scanner;

public class StringDemo6 {
    static void main() {
        //字符串反转
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        String result = reverse(str);
        System.out.println(result);
    }

    static String reverse(String str) {
        String result = "";//空字符串只能不填，不能写full
        for (int j=str.length()-1; j>=0; j--) {
            result += str.charAt(j);
        }
        return result;
    }
}
