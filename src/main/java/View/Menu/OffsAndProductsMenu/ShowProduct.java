package View.Menu.OffsAndProductsMenu;

import Controller.Controller;
import View.Menu.Menu;
import View.View;

import java.util.HashMap;
// bad az alireza bayad in ke chan bar baz shode har kala ro to controller ezafe konam.
public class ShowProduct extends Menu {
    private long productId;
    public ShowProduct(String name, Menu parentMenu,long productId) {
        super(name, parentMenu);
        this.productId=productId;
        HashMap<String, Menu> subMenus = new HashMap<String, Menu>();
        subMenus.put("Digest",new Digest("Digest",this,Controller.getProductById(productId)));
        this.setSubMenus(subMenus);
    }

    @Override
    public String getCommandKey(String command) {
        return null;
    }

    @Override
    public void run(String command) {
        String input=scanner.nextLine();
        if (input.equals("digest")){
            View.printProductSummery(Controller.getProductById(productId));
            this.run(command);
        }
    }
}
