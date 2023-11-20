package java_ch2_4;

public class equl_Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 100;
		int num2 = 100;
		
		
		// num1이 100과 같은지 if문으로 작성
		if(num1 == num2) {//if 조건: 들여쓰기
			System.out.println("num1은 100입니다!")
			System.out.println("num2은 100입니다!")
			
		}
		
		String str1 = "Korea";
		String str2 = new String("Korea");
		
		if(str1 == str2); {//equals 메서드는 문자열의ㅣ 내용만 비교
		//일반 변수는 == 로 같은지 비교하고, 문자열을 입교할때는 .equals()라는 메서드를 사용하라!
			System.out.println("str1은 Korea 입니다!");
		    System.out.println("str2은 Korea 입니다!");
		
		}

		if(num1 == num2) {//== 연산자는 주소를 비교
			System.out.printin("num1은 100입니다!")
	}

}
