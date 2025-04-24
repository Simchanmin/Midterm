# 202230118 심찬민
- 정상동작
```java
import java.util.Scanner; // (문제1) Scanner class를 import

 public class Midterm {
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 while (true) { // (문제2) 무한루프를 실행할 수 있는 조건절
			 System.out.print(">>");			
			 String s = scanner.nextLine(); 
			 StringBuffer sb = new StringBuffer(s); // (문제3) StringBuffer 객체 sb 생성
			 if (sb.toString().equals("exit")) { // (문제4) exit가 입력되었는지 확인
				 System.out.println("프로그램을 종료합니다.");	
				 break;
			 }
			 int index = (int)(Math.random() * s.length());
			 while (true) {
				 int i = (int)(Math.random() * 26);
				 char c = (char)('a' + i); 
				 if (sb.charAt(index) != ' ') { // (문제5) 선택한 문자가 공백이 아닐 경우
					 sb.replace(index, index + 1, Character.toString(c)); 
					 break; 
				 }
			 }
			 System.out.println(sb);
		 }
		 scanner.close();
	 }
 }
```