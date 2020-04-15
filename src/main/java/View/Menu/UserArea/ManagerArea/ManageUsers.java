package View.Menu.UserArea.ManagerArea;

import Controller.ManagerAreaController;
import View.Menu.Menu;
import View.View;

import java.util.HashMap;

public class ManageUsers extends Menu {

    public ManageUsers(Menu parentMenu) {
        super("Manage Users", parentMenu);
        HashMap<String, Menu> subMenus = new HashMap<>();
        subMenus.put("View Users", getView());
        subMenus.put("Delete User", getDeleteUser());
        subMenus.put("Change User Type", getChangeUserType());
        subMenus.put("Create Manager Profile", getCreateManagerProfile());
        this.setSubMenus(subMenus);
    }

    @Override
    public String getCommandKey(String command) {
        return null;
    }

    private Menu getView() {
        return new Menu("View", this) {
            @Override
            public void run(String lastCommand) {
                controller.hasUserWithUsername(lastCommand);
                ManagerAreaController.viewUser("");
                View.printString("");
            }
        };
    }

    private Menu getDeleteUser() {
        return new Menu("Delete User", this) {
            @Override
            public void run(String lastCommand) {
                ManagerAreaController.deleteUser(lastCommand);
                this.parentMenu.run("");
            }
        };
    }

    private Menu getChangeUserType() {
        return new Menu("Change User Type", this) {
            @Override
            public void run(String lastCommand) {
                ManagerAreaController.changeUserType("", "");
                this.parentMenu.run("");
            }
        };
    }

    private Menu getCreateManagerProfile() {
        return new Menu("Create Manager Profile", this) {
            @Override
            public void run(String lastCommand) {
                ManagerAreaController.createManagerProfile(new String[3]);
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
