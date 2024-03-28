//import packages
import java.io.Serializable;

public class Person implements Serializable{
    //Create variables
    public String name;
    public String surname;
    public String email;
//Create Person Constructor
    public Person(String name,String surname,String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

        public String get_Name(){
            return name;}
        public String get_Surname(){
            return surname;
        }
        public String get_Email(){
            return email;
        }



}
