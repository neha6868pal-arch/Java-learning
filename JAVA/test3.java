public class test3 {
    public static void main(String[] args) {
        //判断101~200之间有多少个素数，并输出所有素数。
        //2~平方根，减少循环次数，平方根后面学
        int numberCount = 0;
        for (int i=101; i<=200 ;i++) {
            boolean flag = true; 
           for (int j = 2;j < i ;j++) {
            //把j改为2，j++放后面就对了——别乱动顺序
            //为什么之前不对。j=1，然后先让j++
            //因为j++把i本身放进来了，除以本身都会是
            if (i%j==0) {
                flag = false;
                break;//省去多余的循环
            }
           }
           if (flag) {
            System.out.println(i);
            numberCount++;
           }
        }
        System.out.println("素数的数目"+numberCount);
    }
}
