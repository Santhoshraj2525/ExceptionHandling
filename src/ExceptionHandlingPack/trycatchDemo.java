package ExceptionHandlingPack;

public class trycatchDemo {

	public static void main(String[] args) {
		int i=8,j=2,k=0;
		int arr[]=new int[3];
		try {
		k=i/j;
		for(int P=0;P<=3;P++) {
			arr[P]=P+1;
		}
		for(int O :arr) {
			System.out.print(O+ " ");
		}
		}
		catch(ArithmeticException e) {
			//System.out.println(e);
			System.out.println("Sorry we cannot divide a number by zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Total Elements should be 3 " +e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(k);
	}

}
