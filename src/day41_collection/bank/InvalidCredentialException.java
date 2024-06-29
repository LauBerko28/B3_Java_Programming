package day41_collection.bank;
//Any class that is a child class of exception is checked/compile Exception [except RunTimeException]
//Any class that is a child class of RunTimeException is unchecked/run time Exception
public class InvalidCredentialException extends  Exception{
    // how can i make my own exception method?
    // 1. extend it to the type of exception i want --> if compile then make it Exception
    public InvalidCredentialException (String message){
        super(message);
    }


}
