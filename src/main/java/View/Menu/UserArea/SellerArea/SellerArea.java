package View.Menu.UserArea.SellerArea;

import View.Menu.Menu;
import View.View;

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
            public String getCommandKey(String command) {
                return null;
            }

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
            public String getCommandKey(String command) {
                return null;
            }

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
            public String getCommandKey(String command) {
                return null;
            }

            @Override
            public void run(String lastCommand) {
                controller.addProduct(new String[3]);
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
