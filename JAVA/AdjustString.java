import java.util.Scanner;

public class AdjustString {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        //A的旋转操是把最左边的字符移到最右边，若干次调整后，A能变B，就返回true，不能就false
        System.out.println("请输入A");
        String A = sc.next();//"abcd"
        System.out.println("请输入B");
        String B = sc.next();
        System.out.println(check(A,B));

    }
    public static boolean check(String A,String B){
        for (int i = 0; i < A.length(); i++) {
            A = adjust(A);//新的用原变量承接，这样就在此基础上再进行了
            if (A.equals(B)){
                return true;
            }
        }
        return false;
    }
    public static String adjust(String A){
       char[] arr = A.toCharArray();//把字符串转成字符数组
        char temp = arr[0];//拿出来的变量暂存一下
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        String result = new String(arr);//String new出来的空参可填字符、字节（数组）
        return result;
    }
}
