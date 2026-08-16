import java.util.ArrayList;
import java.util.Collection;

public class a01 {
    public static void main(String[] args){
        //collection是接口，只能创建它的实现类
        Collection<String> coll = new ArrayList<>();
        //list添加都会成功，返回true
        //set添加的元素，如果元素重复添加会失败，返回false
        coll.add("hello");
        System.out.println(coll);
        coll.clear();
        System.out.println(coll);
    }
}
