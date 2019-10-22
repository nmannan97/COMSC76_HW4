
/**
 * Write a description of class permutations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class permutations
{
    // instance variables - replace the example below with your own
    private static int fact = 1;
    private static int count = 0;
    private static int count2 = 0;
    /**
     * Constructor for objects of class permutations
     */
    public permutations(){}
    public static void factorial(int a)
    {
        if(count != a)
        {
            count = count+1;
            fact = fact*count;
            factorial(a);
        }
        else{count = 0;}
    }
    public static void displayPermutation(String s)
    {
         factorial(s.length());
         char A = s.charAt(count2%s.length());
        
         if(count2 != fact)
         {
             System.out.print(A);
             for(int j = 0;j<s.length();j++)
             {
                 if(j!=fact%s.length())
                     System.out.print(s.charAt(j));
             }
             System.out.println("");
             count2 = count2 + 1;
             fact = 1;
             displayPermutation(s);
         }
         else 
            count2 = 0;
    }
    public static void main(String args[])
    {
        permutations perm = new permutations();
        perm.displayPermutation("ABC");
    }
}
