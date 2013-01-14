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
import kr.saeildamil.studentmgn.dao.update.FileUpdateStudent;

public class FileConn extends Conn {
	private File file;
	private final String filepath = "StudentList.data"; 
	
	public FileConn() {
		file = new File(filepath);
		setInsStd(new FileInsertStudent());
		setUpStd(new FileUpdateStudent());
		setDelStd(new FileDeleteStudent());
		
		openCon();
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
			this.stdList = new ArrayList<>();
			while(in.ready()){
				String stdstr = in.readLine();
				StringTokenizer st = new StringTokenizer(stdstr);
				Student std = new Student(st.nextToken(), Float.parseFloat(st.nextToken()),
						Float.parseFloat(st.nextToken()), Float.parseFloat(st.nextToken()));
				this.stdList.add(std);
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
			for(Student std : this.stdList){
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
