import java.util.Scanner;

public class wordReplacement {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        String sentence = sc.next();
        //定义敏感词库
        String[] arr = {"TMD","CNM","SB","MLGB","敏感词","c"};
        for (int i = 0; i < arr.length; i++) {
            sentence = sentence.replace(arr[i],"***");
            //方法包含了旧的的识别
            //是换完对应值后的整体，是一个新的字符串
        }   //可以用原变量名承接
        System.out.println(sentence);
    }
}
