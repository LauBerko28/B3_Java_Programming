package day05_variables;

    public class EmployeeInfo {
        public static void main (String [] args) {

//        String firstName;
//        String lastname;
//        String companyName;
//        String jobTitle;

            // As long as the variable share the SAME data type, we can declare them like this as well.
            String firstName, lastName, companyName, jobTitle;
            int age, pto; // Paid Time Off - day for vacation
            double salary;
            boolean isFullTime, isMarried;
            char suite, gender;

            firstName = "Feyruz";
            lastName = "Shahmurad";
            companyName = "Loopcamp";
            jobTitle = "Teacher";
            age = 37;
            pto = 21;
            salary = 120_000.00; // 120,000.00 - instead of comma we can use underscore
            isFullTime = true;
            isMarried = false;
            suite = 'A';
            gender = 'M';

            String fullDetail = "Employment Information for: "+ firstName + " " + lastName + "\n\tGender: \t\t" + gender + "\n\tJob Title: \t\t" + jobTitle;
        }

    }



