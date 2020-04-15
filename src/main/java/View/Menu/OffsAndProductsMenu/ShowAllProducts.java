package View.Menu.OffsAndProductsMenu;

import Controller.OffAndProductMenuController;
import View.Menu.Menu;
import View.View;

public class ShowAllProducts extends Menu {
    public ShowAllProducts(Menu parentMenu) {
        super("Show All Products", parentMenu);
    }

    @Override
    public void run(String lastCommand) {
        View.printAllProduct(OffAndProductMenuController.getId(),
                OffAndProductMenuController.getName(),
                OffAndProductMenuController.getPrice(),
                OffAndProductMenuController.getOffPercentage(),
                OffAndProductMenuController.doesItOff());
        this.parentMenu.run(lastCommand);
    }
}
