import java.util.Scanner;
public class test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的会员");
        int price = 1000;
        int vip = sc.nextInt();
        if (vip == 1){
            System.out.println(price*0.9);
        }else if (vip ==2 ){
            System.out.println(price*0.8);
        }else if (vip == 3){
            System.out.println(price*0.7);
        }else{
            System.out.println(price);
        }

        
    }
}
