/**
 *
 * @package		: advanced_java.producerandconsumer
 * @FileName	: TestDriver.java
 * @Date  		: 2013. 1. 6.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package advanced_java.producerandconsumer;

/**
 * 
 * @author	mskim
 * @since	2013. 1. 6. 오후 12:56:06
 * @version	1.0.0
 */

public class TestDriver {
	public static void main(String[] args) {
		WareHouse wareHouse =new WareHouse();
		
		new Producer(wareHouse).start();
		new Producer(wareHouse).start();
		new Producer(wareHouse).start();
		new Producer(wareHouse).start();
		new Consumer(wareHouse).start();
		
	}//end of main
}
