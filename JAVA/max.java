public class max {
    public static void main(String[] args) {
        int [] arr = {33,5,22,44,55};
        int max = arr[0];
        //max不能取0,如果都为负数，输出就会是0
        //要用数组里的数，一般用[0]
        //为了提高效率，减少自己与自己比这一次
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
