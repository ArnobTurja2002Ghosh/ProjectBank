
/**
 * Write a description of class Saving here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Saving extends Account
{
    // instance variables - replace the example below with your own
    private int x;
    //eachTimeCharge (set to 3.9) 
    private double overLimitFee = 0;
    private static final double eachTimeCharge = 3.9;
    /**
     * Constructor for objects of class Saving
     */
    public Saving()
    {
        super();
        // initialise instance variables
        x = 0;
    }
    public Saving(String user)
    {
        super(user);
    }
    public void withdraw(float m)
    {
        if(balance-m >= 0){
        balance -= m;
        overLimitFee += eachTimeCharge;
        
        }
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */

}
