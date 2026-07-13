public class StringDemo5 {
    static void main() {
        //字符串拼接,把数组拼成字符串
        int[] arr = {1,2,3,4,5};
        String result = join(arr);
        System.out.println(result);
    }
    static String join(int[] arr){
        String result = "[";//之前没用字符串前后的拼接，就单纯按顺序输出了
        //用一个字符串后面加上数，不断滚雪球
        if (arr==null){
            return "";
        }else if(arr.length==0){//[0]
            return "[]";
        }else {
            for (int i = 0; i < arr.length-1; i++) {
                result+=arr[i]+",";
                }
            result += arr[arr.length-1]+"]";
            return result;
        }
    }
}
