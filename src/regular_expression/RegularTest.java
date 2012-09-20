package regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularTest {
	public static void main(String[] args) {
		/*
			[] -> 한 문자
			[abc]	-> a,b또는 c 한 문자 일치
			[^abc]	-> a, b 또는 c를 제외한 한 문자와 일치
			[a-z]	-> a에서 z 한 문자 일치
			[a-zA-Z]	-> a에서 z , A에서 Z까지 한 문자 일치
			
			[]=X라 두면
			X?	-> X가 있거나 없음
			X+	-> X가 반드시 한 개 이상
			X*	-> X가 0개 이상
			X{n}	-> X가 정확하게  n번 반복
			X{n, }	-> X가 최소한 n번 이상 반복
			X{n,m} 	-> X가 n번에서 최대 m번까지 반복
		*/ 
		//1
		Pattern pattern = Pattern.compile("[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)+");
		Matcher matcher = pattern.matcher("net94@nate.com");
		boolean match = matcher.matches();
		System.out.println(match);
		
		//2
		boolean result = Pattern.matches("[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)+", "net94@nate.com");
		System.out.println(result);
		
		//3
		String value = "net94@nate.com";
		boolean result1 = value.matches("[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)+");
		System.out.println(result1);
		
		String data = "2012년 9월 19일 세상은 0에서 1을 만들어 내었다.";
		String digitPatttern = "[0-9]+";
		Pattern dPattern = Pattern.compile(digitPatttern);
		Matcher dMatcher = dPattern.matcher(data);
		while(dMatcher.find()){
			int startIdx = dMatcher.start();
			int endIdx = dMatcher.end();
			System.out.println("startIdx = " + startIdx + "\tendIdx = " + endIdx + "\tdata = " + data.substring(startIdx, endIdx));
		}
	}
}
