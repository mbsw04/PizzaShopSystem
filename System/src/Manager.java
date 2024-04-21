import java.util.Scanner;

/*class Manager extends Employee
  {
    public void viewTransactions()
    {

      
//allows the manager to view all past Orders and their details

    }
    public void viewInventory()
    {
      // prints a list of each item in stock and it’s quantity
    }
    public void changeEmployeeInfo()
    {
      //takes in a user ID, first name, last name, email, phone number, and address , and replaces each existing variable value for the user whose ID was used

    }
    public void addToMenu()
    {
      // takes in a food name, price, and description, and creates a new FoodItem object

    }
    public void deleteFromMenu()
    {
      // takes in a food name, and deletes the FoodItem object from the menu
    }

  }*/


class Manager extends Employee {
    public Manager(String firstName, String lastName, String email, String phoneNum, String address, String username, String password, double hourly, double nextPaycheck, String payDate) {
        super(firstName, lastName, email, phoneNum, address, username, password, hourly, nextPaycheck, payDate);
    }

    public void viewTransactions() {
        // View all past orders and details
        Transactions.getTransactions();
    } //Maan is a bitch and stinky

    public void viewInventory(Inventory inventory) {
      inventory.getInventory();
        //list of items in stock and their quantities
    }

    public void changeEmployeeInfo(int employeeID, String firstName, String lastName, String email, String phoneNum, String address) {
        // Change employee's information        //being worked on still
        //HELP ME
       /* this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNum = phoneNum;
        this.address = address;
        */
        for (Employee employee : allEmployees) 
        {
            if (employee.employeeID == userID) {
                employee.firstName = firstName;
                employee.lastName = lastName;
                employee.email = email;
                employee.phoneNum = phoneNum;
                employee.address = address;
                break;
            }
        }
    }  
    public void addToMenu(String foodName, float price, Menu menu) {
        FoodItems newItem = new FoodItems(foodName, price);
        menu.addMenuItem(newItem);
    }

    public void deleteFromMenu(String foodName, Menu menu) {
      menu.deleteMenuItem(foodName);
    }
}