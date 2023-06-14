// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      BaseCustomerManager baseCustomerManager = new NeroCustomerManager();

      Customer customer = new Customer(1, "Mert", "Duran", 1998, "123123123");
      baseCustomerManager.save(customer);
    }
}