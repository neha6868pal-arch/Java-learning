public class swapData {
    public static void main(String[] args) {
        //需求：定义一个数组，按要求全部颠倒个个
        int []arr = {1,2,3,4,5};
        //我想到用中间变量存储一下，但没多考虑只用一个值
        int temp = arr[0];
       //索引之间的交换不用数据类型
       int []rra = new int [arr.length];
       for (int i = 0; i < arr.length; i++) {
          rra[arr.length-1-i] = arr[i]; 
       }
       for (int j = 0; j < rra.length; j++) {
          System.out.print(rra[j] + " ");
       }
       //我的方法是新定义一个空白数组来放新的，也是让首尾对应
       //另一个方法是在原基础上换,通过两个变量让首尾对应上,然后首++，尾--，直到i=j时不进行
       //这个方法更符合交换的定义
       for (int i = 0,j = arr.length-1; i < j; i++,j--) {
        int tamper = arr[i];
        arr[i] = arr[j];
        arr[j] = tamper;
       }
       for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
       }
       
    }
}
