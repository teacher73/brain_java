/**
 *
 * @package		: java_thread05
 * @FileName	: MultiThreadEx01.java
 * @Date  		: 2012. 10. 7.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package java_thread06;

import javax.swing.JOptionPane;

/**
 * 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 10. 7. 오후 3:28:24
 * @version	1.0.0
 */

public class MultiThreadEx02 {
	
	public static void main(String[] args) {
		MultiThreadDemo02 mtd = new MultiThreadDemo02();
		mtd.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력");
		System.out.println("입력한 값은 " + input + "입니다.");
		
	}//end of main
}
