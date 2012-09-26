/**
 *
 * @package		: java_thread01
 * @FileName	: ThreadEx01_Runnable.java
 * @Date  		: 2012. 9. 27.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package java_thread02;


/**
 * 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 9. 27. 오전 12:46:48
 * @version	1.0.0
 */

public class ThreadEx02_Runnable_02 implements Runnable{
	int cnt;
	Thread thread;
	
	/**
	 * Constructor of ThreadEx01_Runnable.java class
	 * @param string
	 */
	public ThreadEx02_Runnable_02(String name, int cnt) {
		this.cnt = cnt;
		
		thread = new Thread(this, name);
		thread.start();
	}

	/**
	 * call back method Thread가 해야될 일을 작성하는 부분
	 * 
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		int sum = 0;
		for (int i = 0; i < cnt; i++) {
			try {
				Thread.sleep(1000);	//1초동안 sleep 항상일정하게 번갈아가면서 수행됨
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			sum += i;
			//System.out.println(thread.getName() + " : " + sum);
			System.out.println(Thread.currentThread().getName() + " : " + sum);
		}
	}
	
	public static void main(String[] args) {
		ThreadEx02_Runnable_02 t1 = new ThreadEx02_Runnable_02("첫번째 스레드", 5);
		ThreadEx02_Runnable_02 t2 = new ThreadEx02_Runnable_02("두번째 스레드", 5);
	}//end of main
}
