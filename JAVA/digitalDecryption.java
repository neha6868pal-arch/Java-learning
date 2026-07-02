import java.util.Scanner;

public class digitalDecryption {
    public static void main(String[] args) {
        int[] data = getNumber();

        //解密，根据加密的思想不完全反推
        //加密是+5%10
        //解密就是+10-5%10，因为每个数单看都是个位，加10保证可以被减，减完后取模就是
        int[] code = encryption(data);

        //得到新数
        for (int i = 0; i < code.length; i++) {
            System.out.print(code[i]);
        }
        
    }
    public static int[] getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被加密后的密码");
        String digital = sc.next();
        if (digital.contains("-")) {
            System.out.println("密码无效");
        }
        int lenth = digital.length();//数组长度一定是数字，必须先拿int接收
        //纯数字接收会有数字溢出，首位丢失的问题，所以要用字符串接收
        int []data = new int[lenth];
        //原来用数字定义可以直接运算，现在是字符串如何转换成数字
        //字符串强转还没学过，学过字符转数字
        //把字符串里的每个数转为字符，再用字符转为数字
        int temp =  Integer.parseInt(digital);
        for (int i = 0; i < data.length; i++) {
            data[i]= temp%10;
            temp/=10;
        }
        return data;
    }

    public static int[] encryption(int[] data) {
        for (int i = 0; i < data.length; i++) {
            data[i]= (data[i]+10-5)%10;
        }
        return data;
    }
    
}
