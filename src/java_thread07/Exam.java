/**
 *
 * @package		: java_thread07
 * @FileName	: Exam.java
 * @Date  		: 2012. 10. 7.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package java_thread07;

/**
 * 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 10. 7. 오후 3:56:37
 * @version	1.0.0
 */

public class Exam {
	//멀티 스레드로 한번씩 번갈아 가면서 실행되도록 변경하시오
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		for(int i=0; i<10; i++){
			System.out.print(i);
		}
		
		for(char i='A'; i<='Z'; i++){
			System.out.print(i);
		}
		
		for(char i='a'; i<='z'; i++){
			System.out.print(i);
		}
		
		char[] arr={'ㄱ','ㄴ','ㄷ','ㄹ','ㅁ','ㅂ','ㅅ','ㅇ','ㅈ','ㅊ','ㅋ','ㅌ','ㅍ','ㅎ'};
		for(char i: arr)
			System.out.print(i);
	}

}
