package View.Menu.OffsAndProductsMenu;

import Controller.Controller;
import View.Menu.Menu;
import View.View;

import java.util.HashMap;

// bad az alireza bayad in ke chan bar baz shode har kala ro to controller ezafe konam.
public class ShowProduct extends Menu {

    public ShowProduct(String name, Menu parentMenu) {
        super(name, parentMenu);
        HashMap<String, Menu> subMenus = new HashMap<String, Menu>();
        subMenus.put("Digest", new Digest("Digest", this));
        subMenus.put("Comments", new Comments("Comments", this));
        this.setSubMenus(subMenus);
    }

    @Override
    public void run(String lastCommand) {
        long productId = Long.parseLong(lastCommand.split("\\s")[2]);
        String command = scanner.nextLine().trim();
        if (command.equals("digest")) {
            View.printProductSummery(controller.getProductById(productId));
            this.run(lastCommand);
        }
        if (command.equals("attributes")) {
            View.printAttributes(controller.getProductById(productId));
            this.run(lastCommand);
        }
        if (command.equals("compare [productID]")) {
            View.printCompareProduct(controller.getProductById(productId), controller.getProductById(Long.parseLong(command.split("\\s")[2])));
            this.run(lastCommand);
        }
        if (command.equals("Comments")) {
            new Comments("Comments", this);
            this.run(lastCommand);
        }
        if (command.equals("back")) {
            this.parentMenu.run(lastCommand);
        }
    }
}
