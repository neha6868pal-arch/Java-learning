package test;

import java.util.Arrays;
import java.util.Comparator;

public class practice2 {
    public static void main(String[] args) {
        student s1 = new student("abc", 18, 1.75);
        student s2 = new student("def", 19, 1.80);
        student s3 = new student("abd", 17, 1.65);
        student s4 = new student("abe", 18, 1.70);
        student s5 = new student("abd", 19, 1.80);
        student[] arr = {s1, s2, s3, s4, s5};
        Arrays.sort(arr, (o1,  o2)-> {
                //方法含判断，防止减法溢出
                int result = Integer.compare(o1.getAge(), o2.getAge());
                if (result != 0)return result;

                //没有整数溢出，但有精度问题，不能用==来比较
                result = Double.compare(o1.getHeight(), o2.getHeight());
                if (result!=0)return result;

                //String.compareTo() 是按 Unicode，不是拼音
                //张 的 Unicode 是 \u5f20
                //李 的 Unicode 是 \u674e
                //\u5f20 < \u674e，所以 "张三" 会排在 "李四" 前面。
                //但按拼音 "李(lǐ)" 应该在 "张(zhāng)" 前面。
                return o1.getName().compareTo(o2.getName());

            }
        );
    }
}
