package Third_file;
//八章    //泛型
import java.util.*;

class CL {
	public <T>void f_1(T t1){           //泛型方法(一般不在泛型类里用)
		System.out.println(t1+"——>"+t1.getClass());//提前出现的反射
	}
	
	public static<T> void f_2(T t2){    //静态泛型方法(建议使用静态)
		System.out.println(t2+"——>"+t2.getClass());
	}
}


class CL_gen <T>{}        //泛型类(还有E,K,V,N,P263)

interface I_<T>{}            //泛型接口

class In_1 implements I_<String>{}           //非泛型类+泛型接口    实参必是xxx类型
	
class In_2<T> implements I_<String>{}        //泛型类+泛型接口      实参可为任意类型

@SuppressWarnings("unused")   //忽视警告
public class EKVNT_8chap {
	public class Ex {
		public static void get_Element1(Collection<? extends Number>coll) {}//上限
		public static void get_Element2(Collection<? extends Number>coll) {}//下限
	}
	
	public static void main(String[] xxxxx) {
		CL.f_2("一刀陈刀仔");
		CL.<String>f_2("862");
		
		CL c =new CL();
		c.f_1("两刀刘德华");
		c.<String>f_1("862");
		
		CL_gen<?> g = new CL_gen<String>();    // ？：类型通配符
		
	}
}



