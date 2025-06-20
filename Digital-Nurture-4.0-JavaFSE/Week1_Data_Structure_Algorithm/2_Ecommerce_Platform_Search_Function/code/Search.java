public class Search {
    public static Product linearSearch(Product[] products, String name) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String name) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = name.compareToIgnoreCase(products[mid].productName);

            if (cmp == 0) return products[mid];
            else if (cmp < 0) high = mid - 1;
            else low = mid + 1;
        }

        return null;
    }

    public static void sortByName(Product[] products) {
        java.util.Arrays.sort(products, (a, b) -> a.productName.compareToIgnoreCase(b.productName));
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Mouse", "Electronics"),
            new Product(102, "Keyboard", "Electronics"),
            new Product(103, "Shirt", "Clothing"),
            new Product(104, "Shoes", "Footwear"),
            new Product(105, "Watch", "Accessories")
        };

        System.out.println("Linear Search:");
        Product result1 = linearSearch(products, "Shirt");
        System.out.println(result1 != null ? result1 : "Product not found");

        System.out.println("\nBinary Search:");
        sortByName(products);  
        Product result2 = binarySearch(products, "Shirt");
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}
