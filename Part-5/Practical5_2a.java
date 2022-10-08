/*ID: 21CE114
Name: Harsh Rana
Git Repository Link: https://github.com/21ce114/JAVA-Practicals.git
AIM : When to use Character Stream over Byte Stream? When to use 
Byte Stream over Character Stream? Give example..*/

import java.io.*;   
public class Practical5_2a
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;
  
        try 
        {
            sourceStream = new FileInputStream("C:\\Users\\HARSH\\OneDrive\\Desktop\\JAVA\\Part-5\\source.txt");
            targetStream = new FileOutputStream ("C:\\Users\\HARSH\\OneDrive\\Desktop\\JAVA\\Part-5\\destination.txt");
  
            // Reading source file using read method 
            // and write to file byte by byte using write method
            int temp;
            while ((temp = sourceStream.read()) != -1)
                targetStream.write((byte)temp);            
        }
        finally 
        {
            if (sourceStream != null){
                sourceStream.close();   
            }
            if (targetStream != null){           
                targetStream.close(); 
            }
        }
    }
}