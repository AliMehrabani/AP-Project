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
    public String getCommandKey(String command) {
        return null;
    }

    @Override
    public void run(String command) {
        long productId = Long.parseLong(command.split("\\s")[2]);
        String input = scanner.nextLine();
        if (input.equals("digest")) {
            View.printProductSummery(controller.getProductById(productId));
            this.run(command);
        }
        if (input.equals("attributes")) {
            View.printAttributes(controller.getProductById(productId));
            this.run(command);
        }
        if (input.equals("compare [productID]")) {
            View.printCompareProduct(controller.getProductById(productId), controller.getProductById(Long.parseLong(input.split("\\s")[2])));
            this.run(command);
        }
        if (input.equals("Comments")) {
            new Comments("Comments", this);
            this.run(command);
        }
        if (input.equals("back")) {
            this.parentMenu.run(command);
        }
    }
}
