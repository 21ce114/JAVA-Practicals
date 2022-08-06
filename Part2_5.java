/*ID: 21CE114
Name: Harsh Rana
Git Repository Link: https://github.com/21ce114/JAVA-Practicals.git
AIM : Develop a Program that illustrate method overloading concept. */

class Adder{
	
static int add(int a,int b){
	return a+b;
	}  
static int add(int a,int b,int c){
	return a+b+c;
	}  
}  
class Part2_5{  
public static void main(String[] args){  
	System.out.println(Adder.add(114,115));  
	System.out.println(Adder.add(114,115,116));  
	}
}
