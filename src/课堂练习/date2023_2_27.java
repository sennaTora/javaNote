package 课堂练习;

import java.util.*;

//@SuppressWarnings("unused")   //忽视警告
public class date2023_2_27 {
	public static void main(String[] args) {
		int i = 0 ,j=0;
		while(i<=100) {
			j=i%2;
			if(j==0) {
				System.out.println(i);
			}
			i++;
		}
	
		
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		switch (a) {
			case 12:;
			case 1:;
			case 2:;
				System.out.println("冬天");break;
			case 3:;
			case 4:;
			case 5:;
				System.out.println("春天");break;
			case 6:;
			case 7:;
			case 8:;
				System.out.println("夏天");break;
			case 9:;
			case 10:;
			case 11:;
				System.out.println("秋天");break;
		}
		in.close();
		int a1=in.nextInt();
		System.out.println(a1);
	}
}
