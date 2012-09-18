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
		Student std;
		for(int i=0; i<data.length;i++){
			String[] dat = data[i].split(";");
			std = new Student(dat[0],
					Integer.parseInt(dat[1]),
					Integer.parseInt(dat[2]),
					Integer.parseInt(dat[3]));
			sc01.addStudent(std);
		}
		prnClass(sc01);
		sc01.addStudent(new Student("태연", 91.1f,92.1f,93.4f));
		System.out.println();System.out.println();
		prnClass(sc01);
	}
	
	public static void prnClass(StudentClass stdClass){
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("============================================");
		System.out.println(stdClass);
	}
}
