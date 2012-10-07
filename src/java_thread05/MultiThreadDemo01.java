/**
 *
 * @package		: java_thread05
 * @FileName	: MultiThreadDemo01.java
 * @Date  		: 2012. 10. 7.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package java_thread05;

/**
 * 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 10. 7. 오후 3:31:28
 * @version	1.0.0
 */

public class MultiThreadDemo01 extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 300; i++)
			System.out.print("#");
		long endTime = System.currentTimeMillis();
		System.out.println("\n소요 시간2 : " + (endTime-MultiThreadEx01.startTime));
	}
}
