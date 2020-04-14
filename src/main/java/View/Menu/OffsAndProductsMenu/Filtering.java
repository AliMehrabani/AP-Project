package View.Menu.OffsAndProductsMenu;

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
            View.printAvailableFilters(controller.getAllAvailableFilters());
            //az OffAndProductMenuController ham mishe gereft

            this.run(lastCommand);
        }
        if (command.equals("filter [an available filter]")) {
            View.printFilterdProduct(controller.filtering(command.split("\\s")[1]));
            //az OffAndProductMenuController ham mishe gereft

            this.run(lastCommand);
        }
        if (command.equals("current filters")) {
            View.printCurrentFilter(controller.getCurrentFilter());
            //az OffAndProductMenuController ham mishe gereft

            this.run(lastCommand);
        }
        if (command.equals("disable filter [a selected filter]")) {
            controller.disableFilter(command.split("\\s")[1]);
            //az OffAndProductMenuController ham mishe gereft

            //bayad badesh neshon bedam?
            this.run(lastCommand);
        }
        if (command.equals("back")) {
            this.parentMenu.run(lastCommand);
        }
    }
}
