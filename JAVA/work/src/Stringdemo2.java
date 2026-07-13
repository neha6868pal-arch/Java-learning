public class Stringdemo2 {
    static void main() {
        String s1 = new String("abc");
        String s2 = "abc";
        System.out.println(s1 == s2);

        System.out.println(s1.equals(s2));//区分字母大小写，必须完全相同

        System.out.println(s1.equalsIgnoreCase(s2));//不区分字母大小写
    }
}
