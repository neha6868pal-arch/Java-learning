public class regexDemo {
    public static void main(String[] args){
      //验证手机号码 13112345678 13712345667 13945679027 139456790271
        String regex1 = "1[3-9]\\d{9}";
        System.out.println("13112345678".matches(regex1));
        System.out.println("13712345667".matches(regex1));
        System.out.println("13945679027".matches(regex1));
        System.out.println("139456790271".matches(regex1));

        System.out.println("------------");
    }
}
