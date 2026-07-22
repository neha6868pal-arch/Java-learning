package a02ststicdemo;

import java.util.StringJoiner;

public class ArrayUtil {
    private ArrayUtil (){}
    //为了不让外界修改/创建它的对象，private+类名

    public static String printArr(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]+",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static double getAerage(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        double ave = sum/arr.length;
        return  ave;
    }
}
