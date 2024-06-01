package day32_custom_classes;
/*
- data/create instance variables:
    			location, company, salary, is full time, number of PTO

		- constructor

			- create a constructor that creates an Offer object with the company and location
			- create a constructor that creates an Offer object with the company, location, and salary
			- create a constructor that creates an Offer object with the company, location, salary, isfull time, and number of PTO


		- method/create instance methods:

			toString()
				print all the employees information

 */
public class Offer {

    // create instance variables
    String location;
    String company;
   public double salary;
   public boolean isFullTime;
    int numOfPTO;


    // creating a constructor
    public Offer(String company, String location){
        this.company = company;
        this.location = location;

    }

    public Offer(String company, String location, double salary){
        this.company = company;
        this.location = location;
        this.salary = salary;

    }

    public Offer(String company, String location, double salary, boolean isFullTime, int numOfPTO){
        this.company = company;
        this.location = location;
        this.salary = salary;

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
