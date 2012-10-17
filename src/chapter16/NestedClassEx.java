/**
 *
 * @package		: chapter16
 * @FileName	: NestedClassEx.java
 * @Date  		: 2012. 10. 7.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package chapter16;

/**
 * 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 10. 7. 오후 10:14:06
 * @version	1.0.0
 */

public class NestedClassEx {
	public static void main(String args[]) {
        /*PiggyBank bank1 = new PiggyBank();
        PiggyBank bank2 = new PiggyBank();
        PiggyBank bank3 = new PiggyBank();
        bank2.slot.put(100);
        System.out.println("첫번째 돼지 저금통: " + bank1.total);
        System.out.println("두번째 돼지 저금통: " + bank2.total);
        System.out.println("세번째 돼지 저금통: " + bank3.total);
        
        PiggyBank bank4 = new PiggyBank();
        PiggyBank bank5 = new PiggyBank();
        
        PiggyBank.Slot temp = bank4.slot;
        bank4.slot = bank5.slot;
        bank5.slot = temp;
        
        bank4.slot.put(10000);
        bank5.slot.put(10);
        System.out.println("네번째 돼지 저금통: " + bank4.total);
        System.out.println("다섯번째 돼지 저금통: " + bank5.total);*/

        Cart cart = new Cart();
        cart.addItem("쵸콜렛", 3, 1000);
        cart.addItem("케이크", 1, 25000);
        cart.addItem("샴페인", 1, 7000);
        
        Cart.Item item = cart.new Item("꽃다발", 1, 50000);
        cart.list.add(item);

        printCart(cart);
 
    }
	
	static void printCart(Cart cart) {      
        int num = cart.getItemNum();
        System.out.println("      상품명   수량   단가    금액");        
        System.out.println("----------------------------------");        
        for (int cnt = 0; cnt < num; cnt++) {
            Cart.Item item = cart.getItem(cnt);
            System.out.printf("%3d %5s %5d %7d %7d %n", cnt+1, 
                   item.name, item.num, item.unitPrice, item.getPrice());
        }
        System.out.println("----------------------------------");        
        System.out.printf("      총계              %10d %n", cart.getTotalPrice());
    }
}
