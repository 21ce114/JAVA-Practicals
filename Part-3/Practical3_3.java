/*ID: 21CE114
Name: Harsh Rana
Git Repository Link: https://github.com/21ce114/JAVA-Practicals.git
AIM : WAP that illustrate the interface inheritance. Interface P is 
extended by P1 and P2 interfaces.1, 2 Interface P12 
extends both P1 and P2. Each interface declares one 
method and one constant. Create one class that 
implements P12. By using the object of the class 
invokes each of its method and displays constant.*/

interface P
{
    int a=1;
    void displayP();
}
interface P1 extends P
{
    int b=2;
    void displayP1();
}
interface P2 extends P
{
    int c=3;
    void displayP2();
   
}
interface P12 extends P1,P2
{
	int d=4;
	void displayP12();
}
class imp implements P12
{
    public void displayP()
    {
    	System.out.println("P called and constant:"+a);
        
    }
    public void displayP1()
    {
        System.out.println("P1 called and constant:"+b);
    }
    public void displayP2()
    {
        System.out.println("P2 called and constant:"+c);
    }
    public void displayP12()
    {
        System.out.println("P12 called and constant:"+d);
    }
}
class Practical3_3 extends imp
{
    public static void main(String[]args)
    {
        imp n=new imp();
        n.displayP();
        n.displayP1();
        n.displayP2();
        n.displayP12();
    }
}


