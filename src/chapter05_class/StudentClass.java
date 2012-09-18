/**
 *
 * @package		: chapter05_class
 * @FileName	: StudentClass.java
 * @Date  		: 2012. 9. 18.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package chapter05_class;

import java.util.ArrayList;
import java.util.Formatter;

/**
 * 반 정보
 * 
 * @author MinSu Kim (net94@nate.com)
 * @since 2012. 9. 18. 오후 10:12:33
 * @version 1.0.0
 */

public class StudentClass {
	private ArrayList<Student> stdClass;
	private float classKorTotal;
	private float classEngTotal;
	private float classMathTotal;
	private float classSumTotal;
	private float classAvgTotal;

	public StudentClass() {
		stdClass = new ArrayList<Student>();
	}

	public void addStudent(Student std) {
		stdClass.add(std);
		setSubjectTotal();
	}

	public void delStudent(int idx) {
		stdClass.remove(idx-1);
		setSubjectTotal();
	}

	public Student getStudent(int idx) {
		return stdClass.get(idx);
	}

	public void setSubjectTotal() {
		initTotal();
		for (Student std : stdClass) {
			classKorTotal += std.getKorScore();
			classEngTotal += std.getEngScore();
			classMathTotal += std.getMathScore();
		}
		classKorTotal /= stdClass.size();
		classEngTotal /= stdClass.size();
		classMathTotal /= stdClass.size();
		
		classSumTotal = classKorTotal + classEngTotal + classMathTotal;
		classAvgTotal = classSumTotal/stdClass.size();
	}

	public void initTotal() {
		classKorTotal = 0;
		classEngTotal = 0;
		classMathTotal = 0;
		classSumTotal = 0;
		classAvgTotal = 0;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Formatter f = new Formatter(sb);
		for(int i=0; i<stdClass.size();i++){
			sb.append((i+1)+"\t" + stdClass.get(i));
		}
		sb.append("=====================================================\n");
		f.format("%s\t\t%3.1f\t%3.1f\t%3.1f\t%3.1f\t%3.1f\n", 
				"통계", classKorTotal, classEngTotal, classMathTotal, classSumTotal, classAvgTotal);
		return sb.toString();
	}

}
