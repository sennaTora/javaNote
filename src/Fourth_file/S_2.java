package Fourth_file;
//import java.io.*;
//import java.net.ServerSocket;
//import java.net.Socket;
//服务器端(多线程)
public class S_2 {
	public static void main(String[] xxxxx) throws Exception {
//		ServerSocket s_2 =new ServerSocket(111);
		while(true) {
//			final Socket c_2 = serverSocket.accept();//不知为何报错
//			int p_ = c_2.getPort();
			
			new Thread() {
				public void run() {
					System.out.println("");
				};
			}.start();
		}
	}

}
