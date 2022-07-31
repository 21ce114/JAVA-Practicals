/*ID: 21CE114
Name: Harsh Rana
Git Repository Link: https://github.com/21ce114/JAVA-Practicals.git
AIM : Given 2 strings, a and b, return the number of the positions where they 
contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, 
since the "xx", "aa", and "az" substrings appear in the same place in both 
strings.*/

public class Part1_5 {
	
	public static int stringMatch(String x,String y) {
		int count=0;
		//getting the lenght of the smallest string for termination condition in loop.
		int length=Math.min(x.length(),y.length());
		for(int i=0; i<length-1 ;i++) {
			//storing two letters at the same position in both the string in another sub-strings. 
			String xsub=x.substring(i,i+2);
			String ysub=y.substring(i,i+2);
			//comparing the sub strings.
			if(xsub.equals(ysub)) {
				count++;
			}
			
		}
		return count;
	}

	public static void main(String[] args) {
		//test cases from the question.
		String a="xxcaazz";
		String b="xxbaaz";
		
		System.out.println(stringMatch(a,b));
		
		String a1="abc";
		String b1="abc";
		
		System.out.println(stringMatch(a1,b1));
		
		String a2="abc";
		String b2="axc";
		
		System.out.println(stringMatch(a2,b2));
	}
	
}
