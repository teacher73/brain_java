/**
 *
 * @package		: java_thread01
 * @FileName	: ThreadEx01.java
 * @Date  		: 2012. 9. 27.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package java_thread01;

/**
 * thread 첫번째 예제 3개의 Thread main, t1, t2 extends 를 쓰지 않으면 1개 쓰레드가 됨(single)
 * 
 * @author MinSu Kim (net94@nate.com)
 * @since 2012. 9. 27. 오전 12:14:55
 * @version 1.0.0
 */

public class ThreadEx01 extends Thread {
	int cnt;
	/**
	 * Constructor of ThreadEx01.java class
	 * @param string
	 */
	public ThreadEx01(String name, int cnt) {
		super(name);
		this.cnt = cnt;
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
				sleep(1000);	//1초동안 sleep 항상일정하게 번갈아가면서 수행됨
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			sum += i;
			System.out.println(getName() + " : " + sum);
		}
	}

	public static void main(String[] args) {
		ThreadEx01 t1, t2;
		t1 = new ThreadEx01("첫번째 스레드", 5);
		t2 = new ThreadEx01("두번째 스레드", 5);
		t1.start();
		t2.start();
	}// end of main
}
