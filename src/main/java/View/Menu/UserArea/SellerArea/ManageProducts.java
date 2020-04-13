package View.Menu.UserArea.SellerArea;

import View.Menu.Menu;
import View.View;

public class ManageProducts extends Menu {

    public ManageProducts(Menu parentMenu) {
        super("Manage Products", parentMenu);
    }

    @Override
    public String getCommandKey(String command) {
        return null;
    }

    private Menu getView() {
        return new Menu("view",this) {
            @Override
            public String getCommandKey(String command) {
                return null;
            }

            @Override
            public void run(String lastCommand) {
                controller.viewSellerProducts();
                View.printString("");
                this.parentMenu.run("");
            }
        };
    }

    private Menu getViewBuyers() {
        return new Menu("View Buyers", this) {
            @Override
            public String getCommandKey(String command) {
                return null;
            }

            @Override
            public void run(String lastCommand) {
                controller.viewProductBuyers();
                this.parentMenu.run("");
            }
        };
    }

    private Menu getEdit() {
        return new Menu("Edit", this) {
            @Override
            public String getCommandKey(String command) {
                return null;
            }

            @Override
            public void run(String lastCommand) {
                controller.editProduct("", "", 1);
                this.parentMenu.run("");
            }
        };
    }

    private void showProducts(){}

    @Override
    public void run(String lastCommand) {
        this.showProducts();
        super.run(lastCommand);
    }
}
