package typeTest01;

import java.util.Scanner;

public class input_Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in); // 파이선 클래스 선언 객체이름 scan = Scan = Scanner();
		
//		int keyCode1 = scanner.nextInt();//키보드로부터 정수 받아오기
//		double keyCode2 = scanner.nextDouble(); // 키보드로부터 실수 받아오기
//		String keyCode3 = Scanner.nextLine(); // 키보드로부터 문자열 받아오기
//		String kryCode4 = Scanner.next(); //키보드로부터 문자열 받아오기(공백을 만나면 공백전까지 입력된 문자영ㄹ 받음
		char keyCode5 = Scanner.next().charAt(5);//문자열을 입력받아서 원하는 인텍스의 
		
		
//		System.out.println(keyCode1);
//		System.out.println(keyCode2);
//		System.out.println(keyCode3);
//		System.out.println(keyCode4);
		System.out.println(keyCode5);
		
	
	}

}
