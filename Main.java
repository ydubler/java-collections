import java.util.*;

public class Main {

    public static void main(String[] args) {

        Product bookShakespeare = new Product("book", "Shakespeare");
        Product bookHurston = new Product("book", "Hurston");
        List<Product> removeCollection = new ArrayList<>();
        removeCollection.add(bookShakespeare);

        List<Product> products = new ArrayList<Product>();
        System.out.println("Size of products is " + products.size());
        System.out.println("\n");

        products.add(bookShakespeare);
        System.out.println("Added a bookShakespeare to products.");
        System.out.println("Size of products is " + products.size());
        System.out.println("\n");

        products.remove(bookShakespeare);
        System.out.println("Removed a bookShakespeare from products.");
        System.out.println("Size of products is " + products.size());
        System.out.println("\n");

        products.add(bookShakespeare);
        System.out.println("Added a bookShakespeare to products.");
        products.add(bookShakespeare);
        System.out.println("Added a bookShakespeare to products.");
        System.out.println("Size of products is " + products.size());
        System.out.println("\n");

        products.remove(bookShakespeare);
        System.out.println("Removed a bookShakespeare from products.");
        System.out.println("Size of products is " + products.size());
        System.out.println("\n");

        products.add(bookShakespeare);
        System.out.println("Added a bookShakespeare to products.");
        System.out.println("Size of products is " + products.size());
        System.out.println("\n");

        products.removeAll(removeCollection);
        System.out.println("Removed all bookShakespeare from products.");
        System.out.println("Size of products is " + products.size());
        System.out.println("\n");

        products.add(bookShakespeare);
        System.out.println("Added a bookShakespeare to products.");
        products.add(bookShakespeare);
        System.out.println("Added a bookShakespeare to products.");
        products.add(bookHurston);
        System.out.println("Added a bookHurston to products.");
        products.add(bookHurston);
        System.out.println("Added a bookHurston to products.");
        System.out.println("Size of products is " + products.size());
        System.out.println("\n");

        products.removeAll(removeCollection);
        System.out.println("Removed all bookShakespeare from products.");
        System.out.println("Note equals() method has been overridden in the Product class.");
        System.out.println("Only Products with the same name AND with the same creator are removed.");
        System.out.println("Therefore only 2 books were removed from the ArrayList.");
        System.out.println("Size of products is " + products.size());
        System.out.println("\n");
    }
}

class Product {

    public String name;
    public String creator;

    public Product(String name, String creator) {
        this.name = name;
        this.creator = creator;
    }

    @Override
    public boolean equals(Object other) {
        // check null & matching class
        if (other == null || other.getClass() != this.getClass()) {
            return false;
        }

        // type conversion & check name
        final Product otherProduct = (Product) other;
        if (this.name == otherProduct.name && this.creator == otherProduct.creator) {
            return true;
        } else {
            return false;
        }
    }

}