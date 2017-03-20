package exo2;

import java.util.ArrayList;
import java.util.Observable;

/**
 * Created by adrien on 11/02/17.
 */
public class UserList extends Observable  {
    private ArrayList<String> userList;

    //CONSTRUCTOR
    public UserList() {
        userList = new ArrayList<>();
    }

    public boolean addUser (String user) {

        if (!userList.contains(user))
        {
            userList.add(user);
            //Notify observers when adding user
            setChanged();
            notifyObservers();
            return true;
        }

        else return false;
    }

    /*Get data from model*/
    //@Override
    public String[] getData() {
        String[] listString = new String[userList.size()];

        //convert arraylist to string
        listString = userList.toArray(listString);
        //System.out.println(listString);
        return listString;
    }

}
