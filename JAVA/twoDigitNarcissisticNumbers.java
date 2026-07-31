public class twoDigitNarcissisticNumbers {
    public static void main(String[] args){
        //证明没有二位数的自幂数
        int count = 0;
        for (int i = 10; i < 99; i++) {
            int ge = i%10;
            int shi = i/10%10;
            int bai = i/100%10;
            //pow是double类
            double sum = Math.pow(ge,3)+Math.pow(shi,3)+Math.pow(bai,3);
            if (sum==i){
                count++;
            }
        }
        System.out.println(count);
    }
}
