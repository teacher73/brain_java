/**
 *
 * @package		: factory_pattern.old
 * @FileName	: GreekPizza.java
 * @Date  		: 2012. 9. 23.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package designpattern.factory_pattern.pizza03;

/**
 * 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 9. 23. 오전 9:39:48
 * @version	1.0.0
 */

public class NYStyleGreekPizza extends Pizza{

	/**
	 * Constructor of GreekPizza.java class
	 */
	public NYStyleGreekPizza() {
		super();
		name = "GreekPizza";
		System.out.println("CreekPizza");
	}
	
}