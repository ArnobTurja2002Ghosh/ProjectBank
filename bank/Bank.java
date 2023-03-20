import java.util.*;
/**
 * Write a description of class Bank here.
 *
 * @author Arnob
 * @version (a version number or a date)
 */
public class Bank
{
    // instance variables - replace the example below with your own
    private int x;
    private String bankName;
    private List<Account> account;
    private String name;
    /**
     * Constructor for objects of class Bank
     */
    public Bank()
    {
        // initialise instance variables
        x = 0;
        account = new ArrayList<>();
    }
    
    public Bank(String name)
    {
        // initialise instance variables
        x = 0;
        this.name = name;
        account = new ArrayList<>();
    }
    void add(Account a){
        account.add(a);
    }
    void display(){
        System.out.println("\n\n");
        System.out.println(this.name);
        for(Account animal : account) 
            {
                animal.display();
                if(animal instanceof Cheque){
                        System.out.println("type of account: Cheque");
                    }
                    else if(animal instanceof Saving){
                        System.out.println("type of account: Saving");    
                }
                System.out.println();
            }
    }
    void display(String user){
        System.out.println(this.name);
        for(Account animal : account) 
            {
                if(animal.user.equals(user)){ 
                    animal.display();
                    if(animal instanceof Cheque){
                        System.out.println("type of account: Cheque");
                    }
                    else if(animal instanceof Saving){
                        System.out.println("type of account: Saving");
                    }
                }
            }
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */

}
