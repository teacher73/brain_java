/**
 *
 * @package		: advanced_java.formatting
 * @FileName	: FormattingEX.java
 * @Date  		: 2013. 1. 6.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package advanced_java.formatting;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Formatting
 * %1$+010.3f
 * % : 포매팅 지정자(Format Specifier)
 * 1$ : 매개변수 인덱스(Argument Index) 1은 매개변수의 순서
 * + : 플래그(flag) => '+' 는 부호, ','는 숫자 그룹핑 문자(,)를 추가, '(' 는 음수를 항상 ()로 감쌈, '0'은 숫자 왼쪽에 지정된 너비내에서 0으로 채움 
 * @author	mskim
 * @since	2013. 1. 6. 오후 1:25:54
 * @version	1.0.0
 */

public class FormattingEX {
	public static void main(String[] args) {
		System.out.printf("%,d%n", 1000000);
		System.out.format("%,d%n", 1000000);
		String str = String.format("%,d%n",1000000);
		System.out.println(str);
		
		NumberFormat nf = NumberFormat.getNumberInstance();
		String num1= nf.format(1000000);
		System.out.println(num1);
		
		DecimalFormat df = new DecimalFormat("###,###.###");
		String num2 = df.format(1000000);
		System.out.println(num2);
	}//end of main
}
