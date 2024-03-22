package Fourth_file;

import java.net.InetAddress;
//**
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;
//**

//13章    网络编程
public class Internet_13chap {
	public static void main(String[] xxxxx) throws Exception {
		InetAddress l_ = InetAddress.getLocalHost();
		InetAddress r_ = InetAddress.getByName("MY-COM-NAME");
		System.out.println("本地IP地址：        "+l_.getHostAddress());
		System.out.println("通过主机名获取的IP： "+r_.getHostAddress());
		System.out.println("3s内，能否到达此IP： "+r_.isReachable(3000));
//**↑关于IP
		URL url_0 = new URL("http","MY-COM-NAME",80,"ABA.html");//不知路径怎么写
		InputStream input_0 = url_0.openStream();
		Scanner scan_0 = new Scanner(input_0);
		scan_0.useDelimiter("\n");
		while(scan_0.hasNext()) {    System.out.println(scan_0.next());    }
		scan_0.close();
//**↑关于URL
		
	}
}
