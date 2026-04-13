// import java.util.Locale.Category;

public class Product {

    private int id;
    private String name;
    private int quantity;
    private double price;
    private Category category;


    public Product(int id, String name, int quantity, double price, Category category){


        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.category = category;

    }


    // Getters

    public int getId(){
        
        return this.id;
    }


    public String getName() {
        return this.name;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public double getPrice(){
        return this.price;
    }

    public Category getCategory(){
        return this.category;

    }

    //Setters

    public void setName(String newname){
        this.name = newname;

    }

    public void setQuantity(int newquantity){
        this.quantity = newquantity;
    }

    public void setPrice(double newPrice){
        this.price = newPrice;

    }


    public void setCategory(Category newCategory) {

        this.category = newCategory;
    }

    //The toString



}