package View.Menu.OffsAndProductsMenu;

import View.Menu.Menu;
import View.View;

public class Filtering extends Menu {
    public Filtering(String name, Menu parentMenu) {
        super(name, parentMenu);
    }

    @Override
    public void run(String lastCommand) {
        String command = scanner.nextLine().trim();
        if (command.equals("show available filters")) {
            View.printAvailableFilters(controller.getAllAvailableFilters());
            this.run(lastCommand);
        }
        if (command.equals("filter [an available filter]")) {
            View.printFilterdProduct(controller.filtering(command.split("\\s")[1]));
            this.run(lastCommand);
        }
        if (command.equals("current filters")) {
            View.printCurrentFilter(controller.getCurrentFilter());
            this.run(lastCommand);
        }
        if (command.equals("disable filter [a selected filter]")) {
            controller.disableFilter(command.split("\\s")[1]);
            //bayad badesh neshon bedam?
            this.run(lastCommand);
        }
        if (command.equals("back")) {
            this.parentMenu.run(lastCommand);
        }
    }
}
