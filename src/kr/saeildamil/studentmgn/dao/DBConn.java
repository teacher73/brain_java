package kr.saeildamil.studentmgn.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import kr.saeildamil.studentmgn.common.Student;
import kr.saeildamil.studentmgn.dao.delete.DbDeleteStudent;
import kr.saeildamil.studentmgn.dao.insert.DbInsertStudent;
import kr.saeildamil.studentmgn.dao.update.DbUpdateStudent;

public class DBConn extends Conn {
	private String driver;
	private String url;
	private String id;
	private String pass;
	private Connection conn;
	private File file;
	
	private final String filepath = "StudentInfo.damil";
	
	public DBConn() {
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
		init();
	}
	
	private void init(){
		setInsStd(new DbInsertStudent());
		setUpStd(new DbUpdateStudent());
		setDelStd(new DbDeleteStudent());
		openCon();
	}

	public static DBConn getInstance(){
		return new DBConn();
	}
	
	public Connection getConn(){
		return this.conn;
	}

	@Override
	public void openCon() {
		selectStudent();
	}

	@Override
	public void closeCon() {
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

	@Override
	public void insertStudent(Student std) {
		insStd.insertStudent(stdList, std);
	}

	@Override
	public void updateStudent(int idx, Student std) {
		upStd.updateStudent(stdList, idx, std);		
	}

	@Override
	public void deleteStudent(int idx) {
		delStd.deleteStudent(stdList, idx);
	}

	@Override
	public void selectStudent() {
		selStd.selectStudent(stdList);		
	}

}
