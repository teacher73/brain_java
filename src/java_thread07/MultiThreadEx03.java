/**
 *
 * @package		: java_thread05
 * @FileName	: MultiThreadEx01.java
 * @Date  		: 2012. 10. 7.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package java_thread07;


/**
 * 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 10. 7. 오후 3:28:24
 * @version	1.0.0
 */

public class MultiThreadEx03 {
	static boolean inputCheck = false;
	
	public static void main(String[] args) {
		InputThreadDemo03 itd = new InputThreadDemo03();
		MultiThreadDemo03 mtd = new MultiThreadDemo03();
		itd.start();
		mtd.start();
		
	}//end of main
}
