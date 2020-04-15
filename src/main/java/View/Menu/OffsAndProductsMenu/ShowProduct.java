package View.Menu.OffsAndProductsMenu;

import Controller.Controller;
import Controller.OffAndProductMenuController;
import View.Menu.Menu;
import View.Menu.UserArea.UserArea;
import View.View;

import java.util.HashMap;

// bad az alireza bayad in ke chan bar baz shode har kala ro to controller ezafe konam.
public class ShowProduct extends Menu {

    public ShowProduct(Menu parentMenu) {
        super("Show product", parentMenu);
    }

    @Override
    public void run(String lastCommand) {
        long productId = Long.parseLong(lastCommand.split("\\s")[2]);
        String command = scanner.nextLine().trim();
        if (command.equals("digest")) {
            View.printProductSummery(Controller.getProductById(productId));
            //bayad havasm bashe ke controller bayad ye product jadid bi in pas bede

            new Digest(this);
            //bayad in line tarif beshe vali baraye tamizi in karo kardam

            this.run(lastCommand);
        }
        if (command.equals("attributes")) {
            View.printAttributes(Controller.getProductById(productId));
            //bayad havasm bashe ke controller bayad ye product jadid bi in pas bede

            this.run(lastCommand);
        }
        if (command.equals("compare [productID]")) {
            View.printCompareProduct(Controller.getProductById(productId), Controller.getProductById(Long.parseLong(command.split("\\s")[2])));
            //bayad havasm bashe ke controller bayad ye product jadid bi in pas bede

            this.run(lastCommand);
        }
        if (command.equals("Comments")) {
            new Comments(this,productId);
            this.run(lastCommand);
        }
        if (command.equals("log in")){
            new UserArea(this);
            this.run(lastCommand);
        }

        if (command.equals("log Out")){
            Controller.logout();
            this.run(lastCommand);
        }

        if (command.equals("back")) {
            this.parentMenu.run(lastCommand);
        }
    }
}
