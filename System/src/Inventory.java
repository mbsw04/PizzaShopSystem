import java.util.*;
import java.io.*;

public class Inventory {
    static ArrayList<String> foodInventory;  //foodInventory is full list of inventory stuff
    static private File inventoryList; //the file access
    static private Scanner sc;
    static private PrintWriter writer;
    try{
        inventoryList = new File("InventoryStorage.txt");
        sc = new Scanner(inventoryList);
        writer = new PrintWriter(inventoryList);
        while (sc.hasNextLine()){
            foodInventory.add(sc.nextLine()); //instantiate the list using the file
        }
    }catch(Exception e){
        System.out.println(e);
    }

    static public ArrayList<String> getInventory(){
        return foodInventory;
    }
}