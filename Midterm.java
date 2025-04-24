/*
 * 이 프로그램은 StringBuffer 클래스를 이용하여 사용자로부터 영문(스페이스 포함)을 입력받고,
 * 글자 하나만 랜덤하게 선택해서 다른 글자로 수정하는 프로그램입니다.
 * 프로그램은 무한 반복되다가 exit라는 문자열이 입력되면 종료 됩니다.
 */

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