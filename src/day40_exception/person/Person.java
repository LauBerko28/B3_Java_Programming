package day40_exception.person;

public class Person {
   private String name; // encapsulating to limit the access
   private int age;

   // if i want to give indirect acces i create public getters and setters


    public String getName() {
        return name;
    }

    //THROWS keyword is to ignore
    public void setName(String name) throws Exception{
        if(name==null || name.isEmpty()){
           // System.out.println("Cannot assigned"); // at work most of the time you dont print this, instead you throw an exception
            throw new Exception("Name cannot be empty"); // this will give me a compile error exception, to handle it I can either ignore it by using throws on the method signature, or actually handle it
            // this will happen at the run time
            // THROW is when i want to cause an error - manually throw an exception

        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120 ) {
            throw new IllegalArgumentException("Age must be between 0 and 120"); // im not forced to handle this one here because this is a runTimeException
        }
        this.age = age; // this one can be in the else or out, because if the if condition reached it'll never get to this.age = age;
    }
}
