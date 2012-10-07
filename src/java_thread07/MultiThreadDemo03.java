/**
 *
 * @package		: java_thread05
 * @FileName	: MultiThreadDemo01.java
 * @Date  		: 2012. 10. 7.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package java_thread07;

/**
 * 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 10. 7. 오후 3:31:28
 * @version	1.0.0
 */

public class MultiThreadDemo03 extends Thread{

	public void run() {
		for(int i=10; i>0 ; i--){
			if (MultiThreadEx03.inputCheck) return;
			
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("10초 동안 값이 입력되지 않아 종료합니다.");
		System.exit(0);
	}
	

}
