import java.util.Random;
import java.util.Scanner;

public class IDnumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的出生年份");
        String year = sc.nextLine();
        System.out.println("请输入您的出生月份,");
        String month = sc.nextLine();
        System.out.println("请输入您的出生日期，两位数");
        String date = sc.nextLine();
        Random r = new Random();
        while (true){
            System.out.println("请输入您的性别");
            String gender = sc.nextLine();
            if (gender.equals("男")){
                while (true){
                    int male = r.nextInt(0,10);
                    if (male%2!=0){
                        int number = r.nextInt(0,10);
                        System.out.println(year+month+date+male+number);
                        break;
                    }
                }
                break;
            }else  if(gender.equals("女")){
                while (true){
                    int female = r.nextInt(0,10);
                    if (female%2==0){
                        int number = r.nextInt(0,10);
                        System.out.println(year+month+date+female+number);
                        break;
                    }
                }
                break;
            }else {
                System.out.println("性别无效，请重新输入");
            }
        }
    }
}
