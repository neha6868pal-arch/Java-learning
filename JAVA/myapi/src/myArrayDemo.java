import java.util.Arrays;
import java.util.Comparator;

public class myArrayDemo {
    public static void main(String[] args){
        Integer[] arr = {11,21,13,4,1,3,6,23};
//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return  o2- o1;
//            }
//        });
        Arrays.sort(arr, (Integer o1, Integer o2) ->{
                return  o1- o2;
            }
        );
        System.out.println(Arrays.toString(arr));
    }
}
