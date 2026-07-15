import javax.swing.*;
import java.sql.ResultSet;
import java.util.Scanner;

public class RomanNumerals {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //要求只能录入数字，将内容变成罗马数字
        //数字转换想数组
        StringBuilder sb = new StringBuilder();
//        String[] arr = {"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        char[] arr = {'\0','Ⅰ','Ⅱ','Ⅲ','Ⅳ','Ⅴ','Ⅵ','Ⅶ','Ⅷ','Ⅸ'};
        System.out.println("请输入数字");
        sb.append(sc.nextLine());
        String result = "";
        for (int i = 0; i < arr.length; i++) {
             result = sb.toString().replace('i',arr[i]);//因为前面替换的是小写字母i，而非我想要的数字
        }
        System.out.println(result);
        //为什么
        //因为result是局部变量，每次循环都会重新定义，所以只能输出最后一个结果，而不是每次循环的结果
    }
}
