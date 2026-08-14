public class test4Method2 {
    public static void main(String[] args){
      //20个台阶，每次可以爬1个或2个，问有多少种爬法
        //递归
        System.out.println(climbStairs(20));
    }
    public static int climbStairs(int n) {
        //按方法，两个台阶的时候有一种爬法
        //实际上两个台阶的时候有2种爬法
        //所以要单拎出来
        if (n == 1) return 1;
        if (n == 2) return 2;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
