package Second_package;

//五章
//throw、throws、自定义。不会
@SuppressWarnings("unused")   //忽视警告
public class Exception_5chap {
	public static void main(String[] xxxxx) {
		try {
			int i=4,j=0;
			int k=i/j;
		} catch(ClassCastException e) {
			System.out.println(e.getMessage());
			return;   //结束当前方法，但finally仍执行
		} catch(Exception e) {        //可以多个，后者的参数类型，是前者的父类
			System.out.println(e.getMessage());
			return;
		} finally {
			System.out.println("使用了finally");
		}
	}
	
	void test() throws Exception{
//		throw new ExceptionInstance("使用了throw");  
	}
}