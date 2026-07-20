import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class studentSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        loop:while (true) {
            System.out.println("-----------欢迎来到学生管理系统----------" );
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.println("请输入您的选择：");
            int choose = sc.nextInt();
            switch (choose){
                case 1->add(list);
                case 2->remove(list);
                case 3->update(list);
                case 4->query(list);
                case 5-> {
                    break loop;//里面嵌套一个的情况下，直接破大循环需定位名字
                }//也可System.exit(0);停止虚拟机运行，等同于点右上角的×
                default -> System.out.println("没有这个选项");
            }
        }
    }
    public static void add(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();
        int id;//在外面之把名字写上就可以访问了
        while (true){
            System.out.println("请输入id");
            id = sc.nextInt();
            boolean flag = list.contains(id);//用方法比遍历判断更快
            if (flag){
                System.out.println("id已存在，请重新输入");
            }else {
                stu.setId(id);
                break;
            }
        }
        System.out.println("请输入姓名");
        String name = sc.next();
        stu.setName(name);
        System.out.println("请输入年龄");
        int age = sc.nextInt();
        stu.setAge(age);
        System.out.println("请输入家庭住址");
        String address = sc.next();
        stu.setHomeAdress(address);
        list.add(stu);
        System.out.println("学生信息添加成功");
    }
    public static void remove(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要删除的id");
        int id = sc.nextInt();
        boolean flag = true;
        for (int i = 0; i < list.size(); i++) {
            int compare = list.get(i).getId();
            if (compare ==id){
                list.remove(i);
                System.out.println("id为：" +id+"的学生删除成功");
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("id不存在，删除失败");
        }
    }
    public static void update(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要修改的id");
        int id = sc.nextInt();
        boolean flag = true;
        for (int i = 0; i < list.size(); i++) {
            int compare = list.get(i).getId();
            if (compare ==id){
                System.out.println("请输入修改后的id");
                int newID = sc.nextInt();
                System.out.println("请输入修改后的姓名");
                String newName = sc.next();
                System.out.println("请输入修改后的年龄");
                int newAge = sc.nextInt();
                System.out.println("请输入修改后的家庭住址");
                String newAddress = sc.next();
                Student stu = new Student(newID,newName,newAge,newAddress);
                list.set(i,stu);
            }else {
                System.out.println("该id不存在");
            }
        }
    }
    public static void query(ArrayList<Student> list){
      if (list.size()==0){
          System.out.println("当前无学生信息，请添加后再查询");
      }else {
          System.out.println("id\t姓名\t年龄\t家庭住址");
          for (int i = 0; i < list.size(); i++) {
              Student stu = list.get(i);
              System.out.println(stu.getId()+"\t"+stu.getName()+"\t"+stu.getAge()+"\t"+stu.getHomeAdress());
          }
      }
    }
//    public static int getIndex(ArrayList<Student> list,int id){
//        for (int i = 0; i < list.size(); i++) {
//            int compare = list.get(i).getId();
//            if (compare ==id){
//                return i;
//            }
//        }
//        return -1;
//    }
}

