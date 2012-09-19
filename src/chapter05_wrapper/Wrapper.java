/**
 *
 * @package		: chapter05_wrapper
 * @FileName	: Wrapper.java
 * @Date  		: 2012. 9. 19.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package chapter05_wrapper;

/**
 * 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 9. 19. 오후 11:24:27
 * @version	1.0.0
 */

public class Wrapper {
	public static void main(String[] args){
		Integer obj =new Integer(4);
		Integer obj1 = new Integer(5);
		
		System.out.println(obj.getClass().getSimpleName() + obj);
		System.out.println(obj1.getClass().getSimpleName() + obj1);
		swap(obj, obj1);
		System.out.println(obj.getClass().getSimpleName() + obj);
		System.out.println(obj1.getClass().getSimpleName() + obj1);
	}

	/**
	 * 
	 * @param obj
	 * @param obj1
	 */
	
	
	private static void swap(Integer obj, Integer obj1) {
		Integer temp=obj;
		obj = obj1;
		obj1 = temp;
	}
}
