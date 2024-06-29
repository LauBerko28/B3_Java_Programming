package day33_b_encapsulation.bank_account;

public class UseBankAccount {
    public static void main(String[] args) {

        BankAccount obj = new BankAccount();

        // now i can reach them because they are on the same package
        /*
        System.out.println(obj.accountNumber); // direct access - not available once i swicth the instanc var to private
        System.out.println(obj.routingNumber); // direct access
         */

        System.out.println(obj.getAccountNumber());

        obj.setAccountNumber("123456789");
        System.out.println(obj.getAccountNumber());

        obj.setAccountNumber("1234");
        System.out.println(obj.getAccountNumber());

        //obj.accountNumber = "123456789";
    }
}
