/**
 *
 * @package		: chapter05_class
 * @FileName	: Student.java
 * @Date  		: 2012. 9. 18.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package chapter05_class;

import java.util.Formatter;

/**
 * 학생 정보 클래스
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 9. 18. 오후 10:12:20
 * @version	1.0.0
 */

public class Student {
	private String stdName;
	private float korScore;
	private float engScore;
	private float mathScore;
	private float sumScore;
	private float avgScore;
	
	/**
	 * Constructor of Student.java class
	 * @param stdName 학생명
	 * @param korScore 국어점수(0~100)
	 * @param engScore 영어점수(0~100)
	 * @param mathScore 수학점수(0~100)
	 */
	public Student(String stdName, float korScore, float engScore, float mathScore) {
		this.stdName = stdName;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
		this.sumScore = korScore + engScore + mathScore;
		this.avgScore = this.sumScore/3;
	}

	/**
	 * @return the stdName
	 */
	public String getStdName() {
		return stdName;
	}

	/**
	 * @param stdName the stdName to set
	 */
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	/**
	 * @return the korScore
	 */
	public float getKorScore() {
		return korScore;
	}

	/**
	 * @param korScore the korScore to set
	 */
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	/**
	 * @return the engScore
	 */
	public float getEngScore() {
		return engScore;
	}

	/**
	 * @param engScore the engScore to set
	 */
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	/**
	 * @return the mathScore
	 */
	public float getMathScore() {
		return mathScore;
	}

	/**
	 * @param mathScore the mathScore to set
	 */
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	/**
	 * @return the sumScore
	 */
	public float getSumScore() {
		return sumScore;
	}

	/**
	 * @return the avgScore
	 */
	public float getAvgScore() {
		return avgScore;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Formatter f = new Formatter(sb);
		f.format("%s\t%3.1f\t%3.1f\t%3.1f\t%3.1f\t%3.1f\n",
				this.stdName,this.korScore, this.engScore, this.mathScore,
				this.sumScore, this.avgScore);

		return sb.toString();
	}

	
}
