public class chongzai {
    public static void main(String[] args) {
        //设计一个方法用于数组遍历，要求遍历结果在一行上，且要[1,2,3,4]这种形式
        int []arr= {11,22,33,44,55};
        math(arr);
    }

    public static void math (int []arr) {
         System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i<arr.length-1) {
                System.out.print(arr[i]+", ");
            }else{
                System.out.print(arr[i]);
            }
        }
        System.out.println("]");
    }
}
