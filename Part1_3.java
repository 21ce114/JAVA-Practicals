/*ID: 21CE114
Name: Harsh Rana
Git Repository Link: https://github.com/21ce114/JAVA-Practicals.git
AIM : Given two non-negative int values, return true if they have 
the same last digit, such as with 27 and 57. 
Note that the % "mod" operator computes remainders, so 17 % 10 is 7.*/
import java.util.*;

public class Part1_3 {
	
	public static boolean lastDigit (int x,int y) {
		//% with 10 will give us the last digit and comparing it with the other last digit number.
		if((x % 10) == (y % 10)) {
			return true;
		}
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Taking input for both the numbers from the user.
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println(lastDigit(a,b));
	}

}
