package restaurant;

public class MenuItem {
    //class variables
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNewItem;


    //constructor
    public MenuItem(String name, double price , String description){
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = "Not Categorized";
        this.isNewItem = false;
    }

    public MenuItem(String name, double price , String description , String category , boolean isNewItem){
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNewItem = isNewItem;
    }

    //getters and setters
    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getCategory(){
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public boolean getIsNewItem(){
        return this.isNewItem;
    }

    public void setNewItem(boolean isNewItem) {
        this.isNewItem = isNewItem;
    }
}
