public class demoQuickSort {
    public static void main(String[] args){
        int[] arr = {3,5,7,1,2,4,9,2,6};
        quickSort(arr,0,arr.length-1);
        for (int k:arr) {
            System.out.print(k+" ");
        }
    }

    private static void quickSort(int[] arr, int i, int j) {
        int start = i;
        int end = j;
        if (i>=j){
            return;
        }
        int base = arr[i];
        while (start!=end){
           //end先走，确保是小的数，因为start是遇到end停止的
           //如果start先，有可能停在大的数上，最后就把大的数替换过来了
            while (true){
                //先判断再移动
                if (arr[end]<base||end<=start){
                    break;
                }
                end--;
            }
            while (true){
                if (arr[start]>base||start>=end){
                    break;
                }
                start++;
            }
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        //基准数放到正确的位置，左边的都比基准数小，右边的都比基准数大
        int temp = arr[start];
        arr[start] = base;
        arr[i] = temp;
        //再对基准数左边和右边的进行快排
        quickSort(arr,i,start-1);
        quickSort(arr,start+1,j);
    }
}
