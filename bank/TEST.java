
/**
 * Write a description of class CIBC here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TEST
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class CIBC
     */
    
    static void main(){
        System.out.println("\n\n\n\n");
        Bank b = new Bank("CIBC");
        Saving a = new Saving("John");
        Cheque c = new Cheque("Ontu");
        Cheque u = new Cheque();
        c.deposit(1895644);
        b.add(a);
        b.add(c);
        b.add(u);
        b.display();
        
        Bank ERB = new Bank("East River Bank");
        Cheque jdc = new Cheque("John Doe");
        Saving jds = new Saving("John Doe");
        jdc.deposit(5000); jdc.withdraw(2500);
        jds.deposit(10000); jds.withdraw(500);
        Cheque ssc = new Cheque("Sarah Smith");
        Saving sss = new Saving("Sarah Smith");
        ssc.deposit(7500); ssc.withdraw(1000);
        sss.deposit(15000); ssc.withdraw(2000);
        ERB.add(jdc); ERB.add(jds); ERB.add(ssc); ERB.add(sss);
        ERB.display();
        
        Bank WEB = new Bank("West End Bank");
        Cheque jjc = new Cheque("Jake Jones");
        Saving jjs = new Saving("Jake Jones");
        jjc.deposit(3000); jjc.withdraw(1500); jjc.withdraw(1500); jjc.withdraw(1500);
        jjs.deposit(8000); jjs.withdraw(750);
        Cheque ewc = new Cheque("Emily Wong");
        Saving ews = new Saving("Emily Wong");
        ewc.deposit(2500); ewc.withdraw(1000); ewc.withdraw(1000);  ewc.withdraw(1000);
        ews.deposit(12000); ews.withdraw(1500);
        WEB.add(jjc); WEB.add(jjs); WEB.add(ewc); WEB.add(ews);
        WEB.display();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */

}
