/**
 *
 * @package		: chapter16
 * @FileName	: PiggyBank.java
 * @Date  		: 2012. 10. 7.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package chapter16;

/**
 * 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 10. 7. 오후 10:13:07
 * @version	1.0.0
 */

class PiggyBank {   // 돼지 저금통 클래스
    int total;          
    Slot slot;
    PiggyBank() {
        total = 0;
        slot = new Slot();
    }
    class Slot {   // 입구 클래스
        void put(int amount) {
            total += amount;
        }
    }
}

