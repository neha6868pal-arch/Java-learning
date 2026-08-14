package test;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class practice2 {
    public static void main(String[] args) {
        student s1 = new student("张三", 18, 1.75);
        student s2 = new student("李四", 19, 1.80);
        student s3 = new student("王五", 17, 1.65);
        student s4 = new student("赵六", 18, 1.70);
        student s5 = new student("孙七", 19, 1.80);
        student[] arr = {s1, s2, s3, s4, s5};
        Collator collator = Collator.getInstance(Locale.CHINA);
        Arrays.sort(arr, Comparator
                //因为就那俩值，就可以省了。进一步抽象到整个类的某一属性的排序
                //然后类就不能省了
                        .comparingInt(student::getAge)
                        .thenComparingDouble(student::getHeight)
                        .thenComparing(student::getName,collator)
//                //方法含判断，防止减法溢出
//                int result = Integer.compare(o1.getAge(), o2.getAge());
//                if (result != 0)return result;
//
//                //没有整数溢出，但有精度问题，不能用==来比较
//                result = Double.compare(o1.getHeight(), o2.getHeight());
//                if (result!=0)return result;
//
//                //String.compareTo() 是按 Unicode，不是拼音
//                //张 的 Unicode 是 \u5f20
//                //李 的 Unicode 是 \u674e
//                //\u5f20 < \u674e，所以 "张三" 会排在 "李四" 前面。
//                //但按拼音 "李(lǐ)" 应该在 "张(zhāng)" 前面。
//                return o1.getName().compareTo(o2.getName());
        );
        for (student s : arr) {
            System.out.println(s.getName() + " " + s.getAge() + " " + s.getHeight());
        }
    }
}
