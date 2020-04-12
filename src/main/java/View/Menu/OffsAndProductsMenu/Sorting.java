package View.Menu.OffsAndProductsMenu;

import Controller.Controller;
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
        String input=scanner.nextLine();
        if (input.equals("show available sorts")){
            View.printAvailableSorting(Controller.getAllAvailableSorting());
            this.run(command);
        }
        if (input.equals("sort [an available sort]")){
            //Alireza
            this.run(command);
        }
        if (input.equals("current sort")){
            //Alireza
            this.run(command);
        }
        if (input.equals("disable sort")){
            //ALireza
            this.run(command);
        }
        if (input.equals("back")){
            this.parentMenu.run(command);
        }
    }
}
