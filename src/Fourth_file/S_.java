package Fourth_file;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
//服务器端
public class S_ {
	public static void main(String[] xxxxx) throws Exception {
		Socket c_ = null ;
		OutputStream o_ = null ;
		ServerSocket s_ =new ServerSocket(1210);
		System.out.println("服务器运行中，等待连接");
		c_ = s_.accept();
		o_ = c_.getOutputStream();
		System.out.println("开始与客户端交互数据");
		o_.write(("北京欢迎你！").getBytes());
		Thread.sleep(3000);
		System.out.println("交互完毕");    //不知为何，“交互完毕”后才输出“北京欢迎你”
		Thread.sleep(3000);
		o_.close();
		c_.close();
		s_.close();
	}
}
