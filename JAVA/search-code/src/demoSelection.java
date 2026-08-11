public class demoSelection {
    public static void main(String[] args){
        int[] arr = {3,5,7,1,2,4,9,8,6};
        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[i+1]){
                startIndex = i+1;
                break;
            }
        }
        for (int i = startIndex; i < arr.length; i++) {
            //i需要与前面的数比较，所以需要新设一个值，来记录该变化
            int j = i;
            while (j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
