package First_package;             //包名字母一律小写，com.公司.xxxx(有标准写法)

//一、二章
class CL{
	
}

@SuppressWarnings("unused")        //忽视警告
public class First_class {
	public static void main(String[] args) {
	System.out.println("hello 瓦鲁多");
	
	int[] a_1;             //声明数组
	a_1 = new int[10];     //分配了10个元素空间
	
	int[] a_2 = new int[] {1,2,3};     //静态初始化
	int[] a_3 = {1,2,3,4};             //静态初始化
	
	int[][] aa_11 = {{1,2},{3,4,5},{6,7,8}};   //一行行的初始化这个二维数组
    
	CL[] arr = new CL[6];        //对象数组
	
	}
	
	/*public static*/ final int A = 0 ;       //常量

    public static int fun_c(int x,int y){     //多个函数名一样，并参数不同的函数，就算重载
		return x*y;
    }
}