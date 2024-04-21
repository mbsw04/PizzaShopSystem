public class Restaurant {
    private String businessAdress;
    private String businessPhoneNum;
    Restaurant(){
        businessAdress = "1112 Smith st, Atlanta, GA 87654";
        businessPhoneNum = "0987654321";
    }
    public String getBusinessAdress(){
        return businessAdress;
    }
    public String getBusinessPhoneNum(){
        return businessPhoneNum;
    }
}