package View.Menu.UserArea;

import View.Menu.Menu;

public class UserArea extends Menu {
    public UserArea(Menu parentMenu) {
        super("User Area", parentMenu);
    }

    @Override
    public String getCommandKey(String command) {
        return null;
    }
}