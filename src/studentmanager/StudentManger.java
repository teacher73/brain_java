package studentmanager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentManger {
	ArrayList<Student> stdList;

	public StudentManger() {
		stdList = new ArrayList<>();
		init();
	}

	private void init() {
		readFile();
		boolean isFinish = false;
		Scanner sc = new  Scanner(System.in);
		do {
			System.out.println("1.입력 2.수정 3.삭제 4.출력 5.종료");
			int respon=0;
			try{
				respon = sc.nextInt();
			}catch(NoSuchElementException e){}
			
			switch (respon) {
			case 1:
				registerStd("학생명,국어,영어,수학");
				break;
			case 2:
				System.out.println("수정");
				break;
			case 3:
				System.out.println("삭제");
				break;
			case 4:
				prnStdList();
				break;
			default:
				isFinish = true;
				;
				break;
			}
		} while (!isFinish);

	}


	private void registerStd(String str) {
		String data = inputKey(str);
		String[] strDat = data.split(",");
		if(strDat.length!=4)return;
		Student std = new Student(strDat[0], Float.parseFloat(strDat[1]),
				Float.parseFloat(strDat[2]), Float.parseFloat(strDat[3]));
		stdList.add(std);
		writeFile(std);
	}
	
	private void writeFile(Student std){
		File file = new File("StudentList.data");
		PrintWriter fw=null;
		try {
			fw = new PrintWriter(new BufferedWriter(new FileWriter(file,true)));
			fw.write(std.toString()+"\n");
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
			in = new BufferedReader(new FileReader("StudentList.data"));
			while(in.ready()){
				String stdstr = in.readLine();
				System.out.println(stdstr);
				StringTokenizer st = new StringTokenizer(stdstr);
				Student std = new Student(st.nextToken(), Float.parseFloat(st.nextToken()),
						Float.parseFloat(st.nextToken()), Float.parseFloat(st.nextToken()));
				stdList.add(std);
			}
			System.out.println();
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
		System.out.println(str + " 입력하세요");
		return sc2.next();
	}

	private void prnStdList() {
		for (Student std : stdList){
			System.out.print(std);
			System.out.println();
		}
		System.out.println();
	}

}
