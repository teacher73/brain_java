package kr.saeildamil.studentmgn.ctrl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import kr.saeildamil.studentmgn.common.Student;

public class StudentManger {
	ArrayList<Student> stdList;

	public StudentManger() {
		readFile();
		prnStdList();
		init();
	}

	private void init() {
		boolean isFinish = false;
		do {
			int respon = Integer.parseInt(inputKey("1.입력 2.수정 3.삭제 4.출력 5.종료"));
			System.out.println(respon);			
			switch (respon) {
			case 1:
				registerStd(inputKey("학생명,국어,영어,수학"));
				break;
			case 2:
				int result = Integer.parseInt(inputKey("수정 할 학생 번호"));
				updateStd(result, inputKey("학생명,국어,영어,수학"));
				break;
			case 3:
				unregisterStd(inputKey("삭제 할 학생 번호"));
				break;
			case 4:
				prnStdList();
				break;
			default:
				isFinish = true;
				writeFile();
				break;
			}
		} while (!isFinish);

	}


	private void updateStd(int result, String str) {
		String[] data = str.split(",");
		Student std = new Student(data[0], Float.parseFloat(data[1]), Float.parseFloat(data[2]), Float.parseFloat(data[3]));
		this.stdList.set(result-1, std);
	}

	private void unregisterStd(String str) {
		stdList.remove(Integer.parseInt(str) - 1);
	}

	private void registerStd(String str) {
		System.out.println(str);
		String[] strDat = str.split(",");
		if(strDat.length!=4)return;
		Student std = new Student(strDat[0], Float.parseFloat(strDat[1]),
				Float.parseFloat(strDat[2]), Float.parseFloat(strDat[3]));
		stdList.add(std);
	}
	
	private void writeFile(){
		File file = new File("StudentList.data");
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

	private void readFile(){
		File file = new File("StudentList.data");
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
	private String inputKey(String str) {
		Scanner sc2 = new Scanner(System.in);
		System.out.println(str + " 를(을) 입력하세요");
		return sc2.next();
	}

	private void prnStdList() {
		int idx = 1;
		for (Student std : stdList){
			System.out.print(idx++ + " : " + std);
			System.out.println();
		}
		System.out.println();
	}

}
