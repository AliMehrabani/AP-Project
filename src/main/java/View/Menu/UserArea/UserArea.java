package View.Menu.UserArea;

import View.Menu.Menu;

import java.util.HashMap;

public class UserArea extends Menu {
    public UserArea(Menu parentMenu) {
        super("User Area", parentMenu);
        HashMap<String, Menu> subMenus = new HashMap<>();
        subMenus.put("Costumer Area", new CostumerArea(this));
        subMenus.put("Guest Area", new GuestArea(this));
        subMenus.put("Seller Area", new SellerArea(this));
        subMenus.put("Manager Area", new ManagerArea(this));
        this.setSubMenus(subMenus);
    }

    @Override
    public String getCommandKey(String command) {
        return null;
    }

    @Override
    public void run() {
        if (controller.getCurrentUserType().equals("Guest")) {
            subMenus.get("Guest Area").run();
        }
        if (controller.getCurrentUserType().equals("Costumer")) {
            subMenus.get("Costumer Area").run();
        }
        if (controller.getCurrentUserType().equals("Seller")) {
            subMenus.get("Seller Area").run();
        }
        if (controller.getCurrentUserType().equals("Manager")) {
            subMenus.get("Manager Area").run();
        }
    }
}
