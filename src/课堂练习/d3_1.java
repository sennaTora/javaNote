package 课堂练习;

class Dog {
	String breed;
	String size;
	String color;
	int age;
	public Dog(String b,String s, String c,int a){
		this.breed=b;this.size=s;this.color=c;this.age=a;
	}
	
	public Dog(){}
	
	void getInfo() {
		System.out.println("breed:"+breed+"\n"+"size:"+size+"\n"+"color:"
	+color+"\n"+"age:"+age+"\n");
	}
	
	void sleep() {
		System.out.println("This dog is sleeping.");
	}
}

public class d3_1 {
	public static void main(String[] xxxxx) {
		Dog a1 = new Dog("OKdog","middle","g&b",0);
		a1.getInfo();
		a1.sleep();
		
//		int[]e = {1,0,3};
	}
}
