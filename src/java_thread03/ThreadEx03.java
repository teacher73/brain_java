/**
 *
 * @package		: java_thread03
 * @FileName	: ThreadEx03.java
 * @Date  		: 2012. 9. 28.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package java_thread03;

/**
 * 
 * @author MinSu Kim (net94@nate.com)
 * @since 2012. 9. 28. 오전 12:14:58
 * @version 1.0.0
 */

public class ThreadEx03 {
	public static void main(String[] args) {
		System.out.println("메인 스레드 시작");
		ThreadDemo1 td1 = new ThreadDemo1("자식 스레드1");
		

		do{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(".");

		}while(td1.count< 10);
		
		System.out.println("메인스레드 끝");
	}// end of main
}
