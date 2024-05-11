package day24_methods;


public class Email {
    public static void main(String[] args) {
        buildEmail("Mickey Mouse","gmail.com"); // here im calling a method that matched the number and the same dataType
                                    // If I were to print as is nothing will be reflected on the consol as i am only calling the method here

        buildEmail("TOM JERRY", "yahoo.com");  // this part is only calling the method and i can just update the values as many times as needed

    }
        // Create a method called buildEmail and that accepts two string parameters
        // Take the full name and then take the first character of first name and full last name and concatenate with the domain
        // "Mickey Mouse" , "gmail" ---> mmouse@gmail.com
        public static void buildEmail(String fullName, String domain){ //Non-parameterized  parameters ()
                                    //

            String email = fullName.toLowerCase().toString().charAt(0)+""                               // m
                    +         fullName.toLowerCase().substring(fullName.indexOf(" ")+1)      // mouse
                    +  "@"                                                                              // @
                    + domain.toLowerCase();                                                             // gmail.com
            // here im heting the first character of the name, i need to concatenate it
            // +       here im getting the second word and converting it to lower case

            System.out.println(email);
        }


}
