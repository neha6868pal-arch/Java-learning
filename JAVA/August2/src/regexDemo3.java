public class regexDemo3 {
    public static void main(String[] args){
       /*用户名要求:大小写字母，数字，下划线一共4-16位
        */
        String regex1 = "\\w{4,16}";
        System.out.println("zhangsan".matches(regex1));
        System.out.println("lisi".matches(regex1));
        System.out.println("wangwu".matches(regex1));
        System.out.println("$123".matches(regex1));
    }
}
