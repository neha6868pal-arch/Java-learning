import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo3 {
    public static void main(String[] args){
      /*有如下文本，按要求爬取数据。
                Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，
                因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台

            需求2:爬取版本号为8，11，17的Java文本。正确爬取结果为:Java8 Java11 Java17 Java17
        */
        String regex = "((?)Java)(?:8|11|17)";//?是前面的内容，:后面接需获取且打印的
        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11," +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        while (m.find()) {
            String result = m.group();
            System.out.print(result+" ");
        }
    }
}
