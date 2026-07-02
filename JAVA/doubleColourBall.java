import java.util.Random;
import java.util.Scanner;

public class doubleColourBall {
    public static void main(String[] args) {
        //双色求系统:投注号码由6个红色球号码和一个蓝色球号码组成
        //红色球号码从1~33中选择；蓝色号码从1~16中选择
        //一等奖：6+1，最高1000万
        //二等奖：6+0，最高500万
        //三等奖：5+1，3000元
        //四等奖：5+0/4+1，200元
        //五等奖：4+0/3+1，10元
        //六等奖：2+1/1+1/0+1，5元
        //随机生成中奖号码(红蓝写一个方法里，长度为7)，
        int []prizePool = prize();
        /*for (int i = 0; i < prizePool.length; i++) {
            System.out.println(prizePool[i]);
        }*/

        // 用户输入中奖号码，键盘输入，循环后存进数组
        int []user =user();

        // 判断中奖情况，用户的每一个红数是否能在奖池的前六个里找到一致的，一致red++，最后一个数是否等于奖池最后一个
        int red = 0;
        int blue = 0;
        for (int i = 0; i < user.length-1; i++) {
            for (int j = 0; j < 6; j++) {
                if (user[i]==prizePool[j]) {
                    red++;
                    break;
                }
            }
        }
        if (user[6]==prizePool[6]) {
            blue++;
        }
        if (red==6&&blue==1) {
            System.out.println("恭喜您中了一等奖,1000万");
        }else if (red==6&&blue==0) {
            System.out.println("恭喜您中了二等奖，500万");
        }else if (red==5&&blue==1) {
            System.out.println("恭喜您中了三等奖，3000");
        }else if ((red==5&&blue==0)||(red==4&&blue==1)) {
            System.out.println("恭喜您中了四等奖,200");
        }else if ((red==4&&blue==0)||(red==3&&blue==1)) {
            System.out.println("恭喜您中了五等奖,10");
        }else if ((red==2&&blue==1)||(red==1&&blue==1)||(red==0&&blue==1)) {
            System.out.println("恭喜您中了六等奖,5");
        }else{
            System.out.println("恭喜您，没有中奖");
        }
    }
    public static int[] prize() {
        int [] prizePool = new int[7];
        Random r = new Random();
        for (int i = 0; i < prizePool.length-1; ) {
            /*prizePool[i] = r.nextInt(33)+1; 
            //解决红球不能重复的问题
            if(i>0){
                int count = 0;
                for (int j = 0; j < i; j++) {
                     if (prizePool[i]==prizePool[j]) {//一开始就混在一起了，搞复杂了
                     count++;
                    }
                }
                if (count==0) {
                    i++;
                }
             }else{
                   i++;
                }*/
           int tempnumber = r.nextInt(33)+1;
           boolean temp = judge(prizePool, tempnumber);
           if (!temp) {
               prizePool[i]=tempnumber;
               i++;
           }

        }
        prizePool[6]= r.nextInt(16)+1;
        return prizePool;
    }
    public static boolean judge(int[]prizePool,int tempnumber) {
        for (int i = 0; i < prizePool.length; i++) {
            if (prizePool[i]==tempnumber) {
                return true;
            }
        }
        return false;
    }
    public static int[] user() {
        Scanner sc = new Scanner(System.in);
        int []user = new int[7];
        for (int i = 0; i < 7; ) {
            if (i<6) {
                System.out.println("请输入您选择的第"+(i+1)+"个红球号码");
                int tempmumber= sc.nextInt();
                if (tempmumber>=1&&tempmumber<=33) {
                    boolean temp = judge(user, tempmumber);//用户也要判断不重复
                    if (!temp) {
                        user[i]=tempmumber;
                        i++;
                    }else{
                        System.out.println("当前红球号码已经存在，请重新输入");
                    }
                }else{
                System.out.println("号码无效，请重新输入");
                }
            }else{
                System.out.println("请输入您的蓝球号码");
                user[6]=sc.nextInt();
                if (user[i]>=1&&user[i]<=16) {
                i++;
                }else{
                System.out.println("号码无效，请重新输入");
                }
            }
            
        }
        return user;
    }
}
