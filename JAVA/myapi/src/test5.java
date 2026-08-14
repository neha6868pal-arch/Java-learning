public class test5 {
    public static void main(String[] args){
      //20个台阶，每次可以爬1个或2个或3个，问有多少种爬法
        int a=1,b=2,c=4,d=0;
        for (int i = 4; i <= 20; i++) {
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        System.out.println("有"+d+"种爬法");
    }
}
