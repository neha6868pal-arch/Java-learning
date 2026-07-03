public class StudentTest {
    public static void main(String[] args) {
        /*定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
        学生的属性：学号，姓名，年龄。
        要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        要求2：添加完毕之后，遍历所有学生信息。
        要求3：通过id删除学生信息
        如果存在，则删除，如果不存在，则提示删除失败。
        要求4：删除完毕之后，遍历所有学生信息。
        要求5：查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁 */
        Student[]arr = new Student[3];
        Student s1 = new Student("001", "张三", 15);
        Student s2 = new Student("002", "李四", 15);
        Student s3 = new Student("003", "王五", 15);
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        Student s4 = new Student("004", "赵六", 16);
        //判断
        boolean flag = compare(s4, arr);
        if (flag) {
            //因为题目1~3，所以再添加有两种情况：1.数组存满，创建新数组2.没有存满，添加到原数后面
            int count = getCount(arr);
            if (count==arr.length) {
                Student[] arr2 = new Student[count+1];
                for (int i = 0; i < arr.length; i++) {
                    arr2[i] = arr[i];
                }
                arr2[count] = s4;
                printArr(arr2);
            }else{
                arr[count]= s4;
                System.out.println(arr);
                printArr(arr);
            }
        }else{
            System.out.println("当前id重复，请修改id后再添加");
        }
        int index = getIndex(arr, "002");
        if (index>=0) {
            // arr[index]=null;
            int newAge = arr[index].getAge()+1;
            arr[index].setAge(newAge);
        }else{
            // System.out.println("当前id不存在，删除失败");
            System.out.println("当前id不存在，修改失败");
        }
        printArr(arr);
    }
    public static int getIndex(Student[] arr,String id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=null) {
                if (arr[i].getId().equals(id)) {
                    return i;
                }
            }
        }
        return -1;
    }
    public static void printArr(Student [] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=null) {//地址就是字符串，所以用null判断
                System.out.println(arr[i].getId()+","+arr[i].getName()+","+arr[i].getAge());
            }
        }
    }                
    public static int getCount(Student[]arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=null) {
                count++;
            }
            
        }
        return count;
    }
    public static boolean compare(Student student,Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=null) {//null不能获取类，所以要加个判定
                if (student.getId().equals(arr[i].getId())) {
                return false;
                }
            }
            
        }
        return true;
    }
}
