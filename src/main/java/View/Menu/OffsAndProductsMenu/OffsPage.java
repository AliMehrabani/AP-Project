package View.Menu.OffsAndProductsMenu;

import View.Menu.Menu;

import java.util.HashMap;

public class OffsPage extends Menu {
    private long productId;

    public OffsPage(Menu parentMenu) {
        super("Offs", parentMenu);
        HashMap<String, Menu> subMenus = new HashMap<String, Menu>();
        subMenus.put("Show All Of Products", new ShowOffProducts(this));
        subMenus.put("Show Categories", new ShowCategories(this));
        subMenus.put("Filtering", new Filtering(this));
        subMenus.put("Sorting", new Sorting(this));
        subMenus.put("Show Product", new ShowProduct(this));
        new ShowAllProducts(this);
        //bara show Product bayad havasam bashe commond ba id pass bedam
        this.setSubMenus(subMenus);
    }

    @Override
    public String getCommandKey(String command) {
        return super.getCommandKey(command);
    }
}
