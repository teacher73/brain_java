package kr.saeildamil.studentmgn.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

import kr.saeildamil.studentmgn.common.Student;
import kr.saeildamil.studentmgn.dao.delete.FileDeleteStudent;
import kr.saeildamil.studentmgn.dao.insert.FileInsertStudent;
import kr.saeildamil.studentmgn.dao.select.FileSelectStudent;
import kr.saeildamil.studentmgn.dao.update.FileUpdateStudent;

public class FileConn extends Conn {
	protected ArrayList<Student> stdList;
	private File file;
	private final String filepath = "StudentList.data"; 
	
	private FileConn() {
		file = new File(filepath);
		openCon();
		insStd = new FileInsertStudent(stdList);
		upStd = new FileUpdateStudent(stdList);
		delStd = new FileDeleteStudent(stdList);
		selStd = new FileSelectStudent(stdList);	
	}
	
	public static FileConn getInstance(){
		return new FileConn();
	}
	
	@Override
	public void openCon() {
		if (!file.exists())
			try {
				file.createNewFile();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(file));
			stdList = new ArrayList<>();
			while(in.ready()){
				String stdstr = in.readLine();
				StringTokenizer st = new StringTokenizer(stdstr);
				Student std = new Student(st.nextToken(), Float.parseFloat(st.nextToken()),
						Float.parseFloat(st.nextToken()), Float.parseFloat(st.nextToken()));
				stdList.add(std);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
	}

	@Override
	public void closeCon() {
		PrintWriter fw=null;
		try {
			fw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			for(Student std : stdList){
			fw.write(std.toString()+"\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			fw.close();
		}		
	}

}
