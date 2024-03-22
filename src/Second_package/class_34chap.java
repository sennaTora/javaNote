package Second_package;

//四章_上

class Far{                             ////////父类
	private int a_g;
	
	public Far(){}
	
	public void seta_g(int a_g2) {
		this.a_g = a_g2 ;
	}
	
	public int geta_g() {
		return a_g;
	}
}

class Son extends Far{                 ////////子类
	//这里，正常的用就好
	Son(){                        //构造方法
		super();             //super,使用父类的构造方法。必须在第一行，一次性
	}
	
	public int geta_g() {         //重写父类方法（方法名、参数、返回值类型，必须相同）
		return 114;          //子类访问权限，不能比父类的更严格
	}
	
	{super.geta_g();}        //super,使用未被重写时的，父类的方法
//	
	
}

//final，最终，没有子类，不可重写，不可修改。
//final修饰变量时，变量的名称必须用大写。
//public static final ABCD = "什么什么" ;      //此为全局变量


abstract class Abs {         //包含抽象方法的类，必须是抽象类
	//可以由普通的方法
	abstract void f ();      //抽象方法（无“方法体”）（不要用private修饰）
}

class Abs_son extends Abs{
	void f() {
		//继承后，必须重写抽象方法
	}
}

public class class_34chap {
	public static void main(String[] args) {
	Son ob = new Son();
	ob.seta_g(223);
	System.out.println(ob.geta_g());
	}
}

//java里，子类不能有两个父类（只能是树结构）

/**
 * 访问控制权限：
 * private    default  |  protected    public
 * 同类        同包      |  不同包        全局
 *    子类不能访问        |     子类不能访问
 */


