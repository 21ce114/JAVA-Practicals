/*ID: 21CE114
Name: Harsh Rana
Git Repository Link: https://github.com/21ce114/JAVA-Practicals.git
AIM : The problem is to write a program that will grade multiple-choice tests. 
Assume there are eight students and ten questions, and the answers are stored 
in a two-dimensional array. Each row records a student’s answers to the 
questions, as shown in the following array.*/
public class Part1_8 {

	public static void main(String[] args) {
		//Inputing the marks of different students in 2-D character Array.
        char[][] marks = {
		             {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E' ,'A', 'D'},
		             {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E' ,'A' ,'D'},
		             {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E' ,'A' ,'D'},
		             {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E' ,'A', 'D'},
		             {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E' ,'A' ,'D'},
		             {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E' ,'A', 'D'},
		             {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E' ,'A', 'D'},
		             {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E' ,'A', 'D'},
                 };
       
        char [] ans = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E' ,'A' ,'D'};
        
        int count = 0;
        /*The first loop is to access student{row} and the second is for comparing 
          marks{column} with the answer key*/
        for(int i = 0 ; i<8; i++)
        {
            for(int j = 0; j<10; j++)
            {
              if(marks[i][j] == ans[j])
              {
                count++;
              }
            }//Printing the count for each student.
            System.out.println("Marks of Student "+(i)+" : "+count);
            count = 0;
        }
    }

}


