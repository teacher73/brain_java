/**
 *
 * @package		: java_thread01
 * @FileName	: ThreadEx01_Runnable.java
 * @Date  		: 2012. 9. 27.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package java_thread01;

/**
 * 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 9. 27. 오전 12:46:48
 * @version	1.0.0
 */

public class ThreadEx01_Runnable_01 implements Runnable{
	int cnt;
	String name;
	/**
	 * Constructor of ThreadEx01_Runnable.java class
	 * @param string
	 */
	public ThreadEx01_Runnable_01(String name, int cnt) {
		this.cnt = cnt;
		this.name = name;
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
			System.out.println(name + " : " + sum);
		}
	}
	
	public static void main(String[] args) {
		ThreadEx01 t1, t2;
		t1 = new ThreadEx01("첫번째 스레드", 5);
		t2 = new ThreadEx01("두번째 스레드", 5);
		
		Thread tt1 = new Thread(t1);
		Thread tt2 = new Thread(t2);
		
		tt1.start();
		tt2.start();
	}//end of main
}
