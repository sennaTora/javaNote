package 课堂练习;

@SuppressWarnings("unused")   //忽视警告
class Person {
	private String name; 
    private int age; 
    private String status;
    public Person() {  } 
    public Person(String name, int age, String status) { 
        this.name = name; 
        this.age = age; 
        this.status = status; 
    } 
    public String getName() { 
        return name; 
    } 
    public void setName(String name) { 
        this.name = name; 
    } 
    public int getAge() { 
        return age; 
    } 
    public void setAge(int age) { 
        this.age = age; 
    } 
    public void setWork(String status){ 
        this.status = status;
   }
    public String getWork(){       
		return "GET WORKED";    
   }
}

class Teacher extends Person {     
	public Teacher() {     }     
	public Teacher(String name, int age, String status) {         
		super(name,age,status);    
		}     
	public String getWork(){       
		return "Give lessons.";    
		}
}

class Student extends Person { 
    public Student() { 
    } 
    public Student(String name, int age, String status) { 
    	super(name,age,status); 
    } 
    public String getWork(){ 
     return "Study hard.";
  }
} 


public class d3_13_2 {
	public static void main(String[] args) {
		Person a[] = new Person[4];
		a[0]=new Teacher("s",2,"sd");
	}
	
	
}
