public class bustest{
    public static void main(String[] args) {
        int [][] yearArr = {
            {22,66,44},
            {77,33,88},
            {22,66,44},
            {22,66,44}
        };
        int yearSum = 0;
        for (int i = 0; i < yearArr.length; i++) {
            int[] quarryArr = yearArr[i];
            int sum = calculate(quarryArr);
            System.out.println("第"+(i+1)+"个季度的营业额为"+sum);
            yearSum+=sum;
        }
        System.out.println(yearSum);
    }
    //计算每一个季度
    public static int calculate(int[]arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
