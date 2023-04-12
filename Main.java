import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Ime: ");
        String firstName = read.nextLine();
        System.out.print("Prezime: ");
        String secondName = read.nextLine();
        System.out.print("Godine: ");
        int age = read.nextInt();
        System.out.print("Broj sobe: ");
        int roomNumber = read.nextInt();
        Customer customer = new Customer();
        //set customer's data to object here
        customer.firstName = firstName;
        customer.secondName = secondName;
        customer.age = age;
        customer.roomNumber = roomNumber;

        customer.saveCustomerInfo();
    }
}
class Customer {
    //add all necessary attributes here
    String firstName;
    String secondName;
    int age;
    int roomNumber;

    public void saveCustomerInfo() {
        System.out.println("First name: " + firstName);
        System.out.println("Second name: " + secondName);
        System.out.println("Age: " + age);
        System.out.println("Room number: " + roomNumber);
    }
}
