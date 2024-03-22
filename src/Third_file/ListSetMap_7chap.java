package Third_file;
//七章
import java.util.*;

//Collection接口方法P221
  //List接口方法P222
    //LinkedList实现类方法P224
//(ArrayList: 长度可变的数组)
//(LinkedList: 双向链表，方便增删)
public class ListSetMap_7chap {
	public static void main(String[] xxxxx) {
		ArrayList<String> list_ = new ArrayList<String> ();  //提前出现了泛型
		list_.add("1111");
		list_.add("2222");
		list_.add("3333");
		
		//Iterator接口，遍历集合
		Iterator<String> xx =list_.iterator();
		while(xx.hasNext()) {
			Object Ob_1 = xx.next();
		    System.out.println(Ob_1);
		//如果用了remove方法再遍历，出错找P227   
		}    
		//foreach循环遍历，缺点是不能修改
		for(Object Ob_2 : list_) {
			System.out.println(Ob_2);
		}

//		HashSet类，按hash值存元素（自定义用法见P232），无序
  //		LinkHashSet类，双向链表，有序，方便遍历读取
//		TreeSet类，（自定义用法见P237&P239）
//——  ——  ——  ——  ——  ——  ——  ——  ——  ——  ——  ——  ——  ——  ——  ——  ——  ——  
//	    HashMap类，不重复，无序
  //		LinkedHashMap类，有序
//		TreeMap类，不重复，更适合排序
//		HashTable类 (安全且慢)
//      Properties类，常用来存配置		
//——————————————————————————————————————————————————————————————————————
//		Collection工具类(List)(快速添加，反转，打乱，排序，换位。查找，替换)
//		Arrays工具类(数组)sort()排序，binarySearch()查找，copyOfRange()复制，fill()替换
	
	
//	    Lambda表达式，搁置了，P256
//		Lambda表达式与多线程，P349
	}
}



