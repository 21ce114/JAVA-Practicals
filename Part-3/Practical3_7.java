/*ID: 21CE114
Name: Harsh Rana
Git Repository Link: https://github.com/21ce114/JAVA-Practicals.git
AIM : Write a program that illustrates the significance of interface
 default method.*/

interface TestInterface
{
    // abstract method
    public void abtmethod();
  
    // default method
    default void show()
    {
      System.out.println("Here Default Method Executed from the interface.");
    }
}
  
class Practical3_7 implements TestInterface
{
    
    public void abtmethod()
    {
        System.out.println("This method's implimentation is in class.");
    }
  
    public static void main(String args[])
    {
        Practical3_7 p = new Practical3_7();
        p.abtmethod();

        // default method 
        p.show();
    }
}
