package View.Menu.OffsAndProductsMenu;

import View.Menu.Menu;
import View.View;

public class ShowCategories extends Menu {
    public ShowCategories(String name, Menu parentMenu) {
        super(name, parentMenu);
    }

    @Override
    public String getCommandKey(String command) {
        return null;
    }

    @Override
    public void run(String command) {
        View.printCategories(controller.getAllCategory());
        this.parentMenu.run(command);
    }

}
