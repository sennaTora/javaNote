package 课堂练习;
//import java.lang.*;

import java.util.Arrays;

class Student_2 implements Comparable<Student_2>{
	private int score;
	private String name;

	public Student_2(int s,String n) {
		this.score = s;
		this.name = n;
	};
	
	public int compareTo(Student_2 o_) {
//		return Double.compare(score, o_.score);
			if(this.score>o_.score) {return 1;}
			else if(this.score<o_.score) {return -1;}
			else{return 0;}
	}
	
	public int getscore() {
		return score;
	}
	
	public String getname() {
		return name;
	}
}

public class d3_20 {
	public static void main(String[] xxxxx) {
		Student_2[] a_ = new Student_2[3];
		a_[0] = new Student_2(99,"Harry");
		a_[1] = new Student_2(86,"A_name");
		a_[2] = new Student_2(100,"B_name");
		
		for(Student_2 e:a_) {
			System.out.println("name: "+e.getname() +"  score: "+e.getscore());
		}
//		a_[0].compareTo(a_[1]);
		if(a_[0].compareTo(a_[1])==0) {
			System.out.println("equal");
		}
		else if(a_[0].compareTo(a_[1])>0) {
			System.out.println(">");
		}
		else System.out.println("<");
		
		Arrays.sort(a_);
		
		for(Student_2 e:a_) {
			System.out.println("name: "+e.getname() +"  score: "+e.getscore());
		}
	}
}
