package View.Menu.OffsAndProductsMenu;

import Controller.Controller;
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
        String input=scanner.nextLine();
        if (input.equals("show available filters")) {
            View.printAvailableFilters(Controller.getAllAvailableFilters());
            this.run(command);
        }
        if (input.equals("filter [an available filter]")){
            //Alireza tabee ro neveshte.
            this.run(command);
        }
        if (input.equals("current filters")){
            //Alireza check konam nahash.
            this.run(command);
        }
        if (input.equals("disable filter [a selected filter]")){
            //Alireza bayad okey kone
            this.run(command);
        }
        if (input.equals("back")){
            this.parentMenu.run(command);
        }
    }
}
