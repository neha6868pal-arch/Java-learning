import java.util.Scanner;

public class judge {
    public static void main(String[] args){
      //输入一句话，判断最后一个单词的长度
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一句话");
        String sentence = sc.nextLine();//句子里包含空格，要用line的，否则一道空格就截止
        int count = 0;
        for (int i = sentence.length()-1; i >0 ; i--) {
            if (sentence.charAt(i) == ' ') {
                break;
            }
            count++;
        }
        System.out.println("最后一个单词的长度是：" + count);
    }
}
