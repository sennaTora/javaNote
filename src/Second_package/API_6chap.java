package Second_package;

import java.util.*;
import java.util.regex.*;//正则
//六章
@SuppressWarnings("unused")   //忽视警告
public class API_6chap {
	public static void main(String[] xxxxx) {
	String a1 = "CH4NGE";
	String a2 = new String("Los!LOs!LOs!");
	
 	char[] b3 = new char[] {'L','o','s'}; //字符数组
	String a3 = new String();
	
	byte[] b4 = {7,2,2}; //字节数组
	String a4 = new String(b4); 
	
//	String的方法：见课本P164
	System.out.println(a4.charAt(2)+"\t");

	StringBuffer z1 = new StringBuffer(); //可改变的String
	//StringBuffer，安全。StringBuilder，性能。 都不能用Object类的equals()方法
	//String，可以用“+”。 不能改。
	
	
//	System类： 见课本P175
//	Runtime类：见课本P180 (Java虚拟机相关)
//	Math类：   见课本P183
	
//构造Random
	Random c1 = new Random();   //根据时间
	Random c2 = new Random(4);  //根据种子
//	Random类方法：见课本P186
	
//	BigIntegar类：见课本P188 (算大数)
//	BigDecimal类：见课本P189 (算小数)
//	NumberFormat类；见课本P207(符合各地不同习惯)
//———————————————————————————————————————————————————————————————————————————
//构造Date
	Date d1 = new Date();
	Date d2 = new Date(System.currentTimeMillis()+1000);    //参数是：时间戳
//	Calendar类：P191  (国际化)
//	Instant类： P194  (时刻)
//	LocalDate类：    P196  (无时区)
//	LocalTime类：    P198  (无时区)
//	LocalDateTime类：P199  (无时区)
//	Duration类： P200  (时间间隔：单位小)
//	Period类：   P201  (时间间隔：单位大)
//	DateFormat类:       P202  (格式现成)
//	SimpleDateFormat类: P205  (输入方便)
//———————————————————————————————————————————————————————————————————————————
//	包装类：P208~211  (基本->引用数据类型)
//	正则表达式 P211~213
	Pattern p = Pattern.compile("a*b");//Pattern类 P213
	Matcher m = p.matcher("aaaaab");
	System.out.println("匹配器:"+m.matches());//Matcher类 P215
//	String类，匹配替换拆分 P217
	}
}
