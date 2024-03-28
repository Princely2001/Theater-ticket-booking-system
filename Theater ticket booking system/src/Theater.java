//import packages
import java.io.*;
import java.util.Scanner;
import java.util.Objects;
import java.util.*;
import java.util.ArrayList;
import java.io.FileReader;
public class Theater {
    //Create arrays and variables
    static ArrayList<Ticket> ticket_array = new <Ticket>ArrayList();
    static int new_tickets;
    static int new_tickets1;
    static int[] rowArray1 = new int[12];
    static int[] rowArray2 = new int[16];
    static int[] rowArray3 = new int[20];
    static int option1;
    static int can_tic;
    static int new_tickets2;
    static double price;
    public static void main(String[] args) {
        try {
            while (true) {
                //Print option lists
                System.out.println("--------------------------------------------------");
                System.out.println("Welcome to the New Theatre");
                System.out.println("--------------------------------------------------");
                System.out.println("Please select an option:");
                System.out.println("1) Buy a ticket");
                System.out.println("2) Print seating area");
                System.out.println("3) Cancel ticket");
                System.out.println("4) List available seats");
                System.out.println("5) Save to file");
                System.out.println("6) Load from file");
                System.out.println("7) Print ticket information and total price");
                System.out.println("8) Sort tickets by price");
                System.out.println("     0) Quit");
                System.out.println("--------------------------------------------------");
                //Option input from user
                Scanner option = new Scanner(System.in);
                System.out.println("Please enter your prefered option");
                option1 = option.nextInt();
                //Check user input options

                if (Objects.equals(option1, 1)) {
                    buy_ticket();

                } else if (Objects.equals(option1, 2)) {
                    print_seating_area();
                } else if (Objects.equals(option1, 3)) {
                    cancel_ticket();

                } else if (Objects.equals(option1, 4)) {

                    show_available();
                } else if (Objects.equals(option1, 5)) {
                    save();
                } else if (Objects.equals(option1, 6)) {
                    load();
                } else if (Objects.equals(option1, 7)) {
                    show_tickets_info();


                } else if (Objects.equals(option1, 8)) {
                    sort_tickets();
                } else if (Objects.equals(option1, 0)) {
                    System.out.println("Thank you visit again");
                    System.exit(0);
                } else {
                    System.out.println("Incorrect option please enter 0 to 8 values ");
                }
            }
            }
        catch(Exception e){
                System.out.println("error please run again code");

            }

    }
    public static void buy_ticket() {
        while(true) {
            //get inputs from user
            Scanner tickets = new Scanner(System.in);
            System.out.println("Enter row number:");
            new_tickets = tickets.nextInt();
            Scanner tickets1 = new Scanner(System.in);
            System.out.println("Enter seat number:");
            new_tickets1 = tickets1.nextInt();
            System.out.println("Enter name");
            String name = tickets.next();
            System.out.println("Enter Surname");
            String Surname = tickets.next();
            System.out.println("Enter email");
            String email = tickets.next();
            //Check inputs validation
            if (0 > new_tickets || new_tickets > 3) {
                System.out.println("Incorrect row number try again");
                break;
            }
            if (new_tickets == 1 && new_tickets1 < 0 && new_tickets1 > 12) {
                System.out.println("Incorrect seat number try again");
                break;
            } else if (new_tickets == 2 && new_tickets1 < 0 && new_tickets1 > 16) {
                System.out.println("Incorrect seat number try again");
                break;
            } else if (new_tickets == 3 && new_tickets1 < 0 && new_tickets1 > 20) {
                System.out.println("Incorrect seat number try again");
                break;
            }
            if (new_tickets == 1) {
                price = 100;
            } else if (new_tickets == 2) {
                price = 200;
            } else {
                price = 300;
            }
            Person n_person = new Person(name, Surname, email);
            Ticket n_Ticket = new Ticket(new_tickets, new_tickets1, price, n_person);

            //update and print arrays values
            if (new_tickets == 1 && new_tickets1 >= 1 && new_tickets1 <= 12 && rowArray1[new_tickets1 - 1] == 0) {
                rowArray1[new_tickets1 - 1] = 1;
                ticket_array.add(n_Ticket);

            }
            else if (new_tickets == 2 && new_tickets1 >= 1 && new_tickets1 <= 16 && rowArray2[new_tickets1 - 1] == 0) {
                rowArray2[new_tickets1 - 1] = 1;
                ticket_array.add(n_Ticket);

            }
            else if (new_tickets == 3 && new_tickets1 >= 1 && new_tickets1 <= 20 && rowArray3[new_tickets1 - 1] == 0) {
                rowArray3[new_tickets1 - 1] = 1;
                ticket_array.add(n_Ticket);
            }
            else{System.out.println("Seat already booked");}
            System.out.print("raw1: ");
            for (int i = 0; i < rowArray1.length; i++) {
                System.out.print(rowArray1[i]);
            }
            System.out.println();
            System.out.print("raw2: ");
            for (int i = 0; i < rowArray2.length; i++) {
                System.out.print(rowArray2[i]);
            }
            System.out.println();

            System.out.print("raw3: ");
            for (int i = 0; i < rowArray3.length; i++) {
                System.out.print(rowArray3[i]);
            }
            System.out.println();
            break;
        }
    }
    public static void cancel_ticket() {
        while(true) {
            //get inputs from user
            Scanner row_cancel = new Scanner(System.in);
            System.out.println("Enter row number:");
            can_tic = row_cancel.nextInt();
            Scanner tickets1 = new Scanner(System.in);
            System.out.println("Enter seat number:");
            new_tickets2 = row_cancel.nextInt();
            System.out.println("Enter name");
            String name = row_cancel.next();
            System.out.println("Enter Surname");
            String Surname = row_cancel.next();
            System.out.println("Enter email");
            String email = row_cancel.next();
            //Check user inputs validation
            if (0 > can_tic || can_tic > 3) {
                System.out.println("Incorrect row number try again");
                break;
            } else if (can_tic == 1 && new_tickets2 < 0 && new_tickets2 > 12) {
                System.out.println("Incorrect seat number try again");
                break;
            } else if (can_tic == 2 && new_tickets2 < 0 && new_tickets2 > 16) {
                System.out.println("Incorrect seat number try again");
                break;
            } else if (can_tic == 3 && new_tickets2 < 0 && new_tickets2 > 20) {
                System.out.println("Incorrect seat number try again");
                break;
            }
            if(new_tickets == 1){
                price = 100;
            } else if (new_tickets == 2) {
                price = 200;
            }
            else{ price = 300;}
            Person n_person = new Person(name, Surname, email);
            Ticket n_Ticket = new Ticket(can_tic, new_tickets1, price, n_person);

            //Check and update arrays
            for(int k=0;k < rowArray1.length;k++) {
                if ((can_tic == 1) && (new_tickets1 > 0) && (new_tickets1 <= 12) && (rowArray1[k] == 1)) {
                    rowArray1[new_tickets1 - 1] = 0;
                }
            }
            for(int k=0;k < rowArray2.length;k++) {
                if ((can_tic == 2 && new_tickets1 > 0) && (new_tickets1 <= 16) && (rowArray2[k] == 1)) {
                    rowArray2[new_tickets1 - 1] = 0;
                }
            }
            for(int k=0;k < rowArray3.length;k++){
                if ((can_tic == 3 && new_tickets1 > 0) && (new_tickets1 <= 20 && rowArray3[k] == 1)) {
                    rowArray3[new_tickets1 - 1] = 0;
                }}

            for (Ticket i:ticket_array) {
                    if (i.getRow() == can_tic && i.getSeat() == new_tickets2) {
                        ticket_array.remove(i);
                        System.out.println("Cancelled ticket");
                        break;
                    }
            }
            break;
        }
    }
    public static void print_seating_area() {
//
        for (int i = 0; i < rowArray1.length; i++) {
            if (rowArray1[i] == 1) {
                System.out.print("X");
            }
            else {
                System.out.print("O");
            }
        }
        System.out.println();
        for (int i = 0; i < rowArray2.length; i++) {
            if (rowArray2[i] == 1) {
                System.out.print("X");
            }
            else {
                System.out.print("O");
            }
        }
        System.out.println("");
        for (int i = 0; i < rowArray3.length; i++) {
            if (rowArray3[i] == 1) {
                System.out.print("X");
            }
            else {
                System.out.print("O");
            }
        }
        //Print design
        System.out.println("");
        System.out.println("          ********************  ");
        System.out.println("          *       STAGE      *  ");
        System.out.println("          ********************  ");
        System.out.print("            ");
        for (int i = 0;i<rowArray1.length; i++) {
            if(rowArray1[i]==1){
                System.out.print("X");
            }
            else{
                System.out.print("O");
            }
            if(i==5){
                System.out.print("    ");
            }

        }
        System.out.println();
        System.out.print("          ");
        for (int i = 0; i<rowArray2.length; i++) {
            if(rowArray2[i]==1){
                System.out.print("X");
            }
            else{
                System.out.print("O");
            }
            if(i==7){
                System.out.print("    ");
            }

        }
        System.out.println();
        System.out.print("        ");
        for (int i = 0; i<rowArray3.length; i++) {
            if(rowArray3[i]==1){
                System.out.print("X");
            }
            else{
                System.out.print("O");
            }
            if(i==9){
                System.out.print("    ");
            }

        }
        System.out.println();
    }

