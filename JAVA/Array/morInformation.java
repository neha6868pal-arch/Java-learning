import java.util.ArrayList;

public class morInformation {
    public static void main(String[] args){
        ArrayList<Phone> list = new ArrayList<>();
        Phone p1 = new Phone("xiaomi",1000);
        Phone p2 = new Phone("apple",1000);
        Phone p3 = new Phone("chuizi",7000);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        ArrayList<Phone> getPhoneInfo =getPhoneInfo(list);
        for (int i = 0; i < getPhoneInfo.size(); i++) {
            Phone phone = getPhoneInfo.get(i);
            System.out.println(phone.getBrand()+","+phone.getPrice());
        }
    }
    //返回多个数值就放容器里——数组/集合
    public static ArrayList getPhoneInfo(ArrayList<Phone> list){
        ArrayList<Phone> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            int price = p.getPrice();
            if (price<=3000){
                result.add(p);
            }
        }
        return result;
    }
}
