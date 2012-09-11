/**
 *
 * @package		: chapter02
 * @FileName	: Exception01.java
 * @Date  		: 2012. 9. 11.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package chapter02;

import javax.swing.JOptionPane;

/**
 * 익셉션 처리에 사용되는 try 문
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 9. 11. 오후 11:36:51
 * @version	1.0.0
 */

public class Exception01 {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("수를 입력하시오");
		String b = JOptionPane.showInputDialog("수를 입력하시오");
        int result;
        try{
        	result = Integer.parseInt(a) / Integer.parseInt(b);
        	System.out.println(result);
        }catch(ArithmeticException e){
        	System.out.println("잘못된 연산 수행");
        }finally{
        	System.out.println("Done.");
        }

	}
}
