import java.util.Random;
import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.println("请输入你要猜的数字");
            int guess = sc.nextInt();
            count++;
            if (count==3) {
                System.out.println("回答正确");
                break;
            }
            if (guess<number) {
            System.out.println("比你想的要大哦");
             }else if (guess>number){
            System.out.println("比你想的要小哦");
             }else{
            System.out.println("回答正确");
            break;
          }
        } 
        //最开始想的是不相等就进入循环，相当于多了没必要的一步
        //忘了无限循环+跳出来的组合了
        //反正每次都是这三个组合，每次都是正确就跳出来
    }
}
//拓展1
//把随机数也包进循环
//每猜一次，猜对的概率都是1/100.猜完一次都要再猜新的数
//拓展2：增加保底机制,比如回答三次就提示正确
//引入计数的(因为没有i能直接用)
//计数满足，就执行。所以要在其他一切条件之前
//还要加break，防止把下面也输出了