package sec06.ch08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExceptionExam4 {
	public static void main(String[] args) {
		//싱글톤 : 프로그램에서 객체가 1개만 만들어지도록 유도. 
		DbUtils du = DbUtils.getInstance();
	}
}

class DbUtils {
	// 57 12 7.5
	private DbUtils () {}
	private static DbUtils dbutils;
	
	public static DbUtils getInstance() {
		if(dbutils == null) {
			dbutils = new DbUtils();
		}
		return dbutils;
	}
	
	Connection getCon() {
		Connection con = null;
		
		try {
//			Class.forName("com.mysql.jdbc.Driver");  //드라이버 로딩
			final String URL = "jdbc:mysql://localhost:3308/java";
							  //jdbc:mssql://ip주소 : 포트번호/db명;
			final String USERNAME = "root";
			final String PASSWORD = "koreait";
			
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("접속성공");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("접속실패");
		} 

		return con;
	}
}