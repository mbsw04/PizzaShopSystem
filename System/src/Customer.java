import java.util.Scanner;

import org.junit.runner.manipulation.Filter;

import java.util.ArrayList;

class Customer extends User {
  public Customer(String firstName, String lastName, String email, String phoneNum, String address, String username,
      String password) {
    super(firstName, lastName, email, phoneNum, address, username, password);
  }

  public void order(String orderDate, int userID, float cost, ArrayList<FoodItems> items) {
    Orders newOrder = new Orders(orderDate, userID, items, cost);
    
  }
}
