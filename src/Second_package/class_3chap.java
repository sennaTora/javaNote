package Second_package;
//import First_package.*;
//import First_package.First_class;

//三章
class CL{                                 //创建类,类名第一个字母大写
	int a;                 //成员变量
	public int b;
	static String c;       //静态属性（静态成员变量）只要在某个地方改了，这个变量就全改了
	
	void method(){}        //成员方法	 

	public static void sss(){}        //静态方法，不用创建对象，"类名.方法"即可调用
	
	static {                          //优先度+2的 构造方法，一次性（击掌奇袭）
		System.out.println("调用了'静态构造块'");
	}                      
	
	{                                 //优先度+1的 构造方法
		System.out.println("调用了'构造块'"); 
	}
	
	public CL(){                     //构造方法（曾经的构造函数！）    //可以有参数	
		System.out.println("调用了'构造方法'");
	}
}

@SuppressWarnings("unused")   //忽视警告
public class class_3chap {
	public static void main(String[] args) {
		CL cl_1 = new CL();        //创建类的对象、并实例化
		cl_1.a = 1;
		cl_1.method();             //调用方法
		
		CL cl_2 = null;
		cl_2 = cl_1;               //这被称为“对象的引用传递”
	}
}


/**
 * 访问控制权限：
 * private    default    protected    public
 * 同一个类     同一个包     不同包子类      全局范围
 */

/*
 * this.**       发生重名时，用这个
 * this()        调用无参构造方法
 */


