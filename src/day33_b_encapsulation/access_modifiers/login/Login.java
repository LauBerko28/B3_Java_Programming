package day33_b_encapsulation.access_modifiers.login;

public class Login {

   private String username; // access modifier = private
    private String password; // access modifier = private

public Login (String username, String password){
    this.username = username;
    // this.password = password;
    setPassword(password); // i dont want to reveal the pwd right away that is why i create a method that will give me the password when i call it
}

    public void setPassword (String password){
        if(password.length() >= 8 && password.contains("!") ) {
            this.password = password;
        }
    }


// Hey if you want your password you have to give me a username
public String getPassword (String username) {
    if (username.equals(this.username)){
        return password;
    }
    return "WRONG USERNAME";
}



}
