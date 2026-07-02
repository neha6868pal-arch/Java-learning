public class test12 {
    public static void main(String[] args) {
        int area1 = getarea(10, 20);
        int area2 = getarea(20, 32);
        System.out.println(area1>area2?"第一个长方形更大":"第二个长方形更大");
       
    }
    
    public static int getarea(int num1,int num2){
        int result = num1 * num2 ;
        return result;
    }
}
