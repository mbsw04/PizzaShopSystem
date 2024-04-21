import java.util.*;
import java.io.*;

class Inventory {
    ArrayList<FoodItems> inventoryList = new ArrayList<>();

    Inventory(){
        inventoryList.add(new FoodItems("10in Thin Crust",10.00f,10));
    }
}

class FoodItems {
    private String foodName;
    private float foodPrice;
    int qty;

    FoodItems(String name, float price,int qty){
        foodName = name;
        foodPrice = price;
        this.qty = qty;
    }
    public String getFoodName(){
        return foodName;
    }

    public float getFoodPrice() {
        return foodPrice;
    }
}