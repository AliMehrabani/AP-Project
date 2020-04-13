package View.Menu.OffsAndProductsMenu;

import View.Menu.Menu;

import java.util.HashMap;

public class OffsPage extends Menu {
    private long productId;

    public OffsPage(Menu parentMenu) {
        super("Offs", parentMenu);
        HashMap<String, Menu> subMenus = new HashMap<String, Menu>();
        subMenus.put("Show All Of Products", new ShowOffProducts("Show All Of Products", this));
        subMenus.put("Show Categories", new ShowCategories("Show Categories", this));
        subMenus.put("Filtering", new Filtering("Filtering", this));
        subMenus.put("Sorting", new Sorting("Sorting", this));
        subMenus.put("Show Product", new ShowProduct("Show Product", this));
        new ShowAllProducts("Show All Product", this);
        //bara show Product bayad havasam bashe commond ba id pass bedam
        this.setSubMenus(subMenus);
    }

    @Override
    public String getCommandKey(String command) {
        return super.getCommandKey(command);
    }
}
