package View.Menu.UserArea;

import View.Menu.Menu;

public class GuestArea extends Menu {

    public GuestArea(Menu parentMenu) {
        super("Guest Area", parentMenu);
    }

    private Menu getLoginMenu() {
        return new Menu("Login Menu", this) {
            @Override
            public String getCommandKey(String command) {
                return null;
            }
        };
    }

    private Menu getSignUpMenu() {
        return new Menu("Sign Up Menu", this) {
            @Override
            public String getCommandKey(String command) {
                return null;
            }
        };
    }

    @Override
    public String getCommandKey(String command) {
        return null;
    }
}
