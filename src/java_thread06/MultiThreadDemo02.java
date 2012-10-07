/**
 *
 * @package		: java_thread05
 * @FileName	: MultiThreadDemo01.java
 * @Date  		: 2012. 10. 7.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package java_thread06;

/**
 * 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 10. 7. 오후 3:31:28
 * @version	1.0.0
 */

public class MultiThreadDemo02 extends Thread{

	@Override
	public void run() {
		for(int i=10; i>0 ; i--){
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
