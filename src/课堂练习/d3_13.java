package 课堂练习;


class Employee {
	private String name;
	private double salary;
	
	public Employee(String n , double s) {
		name=n;
		salary=s;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary*byPercent/100;
		salary += raise;
	}
}
@SuppressWarnings("unused")   //忽视警告
class Manager extends Employee{
	private double bonus;
	
	public Manager(String n, double s){
		super(n,s);
	}
	
	public int Bonus(int b) {
		return b;
	}
}

public class d3_13 {
	public static void main(String[] xxxxx) {
		Manager a = new Manager("aa",3);
		Employee b = new Employee("bb",2);
		Employee c = new Employee("cc",1);
		System.out.println("a:"+a.getName()+"  "+a.getSalary()+"  "+a.getClass());
		System.out.println("b:"+b.getName()+"  "+b.getSalary()+"  "+b.getClass());
		System.out.println("c:"+c.getName()+"  "+c.getSalary()+"  "+c.getClass());
	}
}
