/**
 *
 * @package		: advanced_java.collection
 * @FileName	: StaticImport.java
 * @Date  		: 2013. 1. 6.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package advanced_java.collection;


import static java.lang.Math.abs;
/**
 * import static
 * 일반 import는 패키지 명을 선언하지 않고도 클래스를 사용할 수 있게 하는 것이고(ex Math.random())
 * static import는 클래스명을 선언하지 않고도 정적 변수와 정적 메소드 같은 정적 멤버를 사용할 수 있게 된다.(ex random())
 * @author	mskim
 * @since	2013. 1. 6. 오후 1:11:39
 * @version	1.0.0
 */

public class StaticImport {
	public static void main(String[] args) {
		System.out.println(abs(-10));//정적 임포트를 하면 Math.abs()할 필요없이 abs()해도된다.
		System.out.println(Math.random());//정적임포트를 하지않으면 클래스명까지 
	}//end of main
}
