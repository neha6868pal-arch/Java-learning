import java.util.Scanner;

public class SringDemo3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String rightName = "原用户名";//因为题目已知正确的用户名和密码，所以需要定义变量
        String rightCode = "123456";
        for (int i = 0; i < 3; i++){
            System.out.println("请输入您的用户名");
            String s = sc.nextLine();
            System.out.println("请输入您的密码");
            String code = sc.nextLine();
            if (s.equals(rightName) && code.equals(rightCode)){//字符串的比较都使用equals方法
                System.out.println("登录成功");
                break;
            }else if(s.equals(rightName)&&!code.equals(rightCode)){
                System.out.println("密码错误,请重新输入，您还剩下"+(2-i)+"次机会");
                if (i==2){
                    System.out.println("您已输入错误3次，账号已锁定");
                }
            }else {
                System.out.println("用户不存在，请先注册，您还剩下"+(2-i)+"次机会");
                if (i==2){
                    System.out.println("您已输入错误3次，账号已锁定");
                }
            }
        }

    }
}
