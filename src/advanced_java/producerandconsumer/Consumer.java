/**
 *
 * @package		: advanced_java.producerandconsumer
 * @FileName	: Consumer.java
 * @Date  		: 2013. 1. 6.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package advanced_java.producerandconsumer;

/**
 * 
 * @author	mskim
 * @since	2013. 1. 6. 오후 12:49:13
 * @version	1.0.0
 */

public class Consumer extends Thread {
	WareHouse wareHouse;
	
	/**
	 * Constructor of Consumer.java class
	 */
	public Consumer(WareHouse wareHouse) {
		this.wareHouse = wareHouse;
	}
	
	public void run(){
		while(true)
			wareHouse.consume();
	}
}
