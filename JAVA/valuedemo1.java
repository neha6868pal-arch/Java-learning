import java.util.Scanner;
public class valuedemo1{
	public static  void main(String[] args){
		/*输出
		和python的print很像*/
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数据");
		int j = sc.nextInt();
		System.out.println("请输入第二个数据");
		double i = sc.nextDouble();
		System.out.println(i+j);
		
	}
}