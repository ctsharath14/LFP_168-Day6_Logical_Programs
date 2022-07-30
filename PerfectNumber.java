import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any integer number:");
		num = sc.nextInt();
		for(int i = 1; i < num; i++) {
			if(num % i == 0)
			{
				sum = sum + i;
			}
		}
		
		if(sum == num)
			System.out.println(num + " is a Perfect Number");
		else
			System.out.println(num + " is Not Perfect Number");	
	}
}
