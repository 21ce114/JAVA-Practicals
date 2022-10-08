/*ID: 21CE114
Name: Harsh Rana
Git Repository Link: https://github.com/21ce114/JAVA-Practicals.git
AIM : Write a program to transfer data from one file to another 
file so that if the destination file does not exist, it is created.*/

import java.io.*;
public class Practical5_3 {

   public static void main(String args[]) throws IOException {
      FileReader in = null;
      FileWriter out = null;

       // Reading source file using read method 
        // and write to file using write method
      try {
         in = new FileReader("source.txt");
         out = new FileWriter("destination.txt");
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }
       finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}