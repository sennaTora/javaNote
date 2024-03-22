package Fourth_file;
import java.net.Socket;
import java.io.InputStreamReader;
import java.io.BufferedReader;
//客户端
public class S_S {
	public static void main(String[] xxxxx) throws Exception {
		Socket c_1 = null;
		c_1 = new Socket("MY-COM-NAME",1210);
		BufferedReader b_ = null ;
		b_ = new BufferedReader( new InputStreamReader( c_1.getInputStream() ) );
		String s_ = b_.readLine();
		System.out.println("服务器输出内容："+ s_ );
		c_1.close();
		b_.close();
	}
}
