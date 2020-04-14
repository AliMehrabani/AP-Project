package View.Menu.UserArea.SellerArea;

import View.Menu.Menu;

import java.util.HashMap;

public class ViewOffs extends Menu {
    public ViewOffs(Menu parentMenu) {
        super("View Offs", parentMenu);
        HashMap<String, Menu> subMenus = new HashMap<>();
        subMenus.put("View Off", getView());
        subMenus.put("Add Off", getAddOff());
        subMenus.put("Edit Off", getEditOff());
        this.setSubMenus(subMenus);
    }

    @Override
    public String getCommandKey(String command) {
        return super.getCommandKey(command);
    }

    private Menu getView() {
        return new Menu("View Off", this) {
            @Override
            public void run(String lastCommand) {
                controller.viewOff(1);
            }
        };
    }

    private Menu getEditOff() {
        return new Menu("Edit Off", this) {
            @Override
            public void run(String lastCommand) {
                controller.editOff("", "", 1);
                this.parentMenu.run("");
            }
        };
    }

    private Menu getAddOff() {
        return new Menu("Add Off", this) {
            @Override
            public void run(String lastCommand) {
                controller.addOff(new String[3]);
                this.parentMenu.run("");
            }
        };
    }

    private void showOffs(){

    }

    @Override
    public void run(String lastCommand) {
        this.showOffs();
        super.run(lastCommand);
    }
}
