/*ID: 21CE114
Name: Harsh Rana
Git Repository Link: 
https://github.com/21ce114/JAVA-Practicals.git
AIM :Write a program to create thread which display “Hello World” message.
A. by extending Thread class
B. by using Runnable interface.
*/

public class Practical6_1a extends Thread {

    public void run() {

        System.out.println("Hello World");
    }

    public static void main(String[] args) {

        Practical6_1a tl = new Practical6_1a();

        tl.start();

    }
}