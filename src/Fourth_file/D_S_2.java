package Fourth_file;
import java.net.*;
import java.io.IOException;
import java.util.Scanner;

public class D_S_2 {
	public static void main(String[] xxxxx) throws Exception {
		new Receive_().start();
		new Send_().start();
	}
}

class Receive_ extends Thread{
	public void run() {
		try {
			DatagramSocket s_1 = new DatagramSocket(753);
			DatagramPacket dp_ = new DatagramPacket(new byte[1024],1024);
			while(true) {
				s_1.receive(dp_);
				byte[] arr_ = dp_.getData();
				int len_ = dp_.getLength();
				String ip_ = dp_.getAddress().getHostAddress();
				System.out.println(ip_ + "为" + new String(arr_,0,len_));
				s_1.close();
			}
		}catch(IOException e) {e.printStackTrace();}
		
	}
}

class Send_ extends Thread{
	public void run() {
		try {
			DatagramSocket ds_2 = new DatagramSocket(6666);
			Scanner sc_ = new Scanner(System.in);
			while(true) {
				String str_0 = sc_.nextLine(); 
				if("quit0".equals(str_0)) break;
				DatagramPacket dp_2 = new DatagramPacket(str_0.getBytes(),
						str_0.getBytes().length,InetAddress.getByName("127.0.0.1"),753);
				ds_2.send(dp_2);
			}
			ds_2.close();
			sc_.close();
		}catch(IOException e) {e.printStackTrace();}finally {
			
		}
	}
}