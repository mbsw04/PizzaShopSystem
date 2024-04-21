import java.util.*;
import java.io.*;

public class Menu {
    static private ArrayList<String> foodItemsList = new ArrayList<>(); //running list of all menu items
    static private File menuItemsList;
    static private Scanner sc;
    static private PrintWriter writer;
    try{
        menuItemsList = new File("MenuItemsStorage.txt");
        sc = new Scanner(menuItemsList);
        writer = new PrintWriter(menuItemsList);
        while (sc.hasNextLine()){
            foodItemsList.add(sc.nextLine());
        }
    } catch(Exception e){
        System.out.println(e);
    }

    static public void addMenuItem(FoodItems newMenuItem){
        String newItemDetails = newMenuItem.getAllFoodDetails();
        foodItemsList.add(newItemDetails);
        try{
            writer.println(newItemDetails);
        } catch (Exception e){
            System.out.println(e);
        }
    }
    static public void deleteMenuItem(String foodName){
        ArrayList<String> names = new ArrayList<String>();
        for (String x: foodItemsList){
            names.add(x.split(";")[0]);
        }
        for (int i = 0; i < names.size(); i++){
            if (names.get(i).equals(foodName){
                //remove the item from the file and the arraylist
                names.remove(foodItemsList.get(i));
            }
        }
    }
    static public ArrayList<String> getMenu(){
        return foodItemsList;
    }
    static public void updateFile(){
        Scanner scan;
        PrintWriter reseter;
        try{
            scan = new Scanner(menuItemsList);
            reseter = new PrintWriter(menuItemsList);
            while (scan.hasNextLine()){
                for (String x : foodItemsList){
                    reseter.println(x);
                }
                reseter.println("");
            } 
        } catch (Exception e){
            System.out.println(e);
        }               
    }
}