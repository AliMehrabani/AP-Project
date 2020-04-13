package View.Menu.OffsAndProductsMenu;

import View.Menu.Menu;
import View.View;

public class Sorting extends Menu {

    public Sorting(String name, Menu parentMenu) {
        super(name, parentMenu);
    }

    @Override
    public String getCommandKey(String command) {
        return null;
    }

    @Override
    public void run(String command) {
        String input = scanner.nextLine();
        if (input.equals("show available sorts")) {
            View.printAvailableSorting(controller.getAllAvailableSorting());
            this.run(command);
        }
        if (input.equals("sort [an available sort]")) {
            View.printSortedProduct(controller.sorting(input.split("\\s")[1]));
            this.run(command);
        }
        if (input.equals("current sort")) {
            View.printCurrnetSort(controller.getCurrntSort());
            this.run(command);
        }
        if (input.equals("disable sort")) {
            controller.disableSort(input.split("\\s")[2]);
            //bayad havasam bashe chi ro disable mikonam
            //bayad neshom bedam?
            this.run(command);
        }
        if (input.equals("back")) {
            this.parentMenu.run(command);
        }
    }
}
