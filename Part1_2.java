/*ID: 21CE114
Name: Harsh Rana
Git Repository Link: https://github.com/21ce114/JAVA-Practicals.git
AIM : Given a string, return a string made of the first 2 chars (if present),
 however include first  char  only  if  it  is  'o' and  include  the  second 
 only  if  it  is  'z',  so  "ozymandias" yields "oz".*/

import java.util.*;

public class Part1_2 {
	// Method to check the first letters of the string.
	public static String checka (String x) {
		if(x.startsWith("oz")) {
			return "oz";
		}
		else if(x.startsWith("OZ")) {
			return "OZ";
		}
		else if(x.startsWith("o")) {
			return "o";
		}
		else if(x.startsWith("O")) {
			return "O";
		}
		else if(x.startsWith("z",1)) {
			return "z";
		}
		else if(x.startsWith("Z",1)) {
			return "Z";
		}
		else 
			return "";
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//TO take the string from the user.
		String a = sc.nextLine();
		
		String b = checka(a);
		
		System.out.println(b);
	}

}
