/**
 *
 * @package		: java_thread05
 * @FileName	: SingleThreadEx01.java
 * @Date  		: 2012. 10. 7.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package java_thread05;

/**
 * 
 * @author MinSu Kim (net94@nate.com)
 * @since 2012. 10. 7. 오후 3:22:37
 * @version 1.0.0
 */

public class SingleThreadEx01 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 300; i++)
			System.out.print("*");
		long endTime = System.currentTimeMillis();
		System.out.println("\n소요 시간1 : " + (endTime-startTime));
		
		for (int i = 0; i < 300; i++)
			System.out.print("#");
		long endTime2 = System.currentTimeMillis();
		System.out.println("\n소요 시간2 : " + (endTime2-startTime));
	}// end of main
}
