public class test5 {
    public static void main(String[] args) {
        int h1 = 150;
        int h2 = 210;
        int h3 = 210;
        int temp = h1 > h2 ? h1:h2;
        //输出前的int看最后输出的是什么类型
        int result = temp > h3 ? temp :h3;

        System.out.println(result);



    }
}
