package View.Menu.UserArea;

import View.Menu.Menu;

public class ViewPersonalInfo extends Menu {

    public ViewPersonalInfo(Menu parentMenu) {
        super("View Personal Info", parentMenu);
    }

    @Override
    public String getCommandKey(String command) {
        return null;
    }

    private Menu getEdit() {
        return new Menu("Edit", this) {
            @Override
            public String getCommandKey(String command) {
                return null;
            }

            @Override
            public void run(String lastCommand) {
                controller.editField("", "");
            }
        };
    }

    private void showPersonalInfo() {

    }

    @Override
    public void run(String lastCommand) {
        this.showPersonalInfo();
        super.run(lastCommand);
    }
}
