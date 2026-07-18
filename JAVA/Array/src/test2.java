import java.util.ArrayList;

public class test2 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(444);
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i==list.size()-1){
                System.out.print(list.get(i));
            }else {
                System.out.print(list.get(i)+",");
            }
        }
        System.out.println("]");
    }
}
