package View.Menu.OffsAndProductsMenu;

import Controller.OffAndProductMenuController;
import View.Menu.Menu;
import View.View;

public class ShowOffProducts extends Menu {
    public ShowOffProducts(Menu parentMenu) {
        super("Show Off Products", parentMenu);
    }

    @Override
    public void run(String lastCommand) {
        View.printAllOffProduct(OffAndProductMenuController.getId(),
                                OffAndProductMenuController.getName(),
                                OffAndProductMenuController.getPrice(),
                                OffAndProductMenuController.getOffPercentage());
        this.parentMenu.run(lastCommand);
    }
}
