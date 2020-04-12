package View.Menu.UserArea.ManagerArea;

import View.Menu.Menu;
import View.View;

public class ManageUsers extends Menu {

    public ManageUsers(String name, Menu parentMenu) {
        super(name, parentMenu);
    }

    @Override
    public String getCommandKey(String command) {
        return null;
    }

    private Menu getView() {
        return new Menu("View", this) {
            @Override
            public String getCommandKey(String command) {
                return null;
            }

            @Override
            public void run(String lastCommand) {
                controller.hasUserWithUsername(lastCommand);
                controller.viewUser("");
                View.printString("");
            }
        };
    }

    private Menu getDeleteUser() {
        return new Menu("Delete User", this) {
            @Override
            public String getCommandKey(String command) {
                return null;
            }

            @Override
            public void run(String lastCommand) {
                
            }
        };
    }

    private void showUsers() {

    }

    @Override
    public void run(String lastCommand) {
        this.showUsers();
        super.run(lastCommand);
    }
}
