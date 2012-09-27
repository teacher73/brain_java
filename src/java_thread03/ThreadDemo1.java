/**
 *
 * @package		: java_thread03
 * @FileName	: ThreadDemo1.java
 * @Date  		: 2012. 9. 28.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package java_thread03;

/**
 * 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 9. 28. 오전 12:18:28
 * @version	1.0.0
 */

public class ThreadDemo1 extends Thread {
	int count;

	public ThreadDemo1(String name) {
		super(name);
		start();
	}

	public void run() {
		System.out.println(getName() + " 시작");
		do{
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(getName() + ", count is " + count);
			count++;
		}while(count < 10);
		System.out.println(getName() + " 끝");
	}

}
