package View.Menu.UserArea.SellerArea;

import View.Menu.Menu;

public class SellerArea extends Menu {

    public SellerArea(Menu parentMenu) {
        super("Seller Area", parentMenu);
    }

    @Override
    public String getCommandKey(String command) {
        return null;
    }

    public void showSpecifications() {
        controller.getCurrentUser();
    }

    @Override
    public void run() {
        this.showSpecifications();
        super.run();
    }
}
