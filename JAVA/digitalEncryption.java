import java.util.Scanner;

public class digitalEncryption {
    public static void main(String[] args) {
        //需求：某系统的数字密码（大于0），比如1983，采用加密方式进行传输。
        //先得到每位数;然后每位数都加上5 , 再对10求余;最后将所有数字反转，得到一串新数。

        //键盘输入，得到每位数的数存到数组里(已知长度的好弄，未知的怎么弄呢，可以输入后获取长度)
        //反转也可以在存数组的时候就弄——反向推导
        int[] data = getNumber();

        //加密
        int[] code = encryption(data);

        //得到新数
        for (int i = 0; i < code.length; i++) {
            System.out.print(code[i]);
        }
        
    }
    public static int[] getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的密码");
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
            data[i]= (data[i]+5)%10;
        }
        return data;
    }
}
