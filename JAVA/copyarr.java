public class copyarr {
    public static void main(String[] args) {
        //定义一个方法copyOfRange(int[] arr,int from,int to)
        //将数组arr从索引from(包含from)开始，到索引to结束（不包含to）的元素复制到新数组中，并将新数组返回
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] raa = copyOfRange(arr, 4, 6);
        for (int i = 0; i < raa.length; i++) {
            System.out.print(raa[i]+" ");
        }
    }
//数组的类型是“数类型[]”,return的就是数组名。回去的时候再拿新变量接一下就好
    public static int[] copyOfRange(int[] arr,int from,int to) {
        //要在方法里定义新数组，因为长度在方法这里
        int[] newArr = new int[to - from];
        for (int i = from,j=0; i < to; i++,j++) {
            newArr[j] = arr[i];
        }
       
        return newArr;
    }
}
