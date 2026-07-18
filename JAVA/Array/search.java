import java.util.ArrayList;

public class search {
    public static void main(String[] args){
        ArrayList<user> list = new ArrayList<>();
        user u1 = new user("001","zhangsan","1111");
        user u2 = new user("002","lisi","1111");
        user u3 = new user("003","wangwu","1111");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        boolean result = search(list,"001");
        System.out.println(result);
    }
    public static boolean search(ArrayList<user> list,String id){
        for (int i = 0; i < list.size(); i++) {
            user us = list.get(i);
            if (us.getId().equals(id)){
                return true;
            }
        }
        return false;
    }
}
