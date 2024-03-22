package Second_package;

//四章_下    //接口
interface Port_1{}
interface Port_2{}
class Far_2{}

//可以继承父类，在  ↓  这里加上
interface Port_12 extends Port_1,Port_2{                   //接口(接口不能继承抽象类)
	//变量默认是 public static final 的（全局常量）
	//方法默认是 public abstract     的（抽象）	 (就算修饰了，也必然是public)	
	void ssss();
}


//       (↓可同时继承父类↓)
class I_m  extends Far_2  implements Port_12 {        //接口实现类
	public void ssss() {        //要把继承的抽象函数，全部重写
		
	}
}

//java类成员默认访问控制权限是default

@SuppressWarnings("unused")        //忽视警告
public class interface_4chap {
	public static void main(String[] args) {
		I_m im;
		
	}
}
