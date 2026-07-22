package a01staticdemo1;

public class StudentTest {
    public static void main(String[] args){
      Student.treacherName = "xiaoyan";//只能用类名来赋值
      Student s1 = new Student();
      s1.setName("zhang");
      s1.setAge(19);
      s1.setGender("nan");
      s1.study();
      s1.show();
      Student s2 = new Student();
      s2.setName("li");
      s2.setAge(20);
      s2.setGender("nv");
      s2.study();
      s2.show();
    }
}
