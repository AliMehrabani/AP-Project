package View.Menu.OffsAndProductsMenu;

import Controller.OffAndProductMenuController;
import View.Menu.Menu;
import View.View;

public class Filtering extends Menu {
    public Filtering(Menu parentMenu) {
        super("Filtering", parentMenu);
    }

    @Override
    public void run(String lastCommand) {
        String command = scanner.nextLine().trim();
        if (command.equals("show available filters")) {
            View.printAvailableFilters(OffAndProductMenuController.getAllAvailableFilters());

            this.run(lastCommand);
        }
        if (command.equals("filter [an available filter]")) {
            OffAndProductMenuController.filtering(command.split("\\s")[1]);
            //in ye aray liste moratab mide bayad bazesh konam.
            View.printFilterdProduct(OffAndProductMenuController.getCurrentId(),
                    OffAndProductMenuController.getCurentName(),
                    OffAndProductMenuController.getCurrentPrice(),
                    OffAndProductMenuController.getCurrentOffPercentage(),
                    OffAndProductMenuController.doesCurrentOff());

            this.run(lastCommand);
        }
        if (command.equals("current filters")) {
            View.printCurrentFilter(OffAndProductMenuController.getCurrentFilter());

            this.run(lastCommand);
        }
        if (command.equals("disable filter [a selected filter]")) {
            OffAndProductMenuController.disableFilter(command.split("\\s")[1]);

            View.printFilterdProduct(OffAndProductMenuController.getCurrentId(),
                    OffAndProductMenuController.getCurentName(),
                    OffAndProductMenuController.getCurrentPrice(),
                    OffAndProductMenuController.getCurrentOffPercentage(),
                    OffAndProductMenuController.doesCurrentOff());
            this.run(lastCommand);
        }
        if (command.equals("back")) {
            this.parentMenu.run(lastCommand);
        }
    }
}
