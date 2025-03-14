import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private int id;

    
    private static int counter = 0;

    Customer (String firstName,String lastName, String username){
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        counter++;
        id = counter;


    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName (){
        return this.lastName;
    }
    public String getUsername (){
        return this.username;
    }
    public int getID(){
        return this.id;
    }

    public void setFirstName(String FirstName) {
        this.firstName = FirstName;
    }
    public void setLastName(String LastName){
        this.lastName = LastName;
    }
    public void setUsername(String Username){
        this.username = Username;
    }
    public void setID(int ID){
        this.id = ID;
    }



    @Override
    public String toString(){
        String s = "User: " + firstName + " " + lastName + "\n" + "Username: " + username +  "\n" + "ID: " + id;
        return s;
    }

}
