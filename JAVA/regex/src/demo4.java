import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo4 {
    public static void main(String[] args){
      /*有如下文本，按要求爬取数据。
                Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，
                因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台

            需求3:爬取除了版本号为8，11.17的Java文本，
        */
        String regex = "Java([1-7]|9)|(1[\\d&&^17])";
        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11," +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        while (m.find()) {
            String result = m.group();
            System.out.println(result);
        }
    }
}
