package View.Menu.UserArea.CostumerArea;

import View.Menu.Menu;

public class CostumerArea extends Menu {

    public CostumerArea(Menu parentMenu) {
        super("Costumer Area", parentMenu);
    }

    @Override
    public String getCommandKey(String command) {
        return null;
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

    private Menu getViewDiscountCodes() {
        return new Menu("View Discount Codes", this) {
            @Override
            public void run(String lastCommand) {
                controller.viewCostumerDiscountCodes();
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
