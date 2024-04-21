import java.util.*;
import java.io.*;

public class Transactions {
    static private ArrayList<String> ordersList = new ArrayList<String>();
    static private File transactionsList;
    static private Scanner sc;
    static private PrintWriter writer;
    try{
        transactionsList = new File("TransactionsStorage.txt");
        sc = new Scanner(transactionsList);
        writer = new PrintWriter(transactionsList);
        while (sc.hasNextLine()){
          ordersList.add(sc.nextLine());
        }
    } catch (Exception e){
        System.out.println(e);
    }

    static public void addNewTransaction(Orders newOrder){ //subtract ingredients from inventory file (check that the order is possible in the order/takeorder methods for the users(check the number of ingredients));
        String orderDetails = newOrder.getOrderDetails();
        ordersList.add(orderDetails);
        try{
            writer.println(orderDetails);
        } catch (Exception e){
            System.out.println(e);
        }
    }
    static public ArrayList<String> getTransactions(){
        return ordersList;
    }
}