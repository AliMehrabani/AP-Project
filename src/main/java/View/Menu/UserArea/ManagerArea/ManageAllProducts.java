package View.Menu.UserArea.ManagerArea;

import View.Menu.Menu;

public class ManageAllProducts extends Menu {

    public ManageAllProducts(String name, Menu parentMenu) {
        super("Manage All Products", parentMenu);
    }

    @Override
    public String getCommandKey(String command) {
        return null;
    }

    private Menu getDeleteProduct() {
        return new Menu("Delete Product", this) {
            @Override
            public String getCommandKey(String command) {
                return null;
            }

            @Override
            public void run(String lastCommand) {
                controller.deleteProduct(1);
            }
        };
    }

    private void showAllProducts() {

    }

    @Override
    public void run(String lastCommand) {
        this.showAllProducts();
        super.run(lastCommand);
    }
}
