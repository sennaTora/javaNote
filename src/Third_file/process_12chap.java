package Third_file;
import java.util.concurrent.*;

//12章    多线程

class CL_0 extends Thread {                       //方法1，缺点锁定父类
	public void run() {
		while(true) {
			System.out.println("CL_0的run()");
		}
	}
}

class CL_1 implements Runnable {                  //方法2，若面对同一对象，并不独立运行（P349）
	public void run() {
		while(true) {
			System.out.println("CL_1的run()");
		}
	}
}

class CL_2 implements Callable<Object>{           //方法3，拥有了返回值
	public Object call() throws Exception {
		int i = 0 ;
		while(i++<5) {
			System.out.println(Thread.currentThread().getName() + "CL_2的call()");
		}
		return i ;
	}
}

@SuppressWarnings("unused")   //忽视警告
public class process_12chap {
	public static void main(String[] xxxxx) {
		CL_0 c_0 = new CL_0();                    //方法1
//		c_0.start();
		
		CL_1 c_1 = new CL_1();                    //方法2
		Thread t_ = new Thread(c_1,"this_is_name");
//		t_.start();
		
		CL_2 c_2 = new CL_2();                    //方法3
		FutureTask<Object> f_1 = new FutureTask<>(c_2);
		Thread th_ = new Thread(f_1,"thread");
//		th_.start();
		System.out.println(Thread.currentThread().getName()        );
//				+ "的返回结果：" + f_1.get());    //不知错因
		
		
//		int a = 0 ;
//		while(a++<5) {
//			System.out.println("main的第二个方法2222");
//		}
//		
//		while(true) {
//			System.out.println("main()的第一个方法1111");
//		}
		
/////////////////////////////////////////////////////////////////////////////////
		
//		后台进程：Daemon(守护进程)仅守护其主人(主进程)
//		         主进程结束时，后台进程随之结束
//		CL_.setDaemon(true);                 //设置CL_为后台进程,必须在它start(之前)
//		System.out.print(CL_.isDaemon());    //判断CL_是否为后台进程
		
//		计时等待状态方法：P352
//		优先级设置：t_.setPriority(Thread.MAX_PRIORITY);    (P354)(勿过度依赖)
//      当前进程 休眠：Thread.sleep(2000);                  (P357，有没看懂的地方)
//      当前进程 让步：Thread.yield();    //执行后，CPU可能有一段空闲
//		线程t_插队：t_.join();       //让t_优先执行完
//		           t_.join(2000);   //只让t_优先执行2s，之后互相抢占
//		线程t_中断：t_inter.interrupt();         (课本P362没懂的地方)
//	    判断t_是否中断：t_.isInterrupted()    (若处于就绪状态，本来就未启动，依然返回false)
		
		CL_b c_a = new CL_b();
		new Thread(c_a,"线程1").start();
		new Thread(c_a,"线程2").start();
		new Thread(c_a,"线程3").start();
		new Thread(c_a,"线程4").start();
		
//		ReentrantLock_ rl_ = new ReentrantLock_();    //重入锁
//		new Thread(rl_,"线程一").start();
//		new Thread(rl_,"线程二").start();
//		new Thread(rl_,"线程三").start();
//		new Thread(rl_,"线程四").start();
	}
}

class CL_a implements Runnable {
	private int tickets_a = 200;
	Object lock_a = new Object();    //定义一个对象，作为锁。此锁对象的类型不限
	public void run() {
		while(true) {
			synchronized(lock_a) {    //定义 同步代码块，避免失误。共享同一个锁对象。
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {e.printStackTrace();}
				
			    if(tickets_a > 0) {
				    System.out.println(Thread.currentThread().getName()+"----卖出票"+tickets_a--);
			    }else {break;}
			}
		}
	}
}

class CL_b implements Runnable {
	private int tickets_b = 300;
	public void run() {
		while(true) {
			sale_Tickets_0();
			if(tickets_b <= 0) {break;}
		}
	}
	
	private synchronized void sale_Tickets_0() {    //定义 同步方法
		if(tickets_b > 0) {
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {e.printStackTrace();}
		System.out.println(Thread.currentThread().getName()+"----卖出票"+tickets_b--);
		}
	}
}

//    P367有一段先不看了

class ReentrantLock_ implements Runnable{    //重入锁
	private int tickets_c = 100 ;
//	private ReentrantLock_ rl_ = new ReentrantLock_();
	public void run() {
		while(true) {
			sale_Tickets_1();
			if(tickets_c <= 0) {break;}
		}
	}
	
	private void sale_Tickets_1() {
//		rl_.lock();    //不知为何，显示未定义
		if(tickets_c > 0) {
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {e.printStackTrace();}
			System.out.println(Thread.currentThread().getName()+"----卖出票"+tickets_c--);
		}
//		rl_.unlock();    //不知为何，显示未定义
	}
}