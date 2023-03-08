
/**
 * Write a description of class Cheque here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cheque extends Account
{
    // instance variables - replace the example below with your own
    private int x;
    //minimBalance and overLimitCharge (set to 1000 and 5, respectively)
    private static final int minimBalance = 1000;
    private static final int overLimitCharge = 5;
    private double overLimitFee = 0;
    /**
     * Constructor for objects of class Cheque
     */
    private Cheque()
    {
        super();
        // initialise instance variables
        x = 0;
    }
    private Cheque(String user)
    {
        super(user);
    }
    private void withdraw(float m)
    {
        balance -= m;
        if((balance - m) < minimBalance){
        overLimitFee += overLimitCharge;
        }
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
