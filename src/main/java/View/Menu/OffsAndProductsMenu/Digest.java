package View.Menu.OffsAndProductsMenu;

import Controller.Controller;
import Models.Product;
import View.Menu.Menu;

public class Digest extends Menu {
    Product product;
    public Digest(String name, Menu parentMenu, Product product) {
        super(name, parentMenu);
        this.product=product;
    }

    @Override
    public String getCommandKey(String command) {
        return null;
    }

    @Override
    public void run(String command) {
        long productId=Long.parseLong(command.split("\\s")[2]);
        String input=scanner.nextLine();
        if (input.equals("add to cart")){
            //get type konam bad az ali bebinam ke karbare ya ne
            Controller.addToCart(Controller.getProductById(productId));
            this.run(command);
        }
        if (input.equals("select seller [seller_username]")){

        }
    }
}
