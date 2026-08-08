import java.util.ArrayList;
import java.util.Scanner;

public class practice1 {
    public static void main(String[] args){
      // 键盘录入一些1~100之间的整数，并添加到集合中。直到集合中所有数据和超过200为止。
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            System.out.println("请输入一些个1~100之间的整数");
            String numStr = sc.nextLine();
            int num = Integer.parseInt(numStr);
//            if (num>=1&&num<=100){
//                list.add(num);
//            }else {
//                System.out.println("不在范围内，请重新输入");
//            }
            //过滤异常数据
            if (num<1||num>100){
                System.out.println("不在范围内，请重新输入");
                continue;
            }
            list.add(num);
            int sum = getSum(list);
            if (sum>=200){
                break;
            }
        }
        System.out.println("集合中数据收集完毕");
        for (int i = 0; i < list.size(); i++) {
            Integer i1 = list.get(i);
            System.out.print(i1+" ");
        }
    }

    public static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            Integer g = list.get(i);
            sum = sum+ g;
        }
        return sum;
    }
}
