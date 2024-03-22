package 课堂练习;
import java.util.Scanner;

public class d4_3 {
	public static void main(String[] xxxxx) {
		Scanner in_0 =new Scanner(System.in);
		int times = 0 ;
		try {
			int age_0=in_0.nextInt();
		    System.out.println(age_0);
		    times++;
		    if(times>=5) {
		    	System.out.println("输入错误五次");
		    }
		    in_0.close();
		}catch(Exception e) {        //可以多个，后者的参数类型，是前者的父类
			System.out.println(e.getMessage());
			return;
		}finally {
			System.out.println("使用了finally");
		}
	}
			
		
}
