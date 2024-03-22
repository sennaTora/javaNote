package Third_file;
//11章

import java.sql.*;
//import pymysql;

//@SuppressWarnings("unused")   //忽视警告
public class JDBC_11chap {
	public static void main(String[] xxxxx) {
//		以下见P335
		Statement stmt_0  = null ;
		ResultSet rs_0    = null ;
		Connection conn_0 = null ;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");    //注册驱动程序
			String url_0      = "jdbc:mysql://localhost:3306/f_2";
			String username_0 = "root";
			String password_0 = "234247724";
			conn_0 = DriverManager.getConnection(url_0,username_0,password_0);//获取链接
			
			stmt_0 = conn_0.createStatement();         //获取执行者对象
//			String sql_0 = "select * from user_tb";    //这是，获取指定的表，嗯
//			rs_0 = stmt_0.executeQuery(sql_0);         //执行
//			System.out.println("");
//			有漏洞的普通方法
			int a_ = 20;String n_ = "Nuko";
//			rs_0 = stmt_0.executeQuery("select * from user_tb "
//					+ "where age = '"+a_+"' and username = '"+n_+"' ;"); ;
//			预处理，避免此漏洞
			String sql_1 = "select * from user_tb where age = ? and username = ?";
			PreparedStatement p_1 = conn_0.prepareStatement(sql_1);
			p_1.setObject(1,a_);
			p_1.setObject(2,n_);
			rs_0 = p_1.executeQuery();
			
//			获取列数
//			ResultSetMetaData mD_0 = rs_0.getMetaData();
//			int col_0 = mD_0.getColumnCount();
			
			while (rs_0.next()) {
				int age          = rs_0.getInt("age");
				String gender    = rs_0.getString("gender");
				String username  = rs_0.getString("username");
//				Date birthday_0  = rs_0.getDate("birthday_0");
				System.out.println(age+gender+username);
			}			

			System.out.println(rs_0);
//			Date d = stu.getBirthday();
//			SimpleDateFormat s_0 = new SimpleDateFormat("yyyy-MM-dd");
//	        String birthday = s_0.format(d);    //设置日期
//			int age = 315 ;
//			String sql_1 = "insert into user_tb values("+ age +",'女','mana') ;";
//			stmt_0.executeUpdate(sql_1);
			
//			String sql_1 = "drop table user_tb ;";
			
		}catch(Exception e) { e.printStackTrace(); 
		}finally {
			if(rs_0 != null) {
				try {rs_0.close();
				}catch(SQLException e) {e.printStackTrace();}
				rs_0 = null ;
			}
			
			if(stmt_0 != null) {
				try {
					stmt_0.close();
				}catch(SQLException e ) {e.printStackTrace();}
				stmt_0 = null ;
			}
			
			if(conn_0 != null) {
				try {
					conn_0.close();
				}catch(SQLException e ) {e.printStackTrace();}
				conn_0 = null ;
			}

		}
	}
}	