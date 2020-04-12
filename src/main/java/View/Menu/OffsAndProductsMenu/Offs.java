package View.Menu.OffsAndProductsMenu;

import Controller.Controller;
import View.Menu.Menu;
import View.View;

import java.util.HashMap;

public class Offs extends Menu {
    public Offs(Menu parentMenu) {
        super("Offs", parentMenu);
        HashMap<String, Menu> subMenus = new HashMap<String, Menu>();
        subMenus.put("Show Product",this.showProduct());
        subMenus.put("Show Categories",this.showCategories());
        this.setSubMenus(subMenus);
        this.showProduct();
    }

    @Override
    public String getCommandKey(String command) {
        return null;
    }

    private Menu showProduct() {
        return new Menu("Show Product", this) {
            @Override
            public String getCommandKey(String command) {
                return null;
            }

            @Override
            public void run(String command) {
                View.printOffProduct(Controller.getProduct(true));
                this.parentMenu.run(command);
            }
        };
    }
}
