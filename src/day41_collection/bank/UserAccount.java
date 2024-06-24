package day41_collection.bank;

import javax.security.auth.login.AccountNotFoundException;

public class UserAccount {

    public static void main(String[] args) {

        Bank account1 = new Bank(); // i have access to 3 things 1 instance variables and 2 instace methods

        account1.balance = 1_000;

        try {
            account1.withdraw(600); // calls withdraw method and calculates 1000 - 6000 = 400
            System.out.println(account1.balance);

            account1.withdraw(500);
            System.out.println(account1.balance); // -100 --> the code will rutn it even though there are no funds. so to take care of that i add a condition on my withdrawal method

        } catch (NotEnoughBalanceException e){
            System.out.println(e.getMessage());

        }

        System.out.println("Continue.... ");

        try {
            account1.login("loopcamp", "check123@");
        } catch (InvalidCredentialException e){
            System.out.println(e.getMessage());
        }

    }

}
