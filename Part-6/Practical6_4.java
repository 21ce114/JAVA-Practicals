/*ID: 21CE114
Name: Harsh Rana
Git Repository Link: 
https://github.com/21ce114/JAVA-Practicals.git
AIM : Write a program to create three threads ‘FIRST’, ‘SECOND’, 
‘THIRD’. Set the priority of the ‘FIRST’ thread to 3, the ‘SECOND’
thread to 5(default) and the ‘THIRD’ thread to 7.
*/

public class Practical6_4 extends Thread {

    public void run() {

        System.out.println("running...");
    }

    public static void main(String args[]) {

        // creating one thread

        Practical6_4 tl = new Practical6_4();
        Practical6_4 t2 = new Practical6_4();
        Practical6_4 t3 = new Practical6_4();

        // set the priority

        tl.setPriority(3);

        t2.setPriority(5);

        t3.setPriority(7);

        // print the user defined priority
        System.out.println("Priority of thread tl is: " + tl.getPriority());

        System.out.println("Priority of thread t2 is: " + t2.getPriority() + "(default)");

        System.out.println("Priority of thread t3 is: " + t3.getPriority());

        tl.start();
    }

}