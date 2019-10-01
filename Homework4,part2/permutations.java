
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
    /**
     * Constructor for objects of class permutations
     */
    public permutations()
    {
        // initialise instance variables
    
    }
    public static void factorial(int a)
    {
        if(count != a)
        {
            count = count+1;
            fact = fact*count;
            factorial(a);
        }
        else{count = 0;System.out.println(fact);}
    }
    public static void displayPermutation(String s)
    {
         factorial(s.length());
         int length = fact;
         if(count != length)
         {
             
         }
         else count = 0;
    }
    public static void main(String args[])
    {
        permutations perm = new permutations();
        perm.factorial(5);
    }
}
