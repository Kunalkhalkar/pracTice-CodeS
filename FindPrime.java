/*
check number is prime Or not
*/
import java.util.Scanner;
import java.util.*;

public class FindPrime{
	public static void main(String...x)
	{	
		System.out.println("Enter the number to check the prime");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(checkPrime(num));
	}
	
	public static boolean checkPrime(int num){
		if(num <1) return false;
		if(num >= 1 && num <= 3) return true;	
		
		for(int i =2; i < Math.sqrt(num); i++){
			if(num % i ==0) return false;
		}
		return true;
	}
}
