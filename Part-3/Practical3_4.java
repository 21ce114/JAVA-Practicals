/*ID: 21CE114
Name: Harsh Rana
Git Repository Link: https://github.com/21ce114/JAVA-Practicals.git
AIM : Develop a Program that illustrate method overriding concept.*/

class parent{
    void show(){}
}
class child1 extends parent{
    //method overriding.
    void show(){
        System.out.println("This is child'1 class method.");
    }
}

class child2 extends parent{
    //method overriding.
    void show(){
        System.out.println("This is child'2 class method.");
    }
}
public class Practical3_4{

 public static void main(String[] args) {
    child1 obj1 = new child1();
    obj1.show();
    child2 obj2 = new child2();
    obj2.show();
 }
}
