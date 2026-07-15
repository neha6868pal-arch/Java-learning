import java.util.Scanner;

public class AdjustString {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        //A的旋转操是把最左边的字符移到最右边，若干次调整后，A能变B，就返回true，不能就false
        System.out.println("请输入A");
        String A = sc.next();//"abcd"
        System.out.println("请输入B");
        String B = sc.next();
        System.out.println(adjust(A,B));
        //两个A能把所有可能的情况都包进去了，相当于在两个A上平移查找
    }
    public static boolean adjust(String A,String B){
        if (A.length()!=B.length()){
            return false;
        }
        if (A.equals(B)){
            return  true;
        }
        for (int i = 0; i < A.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i+1; j <A.length() ; j++) {
                sb.append(A.charAt(j));
            }
            for (int j = 0; j <=i; j++) {
                sb.append(A.charAt(j));
            }
            if (sb.toString().equals(B)){
                return true;
            }
        }
        return false;
    }
}
