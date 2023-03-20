# JavaProjectsForChildren
Assume that a bank maintains three types of accounts for each customer: credit, savings, and checking. The credit card account offers users the convenience of making purchases without having to carry cash and allows them to pay the balance within a specified duration without incurring a fine. The savings account provides compound interest and withdrawal facility, while the checking account offers a cheque book facility but no interest.

The Account class should have the following member functions:

• Account(): the default constructor that generates an account number using a random integer and initializes other member variables.

• Account(String user): the overloaded constructor that takes the argument for the account name and initializes other member variables.

• void display(): displays (prints) the account information, including the user name, account number, and the balance.

• void deposit(float m): accepts a deposit from a customer and updates the balance.

• void withdraw(float m): defines an abstract method that can be overridden by the derived class and enables late dynamic calling of corresponding member functions in the derived classes.

• float getBalance(): returns the balance.

• String getUserName(): returns the user name.

The Cheque class should have the following member functions:

• Two constructors similar to those of the parent class Account.

• A withdraw function that withdraws money according to the user's request. In this function, check if this withdrawal is allowed according to the available balance and withdraw limit for each time. Calculate the over-limit service fee if the balance is lower than a limit when applying a withdrawal. Update the balance.

The Saving class should have the following member functions:

• Two constructors similar to those of the parent class Account.

• A withdraw function that withdraws money according to the user's request.
 
 The Bank class should have the following member functions:

• Bank(): the default constructor that creates a new empty account list (using ArrayList).

• Bank(String name): a constructor with a string argument for the bank name.

• void add(Account a): adds the account (either Saving or Cheque objects).

• void display(): displays the bank name and the full list of accounts (including the user’s name, balance, and the type of account (whether it is Saving or not)).

• void display(String user): displays the bank name and the list of accounts of a specific user name (including the user’s name, balance, and the type of account (whether it is Saving or not)).
