/**
 *
 * @package		: java_thread07
 * @FileName	: InputThreadDemo03.java
 * @Date  		: 2012. 10. 7.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package java_thread07;

import javax.swing.JOptionPane;

/**
 * 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 10. 7. 오후 3:46:00
 * @version	1.0.0
 */

public class InputThreadDemo03 extends Thread{

	public void run() {
		System.out.println("10초 안에 값을 입력해야 합니다.");
		String input = JOptionPane.showInputDialog("아무 값이나 입력");
		MultiThreadEx03.inputCheck = true;
		System.out.println("입력한 값은 " + input + "입니다.");
	}
}
