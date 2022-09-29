/*ID: 21CE114
Name: Harsh Rana
Git Repository Link: 
https://github.com/21ce114/JAVA-Practicals.git
AIM : Write a program to increment the value of one variable 
by one and display it after one second using thread using 
sleep() method.
*/

import java.util.Scanner;

class Incre extends Thread {

    int n;

    Incre(int n) {

        this.n = n;
    }

    public void run() {

        n += 1;

        try {

            sleep(1000);

        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Incremented number: " + n);
    }
}

public class Practical6_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Integer: ");
        int n = sc.nextInt();
        Thread tl = new Incre(n);
        tl.start();
    }
}