/**
 *
 * @package		: java_thread03
 * @FileName	: ThreadDemo1.java
 * @Date  		: 2012. 9. 28.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package java_thread04;

/**
 * 
 * @author MinSu Kim (net94@nate.com)
 * @since 2012. 9. 28. 오전 12:18:28
 * @version 1.0.0
 */

public class ThreadDemo1_Runnable implements Runnable {
	int count;
	Thread t;

	public ThreadDemo1_Runnable(String name) {
		t = new Thread(this, name);
		t.start();
	}

	public void run() {
		System.out.println(t.getName() + " 시작");
		do {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ", count is " + count);
			count++;
		} while (count < 10);
		System.out.println(t.getName() + " 끝");
	}

}
