package View.Menu.OffsAndProductsMenu;

import Models.Product;
import View.Menu.Menu;
import View.Menu.UserArea.GuestArea;

public class Digest extends Menu {

    public Digest(String name, Menu parentMenu) {
        super(name, parentMenu);
    }

    @Override
    public String getCommandKey(String command) {
        return null;
    }

    @Override
    public void run(String command) {
        long productId = Long.parseLong(command.split("\\s")[2]);
        String input = scanner.nextLine();
        if (input.equals("add to cart")) {
            String type=controller.getCurrentUserType();
            if (type.equals("Geust")){
                new GuestArea(this);
            }
            //havasam bashe ke Guest ham mitone sabad dashte bashe.
            controller.addToCart(controller.getProductById(productId));
            this.run(command);
        }
        if (input.equals("select seller [seller_username]")) {
            //che konam?
            this.run(command);
        }
        if (input.equals("back")) {
            this.parentMenu.run(command);
        }
    }
}
