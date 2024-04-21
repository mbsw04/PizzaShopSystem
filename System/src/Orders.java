import java.util.*;

class Orders {
    private int IDCounter = 0;
    private int orderID;
    private String orderDate;
    private int custID;
    private ArrayList<FoodItems> orderItems;
    private float orderCost;

    Orders(String date, int custID, ArrayList<FoodItems> orderItems, float orderCost){
        this.orderID = ++IDCounter;
        this.orderDate = date;
        this.custID = custID;
        this.orderItems = orderItems;
        this.orderCost = orderCost;
    }
    private String getOrderItems(){
        String foodList = "";
        for (FoodItems x: orderItems){
            foodList += x.getFoodName();
            foodList += ";";
        }
        return foodList;
    }
    public String getOrderDetails(){
        return this.orderID +";"+
                orderDate +";"+
                this.custID +";"+
                this.getOrderItems() +
                this.orderCost;
    }
}