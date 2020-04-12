package View.Menu.OffsAndProductsMenu;

import Controller.Controller;
import View.Menu.Menu;
import View.View;

public class ShowAllProducts extends Menu {
    public ShowAllProducts(String name, Menu parentMenu) {
        super(name, parentMenu);
    }

    @Override
    public String getCommandKey(String command) {
        return null;
    }

    @Override
    public void run(String command) {
        View.printAllProduct(Controller.getAllProduct(false));
        this.parentMenu.run(command);
    }
}