    public static void show_available() {
        //Check and update arrays
        System.out.print("Seats available in row 1:");
        for (int i = 0; i < rowArray1.length; i++) {
            if (rowArray1[i] == 0) {
                System.out.print(i + 1 + ",");
            }
        }
        System.out.println("");
        System.out.print("Seats available in row 2:");
        for (int i = 0; i < rowArray2.length; i++) {
            if (rowArray2[i] == 0) {

                System.out.print(i + 1 + ",");
            }
        }
        System.out.println("");
        System.out.print("Seats available in row 3:");
        for (int i = 0; i < rowArray3.length; i++) {
            if (rowArray3[i] == 0) {
                System.out.print(i + 1 + ",");
            }
        }
        System.out.println("");
    }
    public static void save() {
        //Arrays write to the filename.txt file
        try {
            FileWriter myWriter = new FileWriter("Theater.txt");
            myWriter.write("Row 1: ");
            myWriter.write(Arrays.toString(rowArray1));
            myWriter.write("/n");
            myWriter.write("Row 2: ");
            myWriter.write(Arrays.toString(rowArray2));
            myWriter.write("/n");
            myWriter.write(("Row 3: "));
            myWriter.write(Arrays.toString(rowArray3));
            myWriter.write("/n");
            System.out.println("File updated Successfully");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void load() {
        //Arrays read from filename.txt file
        try {
            File File_read = new File("Theater.txt");
            Scanner Reader = new Scanner(File_read);
            while (Reader.hasNextLine()) {
                String theater_data = Reader.nextLine();
                System.out.println(theater_data);
            }
            Reader.close();
        } catch (FileNotFoundException e) {
            System.out.println(" error");
            e.printStackTrace();
        }
    }
    public static void show_tickets_info() {
        //print the detail report of tickets
        double p=0;
        for(Ticket i:ticket_array){
            p=p+i.getPrice();
            System.out.println("********** Welcome ***********");
            System.out.println("******************************");
            System.out.println("Name:"+ i.getPerson().get_Name());
            System.out.println("Surname:"+ i.getPerson().get_Surname());
            System.out.println("Email:"+ i.getPerson().get_Email());
            System.out.println("Row Number:"+ i.getRow());
            System.out.println("Seat Number:"+i.getSeat());
            System.out.println("Price:"+ i.getPrice());
            System.out.println("******************************");
            System.out.println("******************************");
            System.out.println("");
        }
        System.out.println("Total ticket price = " + p);
    }
    public static void sort_tickets(){
        //Ticket price sorting part
        Ticket[] tickets = ticket_array.toArray(new Ticket[1]);
        Ticket[] sortedTickets = mergeSort(tickets, 0, tickets.length - 1);
        for (Ticket ticket : sortedTickets) {
            if (ticket != null) {
                ticket.print();
            }
        }
    }
    public static Ticket[] mergeSort(Ticket[] array, int start, int end) {
        Ticket[] sorted;
        if (start < end) {
            int mid = (start + end) / 2;
            Ticket[] array_left = mergeSort(array, start, mid);
            Ticket[] array_right = mergeSort(array, mid + 1, end);
            sorted = merge(array_left, array_right);
        } else {
            sorted = new Ticket[1];
            sorted[0] = array[start];
        }
        return sorted;
    }
    public static Ticket[] merge(Ticket[] array_1, Ticket[] array_2) {
        Ticket[] merged = new Ticket[array_1.length + array_2.length];
        int index1 = 0, index2 = 0, indexMerged = 0;
        while (index1 < array_1.length && index2 < array_2.length) {
            if (array_1[index1].getPrice() <= array_2[index2].getPrice()) {
                merged[indexMerged] = array_1[index1];
                index1++;
            } else {
                merged[indexMerged] = array_2[index2];
                index2++;
            }
            indexMerged++;
        }
        while (index1 < array_1.length) {
            merged[indexMerged] = array_1[index1];
            index1++;
            indexMerged++;
        }
        while (index2 < array_2.length) {
            merged[indexMerged] = array_2[index2];
            index2++;
            indexMerged++;
        }
        return merged;
    }

}












