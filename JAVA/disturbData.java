import java.util.Random;

public class disturbData {
    public static void main(String[] args) {
        //需求：定义一个数组，然后随机打乱顺序。
        //不能直接设置随机数，因为数是固定的
        int []arr = {1,2,3,4,5};
        //把随机数用在索引上，随机一个索引来替换
        Random r = new Random();
        //我原来没用循环，只是1和其他所有进行交换，并没有满足随机打乱顺序
        //加一个循环，把原来的1换成i就可以
        //这样就进行了长度-1次循环，每次都随机
        for (int i = 0; i < arr.length; i++) {
            int randomindex = r.nextInt(arr.length);//有通用性，会在0~长度-1的范围里随机
            int temp = arr[i];
            arr[i]= arr[randomindex];
            arr[randomindex]= temp ;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
}
