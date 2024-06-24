package day41_collection.bank;
//Any class that is a child class of exception is checked/compile Exception [except RunTimeException]
//Any class that is a child class of RunTimeException is unchecked/run time Exception

// im making notEnoughBalance a child of Runtime which means is an unchecked exception
public class NotEnoughBalanceException extends RuntimeException{

    //Here i generated a constructor overloading that overloads from its parent class RunTimeException
    public NotEnoughBalanceException(String message) {
        super(message); // this message is whatever i passed on my parent class under withdraw
    }
}
