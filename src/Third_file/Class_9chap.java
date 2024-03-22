package Third_file;
//9章    反射机制(获取类的信息)
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Field;
//import java.util.*;
//import java.util.regex.*;

interface Sunflower {
	public static final String ABCD_1 = "向日葵";
}

class CL1 { }

class CL2 implements Sunflower{
	public CL2(int a){ System.out.println("这是CL2的有参构造函数"); }
	
	public int aa;
	
	public void F_aaa() {
		System.out.println("调用了方法");
	}
}

@SuppressWarnings("unused")   //忽视警告
public class Class_9chap {
	public static void main(String[] xxxxx) {
//	无参实例化Class对象
	Class<?> cl1 = null ;
//	Class<?> cl2 = null ;
//	Class<?> cl3 = null ;
	try {
		cl1 = Class.forName("Third_file.CL1");  //Class实例化方式_1
	}catch(ClassNotFoundException e) {e.printStackTrace();}
	
	Class<?> cl2 = new CL1().getClass();        //Class实例化方式_2
	Class<?> cl3 = CL1.class;                   //Class实例化方式_3
 	
//	CL1 cl0 = null ;
	try {
		CL1 clazz1 = (CL1)cl1.getDeclaredConstructor().newInstance() ;    //Class方法见P277
	}catch(Exception e) {e.printStackTrace();}
	
//	(有参实例化Class对象)没有无参构造方法时，就要通过Constructor，获取有参构造方法再说
	Class<?> cl_11= CL2.class;                          //实例化对象cl11
	Constructor<?> QG_1[] = cl_11.getConstructors();  //将CL类的全部构造方法，获取到数组clazz0中
	CL2 cl_12 = null ;
	try {
		cl_12 = (CL2) QG_1[0].newInstance(862);        //实例化对象cl12(应该是构造方法的)
	}catch(Exception e) {e.printStackTrace();}
	System.out.println(cl_12);
	
////////////////
	Class<?> QG_2[] = cl_11.getInterfaces();           //getInterfaces()获取接口
	for(int i = 0 ;i<QG_2.length ;i++) {
		System.out.println("接口："+QG_2[i].getName());
	}
	
//获取构造方法
	Constructor<?> QG_3[] = cl_11.getConstructors();   
	for(int i = 0 ;i<QG_3.length ;i++) {
		Class<?>QG_3_1[] = QG_3[i].getParameterTypes();
        System.out.println("构造方法 权限："+QG_3[i].getParameterTypes()+" "+QG_3[i].getName());//权限
        System.out.println("名称："+QG_2[i].getName());             //名称
        for(int j = 0 ;j<QG_3_1.length;j++) {
        	System.out.println("参数："+QG_3_1[j].getName()+"arg"+i); //参数
//        	if(j<QG_3_1.length-1) {System.out.println(",");}
        }
	}
	
//	获取方法
	Method m[] = cl_11.getMethods();
	for(int i = 0 ;i<m.length;i++) {
		Class<?> r = m[i].getReturnType();
		Class<?> p[] = m[i].getParameterTypes();
		int xx = m[i].getModifiers();
		System.out.println(Modifier.toString(xx)+" ");
		System.out.println(r.getName()+" ");
		System.out.println(m[i].getName());
		for(int j = 0 ;j<p.length;j++) {
        	System.out.println("参数："+m[i].getName()+"arg"+i); //参数
//        	if(j<m.length-1) {System.out.println(",");}
        }
	}
	
//	获取全部属性
	Field f[] = cl_11.getDeclaredFields();
	for(int i=0;i<f.length;i++) {
		Class<?> r = f[i].getType();
		int mo = f[i].getModifiers();
		String priv = Modifier.toString(mo);
		System.out.print("本类属性：");
		System.out.print(priv+" ");
		System.out.print(r.getName()+" ");
		System.out.print(f[i].getName()+";");
	}
	
//	调用 类中的 方法
	try { 
		Method met = cl_11.getMethod("F_aaa");
//		met.invoke(cl_11.getDeclaredConstructor().newInstance());   //到底怎么处理
	}catch(Exception e) {e.printStackTrace();}
	
//	调用 getter/setter 方法    ，搁置
//	操纵属性                  ，搁置
	
	}
}
