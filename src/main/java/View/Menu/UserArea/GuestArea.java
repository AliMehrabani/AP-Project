package View.Menu.UserArea;

import View.Menu.Menu;
import View.View;

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

            @Override
            public void run() {
                controller.hasUserWithUsername("");
                View.printString(controller.loginAccount("", ""));
                this.parentMenu.run();
            }
        };
    }

    private Menu getRegisterMenu() {
        return new Menu("Sign Up Menu", this) {
            @Override
            public String getCommandKey(String command) {
                return null;
            }

            @Override
            public void run() {
                controller.hasUserWithUsername("");
                View.printString(controller.createAccount(new String[3]));
                this.parentMenu.run();
            }
        };
    }

    @Override
    public String getCommandKey(String command) {
        return null;
    }
}
