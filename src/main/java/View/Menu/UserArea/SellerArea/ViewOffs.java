package View.Menu.UserArea.SellerArea;

import View.Menu.Menu;

public class ViewOffs extends Menu {
    public ViewOffs(Menu parentMenu) {
        super("View Offs", parentMenu);
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
