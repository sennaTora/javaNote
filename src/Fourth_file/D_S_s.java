package Fourth_file;
import java.net.*;
public class D_S_s {
	public static void main(String[] xxxxx) throws Exception {
		DatagramSocket ds_2 = new DatagramSocket(7782);               //插座（套接字）
		String s_2 = "ABA";
		byte[] arr_ = s_2.getBytes();
		DatagramPacket dp_ = new DatagramPacket(arr_,arr_.length,
				                                InetAddress.getByName("localhost"),212);
		System.out.println("发送信息");
		ds_2.send(dp_);
		ds_2.close();
	}
}
