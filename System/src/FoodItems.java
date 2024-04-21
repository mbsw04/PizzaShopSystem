public class FoodItems {
    private String foodName;
    private float foodPrice;

    FoodItems(String name, float price){
        foodName = name;
        foodPrice = price;
    }
    public String getFoodName(){
        return foodName;
    }
    public String getFoodDetails(){
        return foodName +";"+ foodPrice;
    }
}