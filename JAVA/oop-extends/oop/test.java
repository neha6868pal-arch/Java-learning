package oop;

public class test {
    public static void main(String[] args){
      Student st = new Student();
      st.setName("xue");
      st.setAge(19);
      teacher t = new teacher();
      t.setName("lao");
      t.setAge(30);
      administrator ad = new administrator();
      ad.setName("xing" );
      ad.setAge(40);
      register(st);
      register(t);
      register(ad);
    }
    public static void register(Person p){
        p.show();
    }
}
