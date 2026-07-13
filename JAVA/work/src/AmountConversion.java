import java.util.Scanner;

public class AmountConversion {
    static void main() {
        //金额转换
        //阿拉伯数字和汉字数字可以用数组来对应，而不是一个一个用if对应
        Scanner sc = new Scanner(System.in);
        char[] numCH = {'零','壹','贰','叁','肆','伍','陆','柒','捌','玖'};//数字对应的转换都去想数组
        while (true){
            System.out.println("请输入您的金额：");
            String amount = sc.nextLine();
            int num = Integer.parseInt(amount);
            if (num>=0&&num<=9999999){
                char[] result = {'零','零','零','零','零','零','零'};
                //我是想着先占位后替换
                //老师是用字符串滚雪球，先把数字滚出来，再补上前面的0
                //这样就用int接收，且不需要长度
                //拼接后的字符串长度就知道了，再用（7-长度）——>循环前面补零
                for (int i =amount.length() -1,j=result.length-1; i >=0 ; i--,j--) {
                    result[j] = numCH[num%10];
                    num/=10;
                }
                System.out.println(result[0]+"佰"+result[1]+"拾"+result[2]+"万"+result[3]
                        +"仟"+result[4]+"佰"+result[5]+"拾"+result[6]+"元");
                //数字与单位是对应的，个数相同——>再给单位创一个数组，一起遍历
                break;
            }else {
                System.out.println("金额无效");
            }
        }
    }
}
