package Second_package;

//四章_下    //多态（重写、重载）

class Parent{    }
class Child extends Parent {    }
class B{    }

@SuppressWarnings("unused")  //忽视警告
class Out{                   
	class In {}              //成员内部类     //加上static就是静态内部类
	
	void test() {
		In ii = new In();    //实例化内部对象
	}
	
	void in() {
		class Inn {}         //局部内部类
	}
	
	//在此实例化局部内部类。
	
}

interface A{}

@SuppressWarnings("unused")   //忽视警告

public class class_4chap {
	public static void main(String[] xxxxx) {
		Child ch = new Child();
		Parent n_1 = ch ;                      //向上转型
		Parent n_2 = new Child();              //向上转型    （将子类对象，赋值给新建的，父类对象）
		
		Child xxx = (Child) n_1 ;              //然后才能，向下转型 
		
		
	    B a = new B();  //  ↓ 鉴定a是否为B实例 ↓
		System.out.println(  (a instanceof B)  );
		
		
		System.out.println(a.equals(a));     //判断两个对象是不是相等
		System.out.println(a.hashCode());    //哈希值
		System.out.println(a.toString());    //对象的字符串表现形式
		
		//在此实例化，成员内部类。（1、要加上 外部类名. 和 外部类对象. 2、要提前创建外部对象）
		//在此实例化，静态内部类。（1、要加上 外部类名. 和 外部类对象. ）
				
		f (new A() {});        //匿名内部类
	}
	static void f (A aaa) {}
}


