package View.Menu.OffsAndProductsMenu;

import View.Menu.Menu;

import java.util.HashMap;

public class ProductsPage extends Menu {

    public ProductsPage(Menu parentMenu) {
        super("Products Page", parentMenu);
        HashMap<String, Menu> subMenus = new HashMap<String, Menu>();
        subMenus.put("Show All Product", new ShowAllProducts("Show All Product", this));
        subMenus.put("Show Categories", new ShowCategories("Show Categories", this));
        subMenus.put("Filtering", new Filtering("Filtering", this));
        subMenus.put("Sotring", new Sorting("Sorting", this));
        subMenus.put("Show Product", new ShowProduct("Show Product", this));
        //bara show Product bayad havasam bashe commond ba id pass bedam
        this.setSubMenus(subMenus);
    }

    @Override
    public String getCommandKey(String command) {
        return null;
    }
}