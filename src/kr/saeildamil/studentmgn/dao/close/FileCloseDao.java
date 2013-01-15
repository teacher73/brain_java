package kr.saeildamil.studentmgn.dao.close;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import kr.saeildamil.studentmgn.common.Student;

public class FileCloseDao implements CloseDao {
	File file;
	ArrayList<Student> stdList;
	
	public FileCloseDao(File file, ArrayList<Student> stdList) {
		this.file = file;
		this.stdList = stdList;
	}

	@Override
	public void closeRes() {
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
