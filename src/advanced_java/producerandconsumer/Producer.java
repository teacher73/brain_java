/**
 *
 * @package		: advanced_java.producerandconsumer
 * @FileName	: Producer.java
 * @Date  		: 2013. 1. 6.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package advanced_java.producerandconsumer;

/**
 * 
 * @author	mskim
 * @since	2013. 1. 6. 오후 12:55:18
 * @version	1.0.0
 */

public class Producer extends Thread {
	WareHouse wareHouse;

	/**
	 * Constructor of Producer.java class
	 * @param wareHouse
	 */
	public Producer(WareHouse wareHouse) {
		this.wareHouse = wareHouse;
	}
	
	/**
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		while(true)
			wareHouse.produce();
	}
}
