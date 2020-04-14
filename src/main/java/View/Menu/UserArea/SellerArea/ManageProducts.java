package View.Menu.UserArea.SellerArea;

import View.Menu.Menu;
import View.Menu.UserArea.ViewPersonalInfo;
import View.View;

import java.util.HashMap;

public class ManageProducts extends Menu {

    public ManageProducts(Menu parentMenu) {
        super("Manage Products", parentMenu);
        HashMap<String, Menu> subMenus = new HashMap<>();
        subMenus.put("View Product", getView());
        subMenus.put("View Buyers", getViewBuyers());
        subMenus.put("Edit Product", getEdit());
        this.setSubMenus(subMenus);
    }

    @Override
    public String getCommandKey(String command) {
        return null;
    }

    private Menu getView() {
        return new Menu("view",this) {
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
            public void run(String lastCommand) {
                controller.viewProductBuyers();
                this.parentMenu.run("");
            }
        };
    }

    private Menu getEdit() {
        return new Menu("Edit", this) {
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
