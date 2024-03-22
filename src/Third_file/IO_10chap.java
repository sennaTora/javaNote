package Third_file;
//10章    I/O流

import java.io.*;
//file类，P300~308

class i implements Serializable{           //P321，搁置
	private static final long serialVersionUID = 1l;
	//然后正常写
}

public class IO_10chap{
	public static void main(String[] args) throws Exception{
//		InputStream input = null;
//		try {             
		FileInputStream in_1 = new FileInputStream("1111被读取.txt");
		int b = 0;
		while(true) {
			b = in_1.read();                //读文件
			if(b == -1) {break;}
			System.out.println(b);
		}
		in_1.close();
//		}
//		finally {
//			if(input != null) {	input.close(); }
//		}
		
		
		
		OutputStream out = new FileOutputStream("2222被写入.txt");
		String str = "qwertyuiop";    //这个是输入的内容
		byte[] by =str.getBytes();
		for (int i=0; i<by.length;i++) {
			out.write(by[i]);               //写文件
		}
		out.close();
		
		
		InputStream in_2 = new FileInputStream("2222被写入.txt");//因为是字节流，图片也可以
		OutputStream out_2 = new FileOutputStream("3333复制了222.txt");
		int len ;
		long begintime = System.currentTimeMillis();
		while((len = in_2.read())!=-1) {                       //复制(逐字节)
			out_2.write(len);
		}
		long endtime = System.currentTimeMillis();
		System.out.println("复制文件所消耗的时间是："+ (endtime - begintime) + "ms");
		in_2.close();
		out_2.close();
		
		
		InputStream in_3 = new FileInputStream("2222被写入.txt");
		OutputStream out_3 = new FileOutputStream("4444复制了2222.txt");
		byte[] buff = new byte[1024];                //不同处
		int len_ ;
		long begintime_ = System.currentTimeMillis();
		while((len_ = in_3.read(buff))!=-1) {        //不同处       //复制(字节数组)
			out_3.write(buff,0,len_);
		}
		long endtime_ = System.currentTimeMillis();
		System.out.println("复制文件所消耗的时间是："+ (endtime_ - begintime_) + "ms");
		in_3.close();
		out_3.close();
		//字节流↑
//////////////////////////////////////////////////////////////////////////
		//字符流↓
		FileReader reader_0 = new FileReader("aaaa被读取.txt");
		int ch;
		while((ch=reader_0.read())!=-1) {             //输出
			System.out.print((char)ch);
		}
		reader_0.close();
		
		FileWriter writer_0 = new FileWriter("bbbb被写入.txt");
		String str_0 = "784951620";
		writer_0.write(str_0);                        //输入
		writer_0.close();		
		
		FileWriter writer_1 = new FileWriter("bbbb被写入.txt",true);
		String str_1 = "zxcvbnm";
		writer_1.write(str_1);                        //继续输入
		writer_1.close();
///////////////////////////////////////////////////////////////////////////
//		转换流
		FileInputStream in_0 = new FileInputStream("！！！！被读取.txt");
		InputStreamReader isr_0 = new InputStreamReader(in_0);//转换
		FileOutputStream out_0 = new FileOutputStream("！！！！转换后被输出的结果.txt");
		OutputStreamWriter osw_0 = new OutputStreamWriter(out_0);
		int ch_0 ; 
		while ((ch_0 = isr_0.read()) != -1){
			osw_0.write(ch_0);
		}
		isr_0.close();
		osw_0.close();
  }
}
