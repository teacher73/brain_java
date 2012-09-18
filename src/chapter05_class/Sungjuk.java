/**
 *
 * @package		: chapter05_class
 * @FileName	: Sungjuk.java
 * @Date  		: 2012. 9. 18.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package chapter05_class;

import java.util.Scanner;

/**
 * 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 9. 18. 오후 10:13:01
 * @version	1.0.0
 */

public class Sungjuk {
	public static void main(String[] args){
		String[] data={"김태희;99;98;97","이민정;81;82;83", "수지;77;78;79"};
		
		StudentClass sc01 = new StudentClass();
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<data.length;i++){
			String[] dat = data[i].split(";");

			sc01.addStudent(new Student(dat[0],
					Integer.parseInt(dat[1]),
					Integer.parseInt(dat[2]),
					Integer.parseInt(dat[3])));
		}
		/*prnClass(sc01);
		sc01.addStudent(new Student("태연", 91.1f,92.1f,93.4f));
		System.out.println();System.out.println();
		prnClass(sc01);
		sc01.delStudent(1);
		prnClass(sc01);*/
		boolean man=true;
		while(man){
			System.out.println("작업 번호를 입력하세요 1)추가 2)삭제 3)출력 4)종료");
			int num = sc.nextInt();
			switch(num){
			case 1: 
				addStudent(sc01);
				break;
			case 2:
				delStudent(sc01);
				break;
			case 3:
				prnClass(sc01);
				break;
			default:
				System.out.println("종료");
				man=false;
			}
		}
		sc.close();
	}
	
	public static void delStudent(StudentClass sc01) {
		System.out.println("삭제하고자하는 번호를 입력");
		Scanner sc = new Scanner(System.in);
		int idx = sc.nextInt();
		sc01.delStudent(idx-1);
		sc.close();
	}
	
	public static void addStudent(StudentClass sc01){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] data = str.split(";");
		sc01.addStudent(new Student(data[0], Float.parseFloat(data[1]),Float.parseFloat(data[2]),Float.parseFloat(data[3])));
	}
	
	public static void prnClass(StudentClass stdClass){
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=====================================================");
		System.out.println(stdClass);
	}
}
