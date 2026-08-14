public class test3 {
    public static void main(String[] args){
      //猴子每天吃已有桃子的一半，然后多吃一个，到第10天只剩下一个桃子了
        int x = 1;
        //想着来个数组记录每天的桃子数
        //还以为加一后的结果无法继续算，忘了乘个2就行
        for (int i = 1; i <= 10; i++) {
            x = (x + 1) * 2;
        }
        System.out.println("最初有桃子：" + x);
        //好能吃
    }
}
