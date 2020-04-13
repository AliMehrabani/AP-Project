package View.Menu.UserArea.ManagerArea;

import View.Menu.Menu;

public class ManagerArea extends Menu {

    public ManagerArea(Menu parentMenu) {
        super("Manager Area", parentMenu);
    }

    @Override
    public String getCommandKey(String command) {
        return null;
    }

    private Menu getCreateDiscountCode() {
        return new Menu("Create Discount Code", this) {
            @Override
            public void run(String lastCommand) {
                controller.createDiscountCode(new String[3]);
            }
        };
    }

    public void showSpecifications() {
        controller.getCurrentUser();
    }

    @Override
    public void run(String lastCommand) {
        this.showSpecifications();
        super.run(lastCommand);
    }
}