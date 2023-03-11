package HW1;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         * Создаем группу товаров
         */
        Product product_1 = new Product("Колбаса",1002, 3.8 );
        Product product_2 = new Product("Телевизор", 25000, 4.5);
        Product product_3 = new Product("Холодильник", 30000, 4.3);
        Product product_4 = new Product("Станок", 15000, 4.7);

         /**
          *  создаем категории и добавляем в них товары
          */
         ArrayList<Product> group_products1 = new ArrayList<>();
         group_products1.add(product_2);
         group_products1.add(product_3);
         Categories categories_1 = new Categories("Бытовая техника", group_products1);
         
         ArrayList<Product> group_products2 = new ArrayList<>();
         group_products2.add(product_4);
         Categories categories_2 = new Categories("Инструменты", group_products2);

         ArrayList<Product> group_products3 = new ArrayList<>();
         group_products3.add(product_1);
         Categories categories_3 = new Categories("Продукты питания", group_products3);

        /**
         * выводим каталог продуктов
         */
        System.out.println("Каталог продуктов:");
        for (Categories category : new Categories[] {categories_1, categories_2,categories_3}) {
            System.out.println(category.getName() + ":");
            for (Product product : category.getGroupnamesproduct()) {
                System.out.println("\t" + product.getName() + ", цена: " + product.getPrice() + ", рейтинг: " + product.getRating());
            }
        }
        System.out.println("=========================================");
        /**
         * создаем пользователей
         */
        User Petrov = new User("Петров К.С.", "8547620Pet");
        User Ivanov = new User("Иванов Л.В.", "8547620Ivan");

        /**
         * пользователи покупают товары 
         */
        Petrov.addProduct(product_4);
        categories_2.getGroupnamesproduct().remove(product_4);

        Ivanov.addProduct(product_1);
        categories_3.getGroupnamesproduct().remove(product_1);
        Ivanov.addProduct(product_3);
        categories_1.getGroupnamesproduct().remove(product_3);

        // выводим содержимое корзины пользователя Petrov
        System.out.println("Содержимое корзины пользователя " + Petrov.getLogin() + ":");
        for (Product product :Petrov.getProducts()) {
            System.out.println("\t" + product.getName());
        }

        // выводим содержимое корзины пользователя Ivanov
        System.out.println("Содержимое корзины пользователя " + Ivanov.getLogin() + ":");
        for (Product product :Ivanov.getProducts()) {
            System.out.println("\t" + product.getName());
        }
        System.out.println("=========================================");
        /**
         * выводим остатки в магазине
         */
        System.out.println(" Остатки в каталоге продуктов:");
        for (Categories category : new Categories[] {categories_1, categories_2,categories_3}) {
            if (category.getGroupnamesproduct().isEmpty() == false){
                System.out.println(category.getName() + ":");
                for (Product product : category.getGroupnamesproduct()) {
                    System.out.println("\t" + product.getName() + ", цена: " + product.getPrice() + ", рейтинг: " + product.getRating());
                }
            }
        }
    }
}
