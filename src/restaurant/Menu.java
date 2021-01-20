package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    //class variables
    private ArrayList menuItems;
    private Date isUpdated;

    //constructor

    public Menu(){
        this.isUpdated = new Date();
    }

    //methods

    public ArrayList getMenuItems() { return menuItems;}

    public void setMenuItems(ArrayList menuItems){ this.menuItems = menuItems;}

    public Date getIsUpdated() { return isUpdated; }

    public void setIsUpdated(Date isUpdated) { this.isUpdated = isUpdated; }

}

