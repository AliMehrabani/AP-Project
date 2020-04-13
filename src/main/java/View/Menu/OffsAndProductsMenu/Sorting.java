package View.Menu.OffsAndProductsMenu;

import View.Menu.Menu;
import View.View;

public class Sorting extends Menu {

    public Sorting(Menu parentMenu) {
        super("Sorting", parentMenu);
    }

    @Override
    public String getCommandKey(String command) {
        return null;
    }

    @Override
    public void run(String lastCommand) {
        String command = scanner.nextLine().trim();
        if (command.equals("show available sorts")) {
            View.printAvailableSorting(controller.getAllAvailableSorting());
            this.run(lastCommand);
        }
        if (command.equals("sort [an available sort]")) {
            View.printSortedProduct(controller.sorting(command.split("\\s")[1]));
            this.run(lastCommand);
        }
        if (command.equals("current sort")) {
            View.printCurrnetSort(controller.getCurrentSort());
            this.run(lastCommand);
        }
        if (command.equals("disable sort")) {
            controller.disableSort(command.split("\\s")[2]);
            //bayad havasam bashe chi ro disable mikonam
            //bayad neshom bedam?
            this.run(lastCommand);
        }
        if (command.equals("back")) {
            this.parentMenu.run(lastCommand);
        }
    }
}
