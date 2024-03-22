package 课堂练习;

class Father {
	private String nameA = "Lao";
	class Child{
		String introFather(){
			return nameA;
		}
	}
}

public class d4_10 {
	public static void main(String[] args) {
		Father.Child Test = new Father().new Child();
		System.out.println(Test.introFather());
	}	
}
