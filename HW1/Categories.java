package HW1;
import java.util.ArrayList;
import java.util.List;

public class Categories extends Product {
    private String name;
    private ArrayList<Product> groupnamesproduct;

    public Categories(String name, ArrayList<Product> groupnamesproduct) {
        this.name = name; 
        this.groupnamesproduct = groupnamesproduct;
    }

    public Categories() {
    }

    public List<Product> getGroupnamesproduct() {
        return groupnamesproduct;
    }

    public void setGroupnamesproduct(ArrayList<Product> groupnamesproduct) {
        this.groupnamesproduct = groupnamesproduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
