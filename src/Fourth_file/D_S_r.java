package Fourth_file;
import java.net.*;
public class D_S_r {
	public static void main(String[] xxxxx) throws Exception {
		byte[] b_1 = new byte[1024];
		DatagramSocket ds_ = new DatagramSocket(778);               //插座（套接字）
		DatagramPacket dp_ = new DatagramPacket(b_1,b_1.length);    //包
		System.out.println("等待接收数据");
		ds_.receive(dp_);
		String s_1 = new String(dp_.getData(),0,dp_.getLength())+" from "+
		                        dp_.getAddress().getHostAddress()+":"+dp_.getPort();
		System.out.println(s_1);
		ds_.close();
	}
}
