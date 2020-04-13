package View.Menu.OffsAndProductsMenu;

import Models.Product;
import View.Menu.Menu;
import View.Menu.UserArea.GuestArea;

public class Digest extends Menu {

    public Digest(String name, Menu parentMenu) {
        super(name, parentMenu);
    }

    @Override
    public void run(String lastCommand) {
        long productId = Long.parseLong(lastCommand.split("\\s")[2]);
        String command = scanner.nextLine().trim();
        if (command.equals("add to cart")) {
            String type=controller.getCurrentUserType();
            if (type.equals("Geust")){
                new GuestArea(this);
            }
            //havasam bashe ke Guest ham mitone sabad dashte bashe.
            controller.addToCart(controller.getProductById(productId));
            this.run(lastCommand);
        }
        if (command.equals("select seller [seller_username]")) {
            //che konam?
            this.run(lastCommand);
        }
        if (command.equals("back")) {
            this.parentMenu.run(lastCommand);
        }
    }
}
