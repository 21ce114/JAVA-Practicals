/*ID: 21CE114
Name: Harsh Rana
Git Repository Link: 
https://github.com/21ce114/JAVA-Practicals.git
AIM :Write a program that demonstrates use of 
     packages & import statements. */

//Importing Package method:

// FIRST IMPORTING METHOD.
public class Practical3_6 {
	public static void main(String[] args) {
		// FIRST IMPORTING METHOD.
		//USING FULLY QUALIFIED NAME.
		part_3.Practical3_5_Package_file obj = new part_3.Practical3_5_Package_file();
		obj.print();
		
		part_3.PackageFileForPractical3_6 obj1 = new part_3.PackageFileForPractical3_6();
		obj1.add(5,2);
		
	}
}
/*-----------------------------------------------------*/
// Second IMPORTING METHOD.
// Using packagename.classname
/*import part_3.PackageFileForPractical3_6;
import part_3.Practical3_5_Package_file;
public class Practical3_6 {
	public static void main(String[] args) {
		
		Practical3_5_Package_file obj = new Practical3_5_Package_file();
		obj.print();
		
		PackageFileForPractical3_6 obj1 = new PackageFileForPractical3_6();
		obj1.add(5,2);
		
	}
}
/*-----------------------------------------------------*/

// Third IMPORTING METHOD.
// Using Using packagename.*  To access all the classes.

/*import part_3.*;

public class Practical3_6 {
	public static void main(String[] args) {
		
		Practical3_5_Package_file obj = new Practical3_5_Package_file();
		obj.print();
		
		PackageFileForPractical3_6 obj1 = new PackageFileForPractical3_6();
		obj1.add(5,2);
		
	}
}*/
