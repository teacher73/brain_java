package kr.saeildamil.studentmgn.dao.open;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import kr.saeildamil.studentmgn.common.Student;

public class FileOpenDao implements OpenDao {
	private ArrayList<Student> stdList;
	private File file;
	
	
	public FileOpenDao(ArrayList<Student> stdList, File file) {
		super();
		this.stdList = stdList;
		this.file = file;
	}

	@Override
	public void openRes() {
		if (!file.exists())
			try {
				file.createNewFile();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(file));
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

}
