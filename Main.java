import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;



public class Main {
    int nextId;
    ArrayList<Product> productlist;

    

    public static void main(String[] args) {
        new Main();
    }

    
    public Main(){
        productlist = new ArrayList<>();
        nextId = 1;

    }

    private void saveToFile() {

        String products = "products.txt";

        try {
            FileWriter stf =new FileWriter(products);

            stf.write("\n adding this line to the file");



            
        } catch (IOException e) {
            // TODO: handle exception
        }
    }

    
        
        
    
}
