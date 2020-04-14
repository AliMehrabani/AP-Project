package View.Menu.OffsAndProductsMenu;

import View.Menu.Menu;
import View.View;

public class ShowCategories extends Menu {
    public ShowCategories(Menu parentMenu) {
        super("Show Categories", parentMenu);
    }

    @Override
    public void run(String lastCommand) {
        View.printCategories(controller.getAllCategory());
        //az OffAndProductMenuController ham mishe gereft
        this.parentMenu.run(lastCommand);
    }

}
