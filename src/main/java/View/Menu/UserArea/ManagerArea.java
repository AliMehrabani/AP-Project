package View.Menu.UserArea;

import View.Menu.Menu;

public class ManagerArea extends Menu {

    public ManagerArea(Menu parentMenu) {
        super("Manager Area", parentMenu);
    }

    @Override
    public String getCommandKey(String command) {
        return null;
    }
}
