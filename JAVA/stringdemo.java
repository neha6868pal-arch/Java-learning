public class stringdemo {
    public static void main(String[] args) {
        java.lang.StringBuilder sb = new StringBuilder("abc");
        //java已经写好了类，并做了特殊处理，所以sb储存的就是属性值，而非地址值
        //因为是新开辟的储存字符串的空间，并不算字符串
        sb.append(123);
        sb.append("sdg");
        sb.reverse();
        System.out.println(sb);
        int length = sb.length();
        System.out.println(length);
        //转换成字符串，才能用字符串的工具
        String str = sb.toString();
    }
}
