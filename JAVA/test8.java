import java.util.Scanner;
public class test8 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("请输入星期");
         int weekday = sc.nextInt();
         if (weekday>=1 && weekday<=7) {
          
            if (weekday>=1 && weekday<=5) {
                System.out.println("工作日");
            
            }else{
                System.out.println("休息日");
         }
    }
   
        }

    
    
}
