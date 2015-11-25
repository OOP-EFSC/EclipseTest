import java.util.Scanner;
public class EvenorOdd {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		while (1 != 0){
			System.out.print( "Enter an interger: " );
		
			int numtocheck = input.nextInt();
			if (isEven(numtocheck) == true){
				System.out.printf( "%d is Even%n", numtocheck );
			}
			else if (isEven(numtocheck) == false){
				System.out.printf( "%d is Odd%n", numtocheck );
			} 
		}
	}
	public static boolean isEven(int x){
		int y = x%2;
		if (y == 1){
			return false;
		}
		else {
			return true;
		}
	}

}
