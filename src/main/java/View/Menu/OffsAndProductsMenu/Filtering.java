package View.Menu.OffsAndProductsMenu;

import View.Menu.Menu;
import View.View;

public class Filtering extends Menu {
    public Filtering(String name, Menu parentMenu) {
        super(name, parentMenu);
    }

    @Override
    public String getCommandKey(String command) {
        return null;
    }

    @Override
    public void run(String command) {
        String input = scanner.nextLine();
        if (input.equals("show available filters")) {
            View.printAvailableFilters(controller.getAllAvailableFilters());
            this.run(command);
        }
        if (input.equals("filter [an available filter]")) {
            View.printFilterdProduct(controller.filtering(input.split("\\s")[1]));
            this.run(command);
        }
        if (input.equals("current filters")) {
            View.printCurrentFilter(controller.getCurrentFilter());
            this.run(command);
        }
        if (input.equals("disable filter [a selected filter]")) {
            controller.disableFilter(input.split("\\s")[1]);
            //bayad badesh neshon bedam?
            this.run(command);
        }
        if (input.equals("back")) {
            this.parentMenu.run(command);
        }
    }
}
