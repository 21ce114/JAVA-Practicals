/*ID: 21CE114
Name: Harsh Rana
Git Repository Link: 
https://github.com/21ce114/JAVA-Practicals.git
AIM :Generate 15 random numbers from 1 to 100 and store it in an 
int array. Write a program to display the numbers stored at odd 
indexes by thread1 and display numbers stored at even indexes 
by thread2.
*/

import java.util.*;
//here we Create A class Odd who extends by thread class
class Odd extends Thread{
    int arr[] = new int[30];
    //Here we create A Constructor with Argument of array for Storing elments from Random Class
    Odd(int []arr)
    {
        for(int i=0;i<30;i++)
        {
            this.arr[i] = arr[i];
        }
    }
//here we mustly use run method
    @Override
    public void run()
    {
        for(int i=0;i<30;i++)
        {
            //Here we applied the logic of finding the odd number.
            if(arr[i]%2 != 0)
            {
                System.out.println("Odd number is:-  "+arr[i]);
            }
        }
    }
}
//here we Create A class Even who extends by thread class
class Even extends Thread
{
    int arr[] = new int[30];
    //Here we create A Constructor with Argument of array for Storing elments from Random Class
    Even(int [] arr)
    {
        for(int i=0;i<30;i++)
        {
            this.arr[i] = arr[i];
        }
    }

    @Override
    public void run()
    {
        for(int i=0;i<30;i++)
        {
            //Here we applied the logic of finding the even number.
            if(arr[i]%2 == 0)
            {
                System.out.println("Even number is:-  "+arr[i]);
            }
        }
        
    }
}
public class Practical6_2 {
    public static void main(String[] args) {
        int arr[] = new int[30];
        //here we use Random Class take A Random Number Between 0 to 100
        Random r = new Random();
        for(int i=0;i<30;i++)
        {
            arr[i] = r.nextInt(100);
        }
        Odd o = new Odd(arr);
        Even e = new Even(arr);

        o.start();
        e.start();
    }
}