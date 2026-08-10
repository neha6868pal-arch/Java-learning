public class DemoBinary1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    }
    public static int binarySearch(int[] arr, int number) {
        int min = 0;
        int max = arr.length - 1;
        while (true){
            //结束条件不能直接写while里
            if (min > max) {
                return -1;
            }
            int mid = (min + max) / 2;
            if (arr[mid] == number) {
                return mid;
            } else if (arr[mid] > number) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
    }
}
