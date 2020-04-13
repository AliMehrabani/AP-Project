package View.Menu.OffsAndProductsMenu;

import View.Menu.Menu;
import View.View;

public class ShowOffProducts extends Menu {
    public ShowOffProducts(Menu parentMenu) {
        super("Show Off Products", parentMenu);
    }

    @Override
    public void run(String lastCommand) {
        View.printAllOffProduct(controller.getAllOffProduct());
        this.parentMenu.run(lastCommand);
    }
}
