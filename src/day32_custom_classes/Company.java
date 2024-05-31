package day32_custom_classes;

public class Company {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Tom", "SDET");
        System.out.println(emp1); // Tom - SDET - 0 - $0.0

        Employee emp2 = new Employee("Mickey", "QA", 123, 120_000);
        System.out.println(emp2); // Mickey - QA - 123 - $120000.0

        emp1.goingToMeeting();
        emp2.goingToMeeting();


        // THIS PART WAS DONE WITH THE CLASS EmployeeV2
        EmployeeV2 ev1 = new EmployeeV2("Winnie", "QE");
        EmployeeV2 ev2 = new EmployeeV2("Winnie", "QE", 32, 200_000.00);
    }
}
