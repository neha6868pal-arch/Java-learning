package test;


import java.util.Arrays;
import java.util.Comparator;

public class practice1 {
    public static void main(String[] args){
        student s1 = new student("abc", 18, 1.75);
        student s2 = new student("def", 19, 1.80);
        student s3 = new student("abd", 17, 1.65);
        student s4 = new student("abe", 18, 1.70);
        student s5 = new student("abd", 19, 1.80);
        student[] arr = {s1, s2, s3, s4, s5};
//        Arrays.sort(arr, new Comparator<student>() {
//            @Override
//            public int compare(student o1, student o2) {
//                double temp = o1.getAge() - o2.getAge();
//                temp = temp ==0?o1.getHeight() - o2.getHeight():temp;
//                //字符串不能加减，要用方法比较
//                //该方法只能比较字母，按字母顺序来
//                //按里面的字符逐个比较
//                temp = temp ==0?o1.getName().compareTo(o2.getName()):temp;
//                if (temp >0){
//                    return 1;
//                }else if (temp <0){
//                    return -1;
//                }else {
//                    return 0;
//                }
//            }
//        });
        Arrays.sort(arr, ( o1,  o2) -> {
                double temp = o1.getAge() - o2.getAge();
                temp = temp ==0?o1.getHeight() - o2.getHeight():temp;
                //字符串不能加减，要用方法比较
                //该方法只能比较字母，按字母顺序来
                //按里面的字符逐个比较
                temp = temp ==0?o1.getName().compareTo(o2.getName()):temp;
                if (temp >0){
                    return 1;
                }else if (temp <0){
                    return -1;
                }else {
                    return 0;
                }
            }
        );
        for (student s : arr) {
            System.out.println(s);
        }
    }
}
