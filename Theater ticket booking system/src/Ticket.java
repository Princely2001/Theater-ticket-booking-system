public class Ticket {
    //Create variables
    int row;
    int seat;
    double price;
    Person Person;
//Create Ticket Constructor
    public Ticket(int row, int seat, double price, Person person) {
        this.row = row;
        this.seat = seat;
        this.price = price;
        Person = person;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Person getPerson() {
        return Person;
    }

    public void setPerson(Person person) {
        Person = person;
    }
    public  void print(){
        System.out.println("  Person's name  "  + getPerson().get_Name()+   "  Person's surname name +  "+  getPerson().get_Surname()+  "  Person's email  "  + getPerson().get_Email() + "  row number  " + getRow()+ "  seat number  "+ getSeat()+  "  Ticket price  "+ getPrice());
    }
}






