/**
 *
 * @package		: java_thread05
 * @FileName	: SingleThreadEx01.java
 * @Date  		: 2012. 10. 7.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package java_thread06;

import javax.swing.JOptionPane;

/**
 * 
 * @author MinSu Kim (net94@nate.com)
 * @since 2012. 10. 7. 오후 3:22:37
 * @version 1.0.0
 */

public class SingleThreadEx02 {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("아무 값이나 입력");
		System.out.println("입력한 값은 " + input + "입니다.");
		
		for(int i=10; i>0 ; i--){
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}// end of main
}
