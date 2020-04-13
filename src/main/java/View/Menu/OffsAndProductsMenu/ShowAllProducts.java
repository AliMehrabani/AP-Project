package View.Menu.OffsAndProductsMenu;

import View.Menu.Menu;
import View.View;

public class ShowAllProducts extends Menu {
    public ShowAllProducts(Menu parentMenu) {
        super("Show All Products", parentMenu);
    }

    @Override
    public void run(String lastCommand) {
        View.printAllProduct(controller.getAllProduct());
        this.parentMenu.run(lastCommand);
    }
}
