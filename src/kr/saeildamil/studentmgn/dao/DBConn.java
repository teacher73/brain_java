package kr.saeildamil.studentmgn.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import kr.saeildamil.studentmgn.dao.delete.DbDeleteStudent;
import kr.saeildamil.studentmgn.dao.insert.DbInsertStudent;
import kr.saeildamil.studentmgn.dao.select.DbSelectStudent;
import kr.saeildamil.studentmgn.dao.update.DbUpdateStudent;

public class DBConn extends Conn {
	private String driver;
	private String url;
	private String id;
	private String pass;
	private Connection conn;
	private File file;
	
	private final String filepath = "StudentInfo.damil";
	
	private DBConn() {
		openConn();
		insStd = new DbInsertStudent(conn);
		upStd = new DbUpdateStudent();
		delStd = new DbDeleteStudent();
		selStd = new DbSelectStudent(conn);	
	}
	
	public static DBConn getInstance(){
		return new DBConn();
	}

	public Connection getConn() {
		return conn;
	}	
	
	
	public void openConn() {
		file = new File(filepath);
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(file));
			driver = in.readLine();
			url = in.readLine();
			id =in.readLine();
			pass = in.readLine();
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id, pass);
		} catch (IOException e) {
		} catch (ClassNotFoundException e) {
			System.out.println("DBConn() - DB 검색 실패");
			System.exit(-1);
		} catch (SQLException e) {
			System.out.println("DBConn() - Connection 객체 생성 실패");
			System.exit(-1);// -1인 경우 비정상 종료로 컴퓨터가 인식
		} finally{
			try {in.close();} catch (IOException e) {}
		}
	}

	public void closeConn() {
		if (conn != null){
			try {
				if (!conn.isClosed()){
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println("close() - Connection 객체 해제 실패");
			} finally{
				conn = null;
			}
		}

	}


}
