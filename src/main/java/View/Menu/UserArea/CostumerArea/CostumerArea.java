package View.Menu.UserArea.CostumerArea;

import View.Menu.Menu;

public class CostumerArea extends Menu {

    public CostumerArea(Menu parentMenu) {
        super("Costumer Area", parentMenu);
    }

    @Override
    public String getCommandKey(String command) {
        return null;
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
