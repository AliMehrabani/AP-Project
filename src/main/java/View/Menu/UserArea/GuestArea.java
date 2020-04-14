package View.Menu.UserArea;

import View.Menu.Menu;
import View.View;

import java.util.HashMap;

public class GuestArea extends Menu {

    public GuestArea(Menu parentMenu) {
        super("Guest Area", parentMenu);
        HashMap<String, Menu> subMenus = new HashMap<>();
        subMenus.put("Login Menu", getLoginMenu());
        subMenus.put("Register Menu", getRegisterMenu());
        this.setSubMenus(subMenus);
    }

    private Menu getLoginMenu() {
        return new Menu("Login Menu", this) {
            @Override
            public void run(String lastCommand) {
                controller.hasUserWithUsername("");
                controller.isPasswordCorrect("");
                View.printString(controller.loginAccount("", ""));
                this.parentMenu.run(lastCommand);
            }
        };
    }

    private Menu getRegisterMenu() {
        return new Menu("Sign Up Menu", this) {
            @Override
            public void run(String lastCommand) {
                controller.hasUserWithUsername("");
                View.printString(controller.createAccount(new String[3]));
                this.parentMenu.run(lastCommand);
            }
        };
    }

    @Override
    public String getCommandKey(String command) {
        return null;
    }
}
