public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Product p1 = new Product(101, "Mouse", 50, 299.99);
        Product p2 = new Product(102, "Keyboard", 30, 499.99);

        manager.addProduct(p1);
        manager.addProduct(p2);

        manager.showInventory();

        manager.updateProduct(101, 40, 279.99);
        manager.deleteProduct(102);

        manager.showInventory();
    }
}
