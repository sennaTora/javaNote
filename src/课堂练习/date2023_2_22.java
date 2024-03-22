package 课堂练习;
import java.util.Scanner;     ///
@SuppressWarnings("unused")   //忽视警告
public class date2023_2_22 {
	public static void main(String[] args) {
//成绩评级
		int score = 78 ;
		int i = 0;
		while(score<0) {
			score-=20;
			i++;
		}
		switch(i) {
		case 3:                                   //因为这个分段的多，放在前面
			System.out.println("C级"); break;
		case 4:
			System.out.println("B级"); break;
		case 1:
			System.out.println("E级"); break;			
		case 2:
			System.out.println("D级"); break;
		case 5:
			System.out.println("A级"); 
		}
//求平均值

//		Scanner in =new Scanner(System.in);
//		
//		int a_1=in.nextInt(),a_2=in.nextInt(),a_3=in.nextInt(),a_4=in.nextInt(),a_5=in.nextInt(),a_A=0;
//		a_A=a_1+a_2+a_3+a_4+a_5;
//		System.out.println(a_A/5); 
	}
}
