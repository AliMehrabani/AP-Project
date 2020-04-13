package View.Menu.UserArea.SellerArea;

import View.Menu.Menu;
import View.View;
import com.sun.jdi.event.MethodEntryEvent;

public class SellerArea extends Menu {

    public SellerArea(Menu parentMenu) {
        super("Seller Area", parentMenu);
    }

    @Override
    public String getCommandKey(String command) {
        return null;
    }

    private Menu getViewCompanyInformation() {
        return new Menu("View Company Information", this) {
            @Override
            public void run(String lastCommand) {
                controller.viewCompanyInfo();
                this.parentMenu.run("");
            }
        };
    }

    private Menu getViewSalesHistory() {
        return new Menu("View Sales History", this) {
            @Override
            public void run(String lastCommand) {
                controller.viewSalesHistory();
                View.printString("");
                this.parentMenu.run("");
            }
        };
    }

    private Menu getAddProduct() {
        return new Menu("Add Product", this) {
            @Override
            public void run(String lastCommand) {
                controller.addProduct(new String[3]);
                this.parentMenu.run("");
            }
        };
    }

    private Menu getRemoveProduct() {
        return new Menu("Remove Product", this) {
            @Override
            public void run(String lastCommand) {
                controller.removeProduct(1);
                this.parentMenu.run("");
            }
        };
    }

    private Menu getShowCategories() {
        return new Menu("Show Categories", this) {
            @Override
            public void run(String lastCommand) {
                controller.showCategories();
                this.parentMenu.run("");
            }
        };
    }

    private Menu getViewBalance() {
        return new Menu("View Balance", this) {
            @Override
            public void run(String lastCommand) {
                controller.getBalance();
                this.parentMenu.run("");
            }
        };
    }

    public void showSpecifications() {
        controller.getCurrentUser();
    }

    @Override
    public void run(String lastCommand) {
        this.showSpecifications();
        super.run(lastCommand);
    }
}
