import java.util.Scanner;

public class planeTicket {
    public static void main(String[] args) {
        //机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
        //按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价");
        int price = sc.nextInt();
        System.out.println("请输入月份");
        int month = sc.nextInt();
        if (month<1||month>12) {
            System.out.println("没有这个月份");
            return;
        }
        System.out.println("请输入您的舱");
        //我这里是直接输入字符串了，也可以在前面的提示里赋予字符串数字，下面就用数字来判定
        String planeType = sc.next();//读到空格就停止，适合单个内容；nextLine是读整行所有内容
        if (!planeType.equals("经济舱")&&!planeType.equals("头等舱")) {//不满足前面加！，都不满足用&连接
            System.out.println("没有这个舱");
            return;
        }
        if (month>=5 && month<=10) {
            int result = discount(price, planeType, 0.85, 0.9);
            System.out.println(result);
        }else {
            int result = discount(price, planeType, 0.65, 0.7);
            System.out.println(result);
        }
        
        
    }
    
    //不同季的折扣可以写一个方法，写完发现重复性。可用ctrl+alt+m
    //原来main里用的数据，要写在方法的形参里，要不然数据没给到方法
    //原来小数直接写，且用上了强制转换，所以不用特意定义小数。现在形参要体现出来
    /*if (planeType.equals("经济舱")) {
                price*=0.85;
            }else{
                price*=0.9;
            }*/
    //形参需要所有会用到的数
    public static int discount(int price,String planeType,double price1,double price2) {
        if (planeType.equals("经济舱")) {
            //字符串判断不能用==，判断的是前后字符串的地址，键盘录入的地址和常量池里字符串的地址不一样
            //名.equal:判断是否是对应文字
            //名.contain:判断是否包含
            //名.length：判断长度
                price*=price1;
                return price;
            }else {
                price*=price2;
               return price;
            }
    }
}
