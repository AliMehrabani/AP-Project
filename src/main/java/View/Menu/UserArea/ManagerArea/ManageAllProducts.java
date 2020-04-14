package View.Menu.UserArea.ManagerArea;

import View.Menu.Menu;

public class ManageAllProducts extends Menu {

    public ManageAllProducts(Menu parentMenu) {
        super("Manage All Products", parentMenu);
    }

    private void showAllProducts() {
        controller.getAllProduct();
    }

    @Override
    public void run(String lastCommand) {
        this.showAllProducts();
        String command = scanner.nextLine().trim();
        if (command.startsWith("delete")) {
            controller.deleteProduct(1);
            this.run("");
        }
        if (command.equals("back")) {
            this.parentMenu.run("");
        }
    }
}
