import javax.swing.*;
import java.lang.reflect.AccessFlag;
import java.util.Scanner;

public class RomanNumerals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //要求只能录入数字，将内容变成罗马数字
        //数字转换想数组
        String[] arr = {"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
//        char[] arr = {'\0', 'Ⅰ', 'Ⅱ', 'Ⅲ', 'Ⅳ', 'Ⅴ', 'Ⅵ', 'Ⅶ', 'Ⅷ', 'Ⅸ'};
        while (true){
            System.out.println("请输入数字");
            String num = sc.nextLine();
            boolean flag = checkStr(num);
            if (flag){
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < num.length(); i++) {
                    sb.append(arr[num.charAt(i)-48]);
                }
                System.out.println(sb);
                break;
            }
        }
//        String result = "";
//        for (int i = 0; i < arr.length; i++) {
//            result = sb.toString().replace('i',arr[i]);//因为前面替换的是小写字母i，而非我想要的数字
//        }//这个太逊了，实现不了我想要的效果
//        System.out.println(result);
//     }
    }
    public static boolean checkStr(String num){
        boolean flag = true;
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);//现在遍历出字符，就可以根据ascii表来限定数字
            //怪不得字符有表
            if (c<'0'||c>'9'){//运算中，直接写字符就行，会自动转为int
                flag = false;//判断另一个范围也可以，就是true都不能写在里面，false写在else里，写的要多
            }
        }
        return flag;//也可以不设flag，直接代
//        for (int i = 0; i < num.length(); i++) {
//            char ch = num.charAt(i);
//            if (ch <'0'||ch>'9'){
//                return false;
//            }
//        }
//        return  true;
    }
}
