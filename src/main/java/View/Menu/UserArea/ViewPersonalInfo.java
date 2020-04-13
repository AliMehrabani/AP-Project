package View.Menu.UserArea;

import View.Menu.Menu;

public class ViewPersonalInfo extends Menu {

    public ViewPersonalInfo(Menu parentMenu) {
        super("View Personal Info", parentMenu);
    }

    private void showPersonalInfo() {

    }

    @Override
    public void run(String lastCommand) {
        this.showPersonalInfo();
        if (lastCommand.startsWith("edit")) {
            controller.editField("", "");
            this.run("");
        }
        if (lastCommand.equals("back")) {
            this.parentMenu.run("");
        }
    }
}
