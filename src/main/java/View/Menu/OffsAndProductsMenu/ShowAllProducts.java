package View.Menu.OffsAndProductsMenu;

import View.Menu.Menu;
import View.View;

public class ShowAllProducts extends Menu {
    public ShowAllProducts(String name, Menu parentMenu) {
        super(name, parentMenu);
    }

    @Override
    public void run(String lastCommand) {
        View.printAllProduct(controller.getAllProduct());
        this.parentMenu.run(lastCommand);
    }
}
