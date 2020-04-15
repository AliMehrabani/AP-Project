package View.Menu.UserArea;

import View.Menu.Menu;
import View.View;

import java.util.HashMap;

public class GuestArea extends Menu {

    public GuestArea(Menu parentMenu) {
        super("Guest Area", parentMenu);
    }

    @Override
    public String getCommandKey(String command) {
        return null;
    }
}
