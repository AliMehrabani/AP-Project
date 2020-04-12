package View.Menu.UserArea.ManagerArea;

import View.Menu.Menu;

public class ManagerArea extends Menu {

    public ManagerArea(Menu parentMenu) {
        super("Manager Area", parentMenu);
    }

    @Override
    public String getCommandKey(String command) {
        return null;
    }

    public void showSpecifications() {
        controller.getCurrentUser();
    }

    @Override
    public void run() {
        this.showSpecifications();
        super.run();
    }
}