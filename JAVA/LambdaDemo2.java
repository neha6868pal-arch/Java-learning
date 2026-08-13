import java.util.Arrays;

public class LambdaDemo2 {
    public static void main(String[] args){
      //根据数组长度排序
        String[] arr = {"aa","bbb","cccc","dd","ee","f"};
        Arrays.sort(arr,(String s1,String s2)->s1.length()-s2.length());
        System.out.println(Arrays.toString(arr));
    }
}
