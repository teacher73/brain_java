/**
 *
 * @package		: java_thread05
 * @FileName	: MultiThreadEx01.java
 * @Date  		: 2012. 10. 7.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package java_thread05;

/**
 * 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 10. 7. 오후 3:28:24
 * @version	1.0.0
 */

public class MultiThreadEx01 {
	static long startTime = 0;
	
	public static void main(String[] args) {
		MultiThreadDemo01 mtd = new MultiThreadDemo01();
		mtd.start();
		
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 300; i++)
			System.out.print("*");
		long endTime = System.currentTimeMillis();
		System.out.println("\n소요 시간1 : " + (endTime-startTime));
	}//end of main
}
