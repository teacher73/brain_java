/**
 *
 * @package		: chapter02
 * @FileName	: Method04.java
 * @Date  		: 2012. 9. 11.
 * @version  	: 1.0.0
 * @Comment  	: 명령행 파라미터를 출력하는 프로그램
 *
 */

package chapter02;

/**
 * 명령행 파라미터를 출력하는 프로그램
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 9. 11. 오후 11:34:19
 * @version	1.0.0
 */

public class Method04 {
	public static void main(String[] args) {
		for(String str: args)
			System.out.println(str);
		System.out.println("args.length=" + args.length);
	}
}
