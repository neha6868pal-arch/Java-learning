public class phoneTest {
    public static void main(String[] args) {
        Phone[] arr = new Phone[3];
        Phone p1 = new Phone("小米", 1999, "白色");
        Phone p2 = new Phone("华为", 4999, "蓝色");
        Phone p3 = new Phone("苹果", 8999, "橙色");

        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        double sum = 0;
        //这道题简单可以一个一个列，但还是循环省事
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i].getPrice();
        }
        double ave = sum/arr.length;
        System.out.println(ave);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getPrice()<ave) {
                System.out.print(arr[i].getBrand()+" ");
                count++;
            }
        }
        System.out.println(count);
    }
}
