import java.util.Scanner;

public class ReverseNo{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Number :- ");
		int num = sc.nextInt();
		int reverse = 0;

		while(num != 0){
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num /= 10;
			
	}
		System.out.println("Reverse Number :" + reverse);
}
}