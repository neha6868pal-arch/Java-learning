import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class studentSystem {
    static boolean isRunning = true;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        ArrayList<User> data = new ArrayList<>();
        while (isRunning) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请输入操作1登录2注册3忘记密码");
            int operation = sc.nextInt();
            switch (operation){
                case 1 ->logIn(data);
                case 2 ->register(data);
                case 3 ->forgetPass(data);
                default -> System.out.println("没有这个选项");
            }
        }
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
    public static void forgetPass(ArrayList<User> data){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = sc.next();
        boolean flag = true;
        User TRue = new User();
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getName().equals(name)){
                flag = false;
                TRue = data.get(i);
            }
        }
        if (flag){
            System.out.println("用户未注册，请先注册");
            return;
        }
        System.out.println("请输入身份证");
        String idNumber = sc.next();
        System.out.println("请输入手机号");
        String phoneNumber = sc.next();
        if (TRue.getId().equals(idNumber)&&TRue.getPhonenumber().equals(phoneNumber)){
            System.out.println("验证成功，请修改密码");
            TRue.setPassword(sc.next());
        }else {
            System.out.println("不匹配，修改失败");
        }
    }
    public static void logIn(ArrayList<User> data){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = sc.next();
        boolean flag = true;
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getName().equals(name)){
                flag = false;
            }
        }
        if (flag){
            System.out.println("用户未注册，请先注册");
            return;
        }
        int count =0;
        while (true) {
            System.out.println("请输入密码");
            String password = sc.next();
            for (int i = 0; i < data.size(); i++) {
                if (data.get(i).getName().equals(name)){
                    if (data.get(i).getPassword().equals(password)){
                        System.out.println("登陆成功");
                        isRunning = false;
                        return;
                    }else {
                        System.out.println("密码错误");
                        count++;
                    }
                }
                if (count>=3){
                    return;
                }
            }
        }
    }
    public static void register( ArrayList<User> data){
        Scanner sc = new Scanner(System.in);
        String phoneName;
        while (true) {
            System.out.println("请输入用户名");
            String name = sc.next();
            boolean flag = false;
            for (int i = 0; i < data.size(); i++) {
                if (data.get(i).getName().equals(name)){
                    flag = true;
                }
            }
            if (flag){
                System.out.println("用户名重复，请重新输入");
            }else if (name.length()<3||name.length()>15) {
                System.out.println("用户名长度不合规");
            }else if (name.matches("^[a-zA-Z0-9]*[a-zA-Z][a-zA-Z0-9]*$")){
                phoneName = name;
                break;
            }else {
                System.out.println("用户名内容不合规");
            }
        }
        String phonePassword;
        while (true){
            System.out.println("请输入密码");
            String password = sc.next();
            System.out.println("再输入一次");
            String pass = sc.next();
            if (password.equals(pass)){
                phonePassword = password;
                break;
            }else {
                System.out.println("密码不一致");
            }
        }
        String phoneId;
        while (true){
            System.out.println("请输入身份证号码");
            String id = sc.next();
            int count =0;
            for (int i = 0; i < id.length()-1; i++) {
                if (id.charAt(i)>=48&&id.charAt(i)<=57){
                    count++;
                }
            }
            boolean judge1 = id.charAt(17)>=48 && id.charAt(17)<=57;
            boolean judge2 = judge1||id.charAt(17)=='X'||id.charAt(17)=='x';
            if (id.length()==18 && id.charAt(0)!='0' && count==17 &&judge2){
                phoneId = id;
                break;
            }else {
                System.out.println("身份证输入错误");
            }
        }
        String phone;
        while (true){
            System.out.println("请输入手机号");
            String phoneNumber = sc.next();
            int num = 0;
            for (int i = 0; i < phoneNumber.length(); i++) {
                if (phoneNumber.charAt(i)>=48&&phoneNumber.charAt(i)<=57){
                    num++;
                }
            }
            if (phoneNumber.length()==11 && phoneNumber.charAt(0)!=0 && num==11){
                phone = phoneNumber;
                break;
            }
        }
        while (true){
            Random r = new Random();
            char[] pool = new char[52];
            for (int i = 0; i < pool.length; i++) {
                if (i<26){
                    pool[i] = (char)('a'+i);
                }else if (i<52){
                    pool[i] = (char)('A'+i-26);
                }
            }
            char[] arr = new char[5];
            for (int i = 0; i < arr.length; i++) {
                int index = r.nextInt(52);
                arr[i] = pool[index];
            }
            int num = r.nextInt(10);
            int ind = r.nextInt(5);
            arr[ind] = (char) (num+48);
            String certification = new String(arr);
            System.out.println(certification);
            System.out.println("请输入验证码");
            String certify = sc.next();
            if (certify.equals(certification)){
                break;
            }
        }
        User us = new User(phoneName,phonePassword,phoneId,phone);
        data.add(us);
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

