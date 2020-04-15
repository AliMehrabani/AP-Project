package View.Menu.UserArea.CostumerArea;

import Controller.CostumerAreaController;
import View.Menu.Menu;
import View.Menu.UserArea.ViewPersonalInfo;

import java.util.HashMap;

public class CostumerArea extends Menu {

    public CostumerArea(Menu parentMenu) {
        super("Costumer Area", parentMenu);
        HashMap<String, Menu> subMenus = new HashMap<>();
        subMenus.put("View Balance", getViewBalance());
        subMenus.put("View Discount Codes", getViewDiscountCodes());
        subMenus.put("View Personal Info", new ViewPersonalInfo(this));
        subMenus.put("Purchase", new Purchase(this));
        subMenus.put("View Cart", new ViewCart(this));
        subMenus.put("View Orders", new ViewOrders(this));
        this.setSubMenus(subMenus);
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
                CostumerAreaController.viewCostumerDiscountCodes();
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
