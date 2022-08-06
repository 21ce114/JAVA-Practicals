/*ID: 21CE114
Name: Harsh Rana
Git Repository Link: https://github.com/21ce114/JAVA-Practicals.git
AIM : Design a class named Circle containing following attributes and behavior.
     •Onedouble data field named radius. The default valueis1.
     •A no-argumentconstructor that creates a default circle.
     •A Single argument constructor that creates a Circle with the specified radius.
     •A method named getArea() that returns area of the Circle.
     •A method named getPerimeter() that returns perimeterof it.*/

class Cylinder{
	double radius;
	double height;
	
	Cylinder(){
		 radius = 1;
		 height = 1;
	}
	Cylinder(double x){
		radius = x;
	}
	Cylinder(double x,double y){
		radius = x;
		height = y;
	}
	double getArea() {
		return 2*radius*Math.PI*(radius+height);
	}
}

public class Part2_1 {

	public static void main(String[] args) {

		Cylinder c = new Cylinder(6.5,8.4);
		System.out.println("Area = "+c.getArea());
	}

}