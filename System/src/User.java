import java.util.Scanner;
import java.util.ArrayList;

class User {
    private static int userCount = 0;
    protected int userID;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String phoneNum;
    protected String address;
    protected String username;
    protected String password;

    public User(String firstName, String lastName, String email, String phoneNum, String address, String username, String password) {
        this.userID = ++userCount;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNum = phoneNum;
        this.address = address;
        this.username = username;
        this.password = password;
    }
    public boolean login(String inputUsername, String inputPassword) {
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            return true;
        } else {
            return false;
        }
    }
    public void register(String firstName, String lastName, String email, String phoneNum, String address, String username, String password) 
    {
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
      this.phoneNum = phoneNum;
      this.address = address;
    }

    public void changePersonalInfo(String firstName, String lastName, String email, String phoneNum, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNum = phoneNum;
        this.address = address;
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
    }
}