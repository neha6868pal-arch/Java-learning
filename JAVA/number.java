import java.util.Scanner;
public class number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int num = sc.nextInt();
        //判断是否为质数（只能被1和其本身整除,1不是质数）
        //利用循环把所有数都试了
        //一旦能被其他数整除，就是合数
        int i = 2;
        //如果i=1，则一定满足，在限定条件之外
        int count = 0;
        while (i <=num) {
            if (i < num && num%i ==0) { 
                count++;
            }
            i++;
        }
        if (count!=0) {
            System.out.println(num+"为合数");
        }else{
            System.out.println(num+"为质数");
        }
        //判定不能放循环里面
        //无法做到一出现被其他数整除的情况就输出，且在此之前不输出
        //无法做到累计判断结果，直到所有都判断完再输出
        //每一个都会判定然后就会输出
        //要想做到最后再输出，需要中间过程
    }
}
//还有一种中间过程
//先假设 flag= true（标记思想）
//中间判定合数的时候改为false，没判定到就不动
//最后看是true还是false

//有一个优化思想，在数比较大的时候
//假定a*b = num
//必定有一个数字>=num的平方根
//另外一个数<=num的平方根
//那么结果的判定就可以缩小到i<= num的平方根，减少循环次数