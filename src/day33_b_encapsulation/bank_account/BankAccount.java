package day33_b_encapsulation.bank_account;

public class BankAccount {
    // by making these private, I am restricting DIRECT access to them.
    // Or, I hide them from direct access
    private String accountNumber;
    private String routingNumber;

    // for SETTERS return type is void
    // for the GETTERS the return type is the dataType of what im trying to get


    // PUBLIC METHODS --> will give indirect access with the help of getters and setters


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber.length() >= 12 && accountNumber.length() <= 17){
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Not correct digits count");
        }
    }
}
