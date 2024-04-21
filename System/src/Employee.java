import java.util.Scanner;
import java.util.ArrayList;
/*class Employee
{
  private float hourly;
  private float nextPaycheck;
  private String payDate;


  public void takeOrder()
  {
    // takes in an order date, customer ID, a cost, and a list of items and creates a new Transaction object

  }
}*/


class Employee extends User {
    protected double hourly;
    protected double nextPaycheck;
    protected String payDate;

    public Employee(String firstName, String lastName, String email, String phoneNum, String address, String username, String password, double hourly, double nextPaycheck, String payDate) {
        super(firstName, lastName, email, phoneNum, address, username, password);
        this.hourly = hourly;
        this.nextPaycheck = nextPaycheck;
        this.payDate = payDate;
    }

    public void takeOrder(String orderDate, int customerID, double cost, ArrayList<String> items) {
        // Create a new transaction
    }
}
