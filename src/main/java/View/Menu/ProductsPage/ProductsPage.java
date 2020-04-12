package View.Menu.ProductsPage;

import View.Menu.Menu;

public class ProductsPage extends Menu {
    public ProductsPage(Menu parentMenu) {
        super("Products Page", parentMenu);
    }

    @Override
    public String getCommandKey(String command) {
        return null;
    }
}
