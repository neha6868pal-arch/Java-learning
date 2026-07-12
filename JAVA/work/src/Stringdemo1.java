public class Stringdemo1 {
    static void main() {
        String s1 = new String();
        System.out.println("1"+s1+"2");
        char[] ch = {'H','e','l','l','o'};
        String s2 = new String(ch);//把字符数组转换为字符串，可实现字符串的本身变化
        System.out.println(s2);
        byte[] b = {97,98,99,100};
        String s3 = new String(b);//把字节数组转换为字符串,网络中数据传输的是字节，接收到字节数据后需要转换为字符串
        System.out.println(s3);
    }
}
