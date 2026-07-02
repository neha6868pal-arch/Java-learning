import java.util.Scanner;

public class score {
    public static void main(String[] args) {
        //在唱歌比赛中，有6名评委给选手打分（键盘录入），分数范围是[0 - 100]之间的整数。
        //选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。
        int[]getScore = getScore();
        
        //找最高分
        int max = max(getScore);

        //找最低分
        int min = min(getScore);

        //找减完数后的和，直接数不好找，先求和再减去
        int sum = sum(getScore);
        
        //求减完后的平均值
        int result = (sum-max-min)/(getScore.length-2);
        System.out.println(result);
    }
    public static int[] getScore() {
        //  因为数多,想在循环里记录每个评委的打分，直接定义变量行不通，需要定义数组来储存
        Scanner sc = new Scanner(System.in);
        int[]arr = new int[6];
        for (int i = 0; i < arr.length; ) {
            System.out.println("请输入第"+(i+1)+"位评委的评分");
            int a= sc.nextInt();
            if (a>=0&&a<=100) {
                arr[i]= a;
                i++;//三个东西都可以从括号里拿出来，把i++拿出来就是当分数失效时不进行下一次循环，重新来直到输入的值有效
            }else{
                System.out.println("分数失效");
            }
        }
        return  arr;
    }
    public static int max(int[]getScore) {
        int max = getScore[0];
        for (int i = 1; i < getScore.length; i++) {
            if (max<getScore[i]) {
                max=getScore[i];
            }
        }
        return max;
    }
    public static int min(int[]getScore) {
        int min = getScore[0];
        for (int i = 1; i < getScore.length; i++) {
            if (min>getScore[i]) {
                min = getScore[i];
            }
        }
        return min;
    }
    public static int sum(int[]getScore) {
        int sum = 0;
        for (int i = 0; i < getScore.length; i++) {
            sum+=getScore[i];
        }
        return sum;
    }
}
