import java.util.Random;

public class grabRedEnvelopes {
    public static void main(String[] args) {
        //一个大V直播抽奖，奖品是现金红包，分别有{2, 588 , 888, 1000, 10000}五个奖金。
        //请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。

        //遍历数组里的每个数，每次都和随机的索引交换，因为两个变量交换，记得设立中间变量
        Random r = new Random();
        int [] bonus = {2, 588 , 888, 1000, 10000};
        for (int i = 0; i < bonus.length; i++) {
            int index = r.nextInt(bonus.length);
            int temp = bonus[i];
            bonus[i] = bonus[index];
            bonus[index] = temp;
        }
        for (int i = 0; i < bonus.length; i++) {
            System.out.println(bonus[i]+"元的奖金被抽出");
        }
        //老师说了个效率低的，每次都是20%的概率，有可能很久都抽不到
        // 循环里直接随机一个索引，i++拿到下面的判断里
        // 判断是否在新数组里，
        //在的话不做处理，也不写i++，继续重复这个i的步骤
        //不在的话就把这个存进新数组里，循环往下进行
    }
}
