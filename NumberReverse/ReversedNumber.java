import java.util.Scanner;

class ReversedNumber{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = input.nextInt();	
		int revNum = 0;

		//reversing the input number 
		while(num!=0){
			revNum = revNum * 10;
			revNum = revNum + num%10;
			num = num/10;			
		}

		System.out.print("Reversed number : "+revNum);
	}
}