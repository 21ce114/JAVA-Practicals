/*ID: 21CE114
Name: Harsh Rana
Git Repository Link: https://github.com/21ce114/JAVA-Practicals.git
AIM : Create an abstract class GeometricObject as the superclass for Circle and
Rectangle. GeometricObject models common features of geometric objects. Both
Circle and Rectangle contain the getArea() and getPerimeter() methods for
computing the area and perimeter of a circle and a rectangle. Since you can
compute areas and perimeters for all geometric objects, so define the getArea() and
getPerimeter() methods in the GeometricObject class. Give implementation in the
specific type of geometric object. Create TestGeometricObject class to display area
and perimeter of Rectangle and Triangle, compare area of both and display results.
Design of all classes are given in the following UML diagram.
*/

import java.util.*;

abstract class GeometricObject{
	public abstract void getArea();
	public abstract void getPerimeter();
	
}

class Circle extends GeometricObject{
	int r=0;
	Circle(int r){
		this.r=r;
	}
	public void getArea() {
		System.out.println("The area of the circle is:"+3.14*r*r);
	}
	public void getPerimeter() {
		System.out.println("The Perimeter of the circle is:"+ 2*3.14*r);
	}
}
class Rectangle extends GeometricObject{
	int l,b;
	Rectangle(int l,int b){
		this.l=l;
		this.b=b;
	}
	public void getPerimeter() {
		System.out.println("The Perimeter of the Rectangle is:"+2*(l+b));
	}
	public void getArea() {
		System.out.println("The area of the Rectangle is:"+ l*b);
	}
}
public class TestGeometricObject{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Radius of Circle:");
		int r=sc.nextInt();
		System.out.println("Enter the Length of Rectangle:");
		int l=sc.nextInt();
		System.out.println("Enter the breadth of Rectangle:");
		int b=sc.nextInt();
		
		Circle cir=new Circle(r);
		Rectangle rec=new Rectangle(l,b);
		
		cir.getArea();
		cir.getPerimeter();
		rec.getArea();
		rec.getPerimeter();
	}

}
