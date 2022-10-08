/*ID: 21CE114
Name: Harsh Rana
Git Repository Link: https://github.com/21ce114/JAVA-Practicals.git
AIM : WAP to show use of character and byte stream.*/
 

import java.io.*;

public class Practical5_4 {
    public static void main(String[] args) throws IOException {
        FileReader sourceStream = null;
        try {
            sourceStream = new FileReader("C:\\Users\\HARSH\\OneDrive\\Desktop\\JAVA\\Part-5\\input.txt");
            int temp;
            while ((temp = sourceStream.read()) != -1)
                System.out.println((char) temp);
        } finally {
            if (sourceStream != null)
                sourceStream.close();
        }
        
    }
}
