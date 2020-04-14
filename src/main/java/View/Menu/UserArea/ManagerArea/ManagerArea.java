package View.Menu.UserArea.ManagerArea;

import View.Menu.Menu;
import View.Menu.UserArea.ViewPersonalInfo;

import java.util.HashMap;

public class ManagerArea extends Menu {

    public ManagerArea(Menu parentMenu) {
        super("Manager Area", parentMenu);
        HashMap<String, Menu> subMenus = new HashMap<>();
        subMenus.put("Create Discount Code", getCreateDiscountCode());
        subMenus.put("Manage All Products", new ManageAllProducts(this));
        subMenus.put("Manage Categories", new ManageCategories(this));
        subMenus.put("Manage Requests", new ManageRequests(this));
        subMenus.put("Manage Users", new ManageUsers(this));
        subMenus.put("View Discount Codes", new ViewDiscountCodes(this));
        subMenus.put("View Personal Info", new ViewPersonalInfo(this));
        this.setSubMenus(subMenus);
    }

    @Override
    public String getCommandKey(String command) {
        return null;
    }

    private Menu getCreateDiscountCode() {
        return new Menu("Create Discount Code", this) {
            @Override
            public void run(String lastCommand) {
                controller.createDiscountCode(new String[3]);
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