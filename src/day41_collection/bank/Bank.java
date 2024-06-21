package day41_collection.bank;

public class Bank {
    // creating instance variables
    double balance;

    // withdraw method
    public void withdraw(double amountToTakeOut){
        if (amountToTakeOut > balance){
            // I created my own exception
            throw new NotEnoughBalanceException("Balance only has: " + balance);
        }
        balance -= amountToTakeOut;
    }

    // login method
    public void login(String username, String password)throws InvalidCredentialException{

        //creating my own login Exception
        // i do 2 diferent if statements because im taking care of 2 different things
        if (!username.equals("loopcamp")){
           // System.out.println("Not valid username");
            throw new InvalidCredentialException("Invalid username");
        }

        if (!password.equals("Test123@")){
          //  System.out.println("Not valid password");
            throw new InvalidCredentialException("Invalid password");
        }
    }

}
