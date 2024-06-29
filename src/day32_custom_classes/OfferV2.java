package day32_custom_classes;

public class OfferV2 {

    // create instance variables
    String location;
    String company;
    double salary;
    boolean isFullTime;
    int numOfPTO;


    // creating a constructor
    public OfferV2(String company, String location){
        this.company = company;
        this.location = location;

    }

    public OfferV2(String company, String location, double salary){
//        this.company = company;
//        this.location = location;
        this(company,location);
        this.salary = salary;

    }

    public OfferV2(String company, String location, double salary, boolean isFullTime, int numOfPTO){


//        this.company = company;
//        this.location = location;
//        this.salary = salary;
        this(company,location,salary); // instead of using the above 3 lines i can just call my constructor that already includes all 3 of them
        this.isFullTime = isFullTime;
        this.numOfPTO = numOfPTO;

    }

    // BAD CONSTRUCTOR CHAINING EXAMPLE
    // ASSIGNING WRONG VALUES TO WRONG INSTANCE VARIABLES
    public OfferV2(String location, String company, double salary, boolean isFullTime, int numberOfPTO, String name, String lastName) {
        this(name, lastName); // NOT GOOD PRACTICE. WRONG ASSIGNING
        this.isFullTime = isFullTime;
        this.numOfPTO = numberOfPTO;
    }

    @Override
    public String toString() {
        String info = company + " is located in " + location;
        info += "\n" + (((salary>0)) ? salary : "");
        // info += "\n" + (isFullTime ? "Full Time" : "Contract");
        info += "\n" + (numOfPTO > 0 ? numOfPTO : "");


//        return "Offer: " +
//                "\n\tLocation: " + location +
//                "\n\tCompany: '" + company +
//                "\n\tSalary: " + salary +
//                "\n\tIs Full Time: " + isFullTime +
//                "\n\tNumber Of PTO: " + numOfPTO;
        return info;
    }
}
