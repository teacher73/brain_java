/**
 *
 * @package		: advanced_java.producerandconsumer
 * @FileName	: WareHouse.java
 * @Date  		: 2013. 1. 6.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package advanced_java.producerandconsumer;

/**
 * 
 * @author mskim
 * @since 2013. 1. 6. 오후 12:49:54
 * @version 1.0.0
 */

public class WareHouse {
	private int product;

	public synchronized void produce() {//생산자
		try {
			if (product != 0) {
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		
		product = 1;
		System.out.println("Producer produce : " + product);
		notifyAll();
	}
	
	public synchronized void consume(){//소비자
		try {
			if (product == 0){
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Consumer consume : " + product);
		product = 0;
		notifyAll();
	}
}
