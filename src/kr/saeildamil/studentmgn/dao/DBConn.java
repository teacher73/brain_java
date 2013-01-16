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
	private Connection conn;
	private File file;
	
	private final String filepath = "StudentInfo.damil";
	
	private DBConn() {
		openConn();
		insStd = new DbInsertStudent();
		upStd = new DbUpdateStudent();
		delStd = new DbDeleteStudent();
		selStd = new DbSelectStudent();	
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
			Class.forName(in.readLine());
			conn = DriverManager.getConnection(in.readLine(), in.readLine(), in.readLine());
			System.out.println("openConn() - Success");
		} catch (IOException e) {
		} catch (ClassNotFoundException e) {
			System.out.println("openConn() - DB 검색 실패");
			System.exit(-1);
		} catch (SQLException e) {
			System.out.println("openConn() - Connection 객체 생성 실패");
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
					System.out.println("closeConn() - Connection 객체 해제");
				}
			} catch (SQLException e) {
				System.out.println("closeConn() - Connection 객체 해제 실패");
			} finally{
				conn = null;
			}
		}
	}

}
