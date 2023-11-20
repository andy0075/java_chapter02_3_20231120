package typeTest01;

import java.io.IOException;

public class input_Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int keycode = System.in.read();
			System.out.println(keycode);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
