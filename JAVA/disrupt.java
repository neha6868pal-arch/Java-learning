import java.util.Random;
import java.util.Scanner;

public class disrupt {
    public static void main(String[] args){
      //键盘输入任意内容，打乱里面的内容
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        String casual = sc.next();
        char [] arr = casual.toCharArray();
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            char temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        String result = new String(arr);
        System.out.println(result);
    }
}
