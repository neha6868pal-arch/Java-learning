public class GoodsTest {
    public static void main(String[] args) {
        Goods[] arr = new Goods[3];
        Goods g1 = new Goods("001", "太阳帽", 49.9, 1000);
        Goods g2 = new Goods("002", "墨镜", 29.0, 500);
        Goods g3 = new Goods("003", "防晒", 199.9, 700);

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getId()+","+arr[i].getName()+","+arr[i].getPrice()+","+arr[i].getCount());
        }
    }
}
