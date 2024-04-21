import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.IntFunction;

class userHandler{
    ArrayList<User> userlist = new ArrayList<>();



    userHandler(){
        //admin user
        userlist.add(new User("admin","admin","maan","0000000000","---","maan",true,true));

        //read all users from UserStorage


    }

    public User[] getUserlist() {
        User[] ty = new User[userlist.size()];
        for(User x: userlist){
            int i = 0;
            if (x.isEmployee){
                ty[i] = x;
                i++;
            }
        }
        return ty;
    }

    private static void updateData(){
        //clear the user file
        //and store all users from userlist in user file
    }

    void register(User x){
        userlist.add(x);
    }
    User getUser(String email){
        if(email == "" || email == null){
            return null;
        }
        for(User x: userlist){
            if(x.getEmail().compareToIgnoreCase(email)==0){
                return x;
            }
        }
        return null;
    }
}

class Employee extends User {
    protected double hourly;
    protected double nextPaycheck;
    protected String payDate;

    public Employee(String firstName, String lastName, String email, String phoneNum, String address, String password, double hourly, double nextPaycheck, String payDate) {
        super(firstName, lastName, email, phoneNum, address, password,true,false);
        this.hourly = hourly;
        this.nextPaycheck = nextPaycheck;
        this.payDate = payDate;
    }

    public void takeOrder(String orderDate, int customerID, double cost, ArrayList<String> items) {
        // Create a new transaction
    }

    @Override
    public String toString(){
        return firstName +" "+ lastName+"\n"
                + email +" "+ phoneNum+ "\n"
                + address + "\n"
                + "Hourly: 16\n"
                + "Next Pay: 289.56\n"
                + "Pay Date: 2/24";
    }
}

class User {
    private static int userCount = 0;
    public int userID;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String phoneNum;
    protected String address;
    protected String password;
    public boolean isEmployee;
    public boolean isManager;

    public User(String firstName, String lastName, String email, String phoneNum, String address, String password,boolean isEmployee, boolean isManager) {
        this.userID = ++userCount;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNum = phoneNum;
        this.address = address;
        this.password = password;
        this.isEmployee = isEmployee;
        this.isManager = isManager;
    }
    /*

*/
    public void changePersonalInfo(String firstName, String lastName, String email, String phoneNum, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNum = phoneNum;
        this.address = address;
    }

    @Override
    public String toString(){
        return firstName +" "+ lastName+"\n"
                + email +" "+ phoneNum+ "\n"
                + address + "\n"
                + "Hourly: 16\n"
                + "Next Pay: 289.56\n"
                + "Pay Date: 2/24";
    }

    public static int getUserCount() {
        return userCount;
    }

    public static void setUserCount(int userCount) {
        User.userCount = userCount;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}