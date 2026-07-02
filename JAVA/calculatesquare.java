
import java.util.Scanner;
public class calculatesquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入大于等于二的整数");
        int num = sc.nextInt();
        //题目要求num的平方根，不用直接求平方根的运算符
        //一个一个试
        //循环能涵盖所有要试的数
        //试对了就输出
        int i = 1;
        while (true) {
            if (i*i== num) {
                //平方根为整数，=恰好
                //平方根不为整数，<不好限定，>要限定在刚大于，然后去i-1
                System.out.println(i+"就是"+num+"的平方根");
            }else if (i*i>num) {
                System.out.println(i-1);
                break;
            }
            i++;
        }
        //题目还要求平方根只保留整数，小数部分被舍去
        //第一想法是试的数换成小数，然后输出再取整数
        //不用这么麻烦啊，开始用的整数的平方算完后=num这个整数就是我们要的
        //>num,数就是前一个
        //<num的太多了，不好限制
    }
    
}
