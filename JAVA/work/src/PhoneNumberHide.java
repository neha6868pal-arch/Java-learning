import java.util.Scanner;

public class PhoneNumberHide {
    static void main() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入手机号码");
            String phoneNumber = sc.nextLine();
            if (phoneNumber.length() != 11) {
                System.out.println("非有效号码，请重新输入");
            } else {
                //要是没有这个方法，我就前后循环，中间直接加“****”
                String start = phoneNumber.substring(0, 3);//返回的是截取的，不改变原来的
                String end = phoneNumber.substring(7);//两个参数，包头不包尾；一个参数，从参数到尾
                System.out.println(start + "****" + end);
                break;
            }
        }
    }
}

