public class existNumber {
    public static void main(String[] args) {
        //定义一个方法判断数组中的一个数是否存在，将结果返回给调用处
        int []arr = {12,34,56,14,45};
        System.out.println(judge(arr,10));
    }
    
    public static boolean judge(int []arr,int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==number) {
                return true;
            }
        }
        //如果return false放里面，一判断出不对就截止了
        //false应该是全部都看完后做的决定
        //return就截止，所以有数相等就输出true，没有就出来输出false
        return false;
    }
}
