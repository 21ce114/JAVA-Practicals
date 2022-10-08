/*ID: 21CE114
Name: Harsh Rana
Git Repository Link: https://github.com/21ce114/JAVA-Practicals.git
AIM : WAP to demonstrate methods of wrapper class.
*/

class Practical5_6 { 
    public static void main(String[] args) 
    { 
        //Wrapper Class methods.

        Integer I = Integer.valueOf("10"); 
        System.out.println(I); 
        
        Double D = Double.valueOf("10.0"); 
        System.out.println(D); 
        
        Boolean B = Boolean.valueOf("true"); 
        System.out.println(B); 

        Integer E = Integer.valueOf("1111", 2); 
        System.out.println(E); 

        Integer F = Integer.valueOf(10);
        System.out.println(F);

        int i = Integer.parseInt("10"); 
        System.out.println(i);

        double d = Double.parseDouble("10.5"); 
        System.out.println(d); 

        boolean b = Boolean.parseBoolean("true"); 
        System.out.println(b); 
         
        int e = Integer.parseInt("1000", 2);
        System.out.println(e);

        String s = Integer.toString(10); 
        System.out.println(s); 
    }
}