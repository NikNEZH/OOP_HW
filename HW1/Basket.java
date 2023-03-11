package HW1;
import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> basketProducts;

    public Basket() {
        basketProducts = new ArrayList<>();
    }
    
    /**
     * Поьзователь добавляет продукты в корзину
     * @param product
     */
    public void addProduct(Product product) {
        basketProducts.add(product);
    }
    
    /**
     * Поьзователь удаляет продукты из корзины
     * @param product
     */
    public void removeProduct(Product product) {
        basketProducts.remove(product);
    }
    
    /**
     * Получаем информацию о том что в корзине находится
     * @return
     */
    public ArrayList<Product> getProducts() {
        return basketProducts;
    }
}
