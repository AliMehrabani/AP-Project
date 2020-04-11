package View.Menu;

import java.util.HashMap;

public class MainMenu extends Menu {

    public MainMenu() {
        super("Main Menu", null);
        HashMap<String, Menu> subMenus = new HashMap<>();
        subMenus.put("User Area", new UserArea(this));
        subMenus.put("Products Page", new ProductsPage(this));
        subMenus.put("Offs", new Offs(this));
        this.setSubMenus(subMenus);
    }
}
