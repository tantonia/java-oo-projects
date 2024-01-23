package gr.aueb.cf.exercises.ch20;

import java.util.Arrays;
import java.util.List;

import static gr.aueb.cf.exercises.ch20.Product.getFilteredProducts;
import static gr.aueb.cf.exercises.ch20.Product.printProducts;

public class Main {

    private static final List<Product> products = Arrays.asList(
        new Product(1, "Shampoo", 120, 45),
        new Product(2, "Cheese", 40, 29),
        new Product(3, "Butter", 88, 54),
        new Product(4, "Coffee", 99, 33),
        new Product(5, "Milk", 118, 24));

    public static void main(String[] args) {
        List<Product> filteredProducts = getFilteredProducts(products, product -> product.getPrice() >= 41);
//        printProducts(filteredProducts, System.out::println);
        filteredProducts.forEach(System.out::println);

    }
}
