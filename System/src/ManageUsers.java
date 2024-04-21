import java.util.*;
import java.io.*;

public class ManageUsers{    // still being worked on

    private ArrayList<String> usersList = new ArrayList<String>();
    private File usersStorage;
    private Scanner sc;
    private PrintWriter writer;  

    ManageUsers(){       //MAAN: call this when creating a new user, then call register method with the object
        try{
            usersStorage = new File("UsersStorage.txt");
            sc = new Scanner(usersStorage);
            writer = new PrintWriter(usersStorage);
            while (sc.hasNextLine()){
                usersList.add(sc.nextLine());
           }
        } catch(Exception e){
           System.out.println(e);
        }
    }
}