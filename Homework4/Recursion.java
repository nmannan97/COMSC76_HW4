
/**
 * Write a description of class Recursion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Recursion
{
    // instance variables - replace the example below with your own
    private int x;
    private static int value = 0;
    private String input = " ";
    private static int count = 0;
    /**
     * Constructor for objects of class Recursion
     */
    public Recursion()
    {

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void reverseDisplay(String value)
    {
        int Value = value.length();
        String output;
        if(count != Value)
        {
            System.out.print(value.charAt(Value - 1 - count));
            count = count + 1;
            reverseDisplay(value); 
        }
        else {count = 0;System.out.println("");}
    }
    public static void main(String args[])
    {
        Recursion rec = new Recursion();
        rec.reverseDisplay("Bitch");
    }
}
