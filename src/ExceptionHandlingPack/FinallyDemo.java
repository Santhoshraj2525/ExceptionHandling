package ExceptionHandlingPack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyDemo {

	public static void main(String[] args) throws Exception {
		int i=9;
		int k=0;
		
		System.out.println("Please enter the number : ");
		
		try(BufferedReader BR = new BufferedReader(new InputStreamReader(System.in))) {
			int j=Integer.parseInt(BR.readLine());
			k=i+j;
			System.out.println("Output : " +k);
			if(k>10) {
				throw new MyException("Erroroorr");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		/*finally { //finally block is used to close the resources and it will the execute eventhough if there is any exception present or not
			BR.close();
			System.out.println("Good Bye");
		}*/
	}

}
class MyException extends Exception{
	public MyException(String msg) {
		super(msg);
	}
}
