import java.util.ArrayList;



public class Main {

    static ArrayList<Customer> customers = new ArrayList<Customer>();

    public static void main(String[] args) {

        Customer customer1 = new Customer("Frederik", "Edvardsen", "Freddybabs");
        customers.add(customer1);
        Customer customer2 = new Customer("Oliver", "Pedersen", "Coronavaranen");
        customers.add(customer2);
        Customer customer3 = new Customer("Snorre", "KERCTERCMER", "Dingo");
        customers.add(customer3);
        printCustomers(customers);
    }
    static void printCustomers(ArrayList customers) {
        for (Object c : customers) {
            System.out.println(c);
        }
    }
}
