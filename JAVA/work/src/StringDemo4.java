import java.util.Scanner;

public class StringDemo4 {
    static void main() {
        //遍历字符串，索引对应字符串里每个字符
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.nextLine();
        int length = str.length();//跟数组长度不同，后面多了个方法()
        for (int i = 0; i < length; i++) {
            System.out.print(str.charAt(i)+" ");
        }
        //统计大写字母、小写字母、数字出现次数
        //因为遍历后得到字符，这是一系列操作的前提
        //字母可以转换成ASCII码来判断，但需要先转换成数字——>这个过程是计算时自动的
        int capital = 0;
        int lowercase = 0;
        int number = 0;
        int other = 0;
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if (a >= 'A' && a <= 'Z'){//char在计算过程中会自动提升为int,所以可以直接比较字符
                capital++;
            }else if (a >= 'a' && a <= 'z'){
                lowercase++;
            }else if (a >= '0' && a <= '9'){//ascii表里的数字对应的不是实际的数字，所以数字要写成字符形式
                number++;
            }else{
                other++;
            }
        }
        System.out.println();
        System.out.println("大写字母有"+capital+"个，小写字母有"+lowercase+"个，数字有"+number+"个,汉字有"+other+"个");
    }
}
