import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] arr = new Car[3];
        //三辆车的所有数据都用键盘录入来获取，
        Scanner r = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //创建在里面，每次都新开辟一个，创建完后变量就没了，要及时赋给arr[i]
            //创建在外面，只开辟了一个，每次赋值都赋同一个地址，里面的数就是最后存的
            Car c = new Car();
            //先键盘录入，后把变量直接存进实参构造行不通。键盘录入的变量没传进去
            //先创建空参，然后把输入的数据通过set传进去
            System.out.println("请输入汽车品牌");
            String brand = r.next();
            c.setBrand(brand);
            System.out.println("请输入汽车价格");
            int price = r.nextInt();
            c.setPrice(price);
            System.out.println("请输入汽车颜色");
            String color = r.next();
            c.setColor(color);
            arr[i] = c;//把c的地址赋给了arr[i]
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getBrand()+","+arr[i].getPrice()+","+arr[i].getColor());
        }
    }
}
