package View.Menu.OffsAndProductsMenu;

import Controller.OffAndProductMenuController;
import Models.Product;
import View.Menu.Menu;

public class Comments extends Menu {
    private Product product;

    public Comments(Menu parentMenu, long productId) {
        super("Comments", parentMenu);
        product = controller.getProductById(productId);
    }

    @Override
    public void run(String lastCommand) {
        String command = scanner.nextLine().trim();
        String title;
        String content;
        if (command.equals("Add comment")) {
            System.out.println("Title:");
            title = scanner.nextLine();
            System.out.println("Content:");
            content = scanner.nextLine();
            OffAndProductMenuController.addComments(product, title, content);
            this.parentMenu.run(lastCommand);
        }
        if (command.equals("back")) {
            this.parentMenu.run(lastCommand);
        }
        //agar invalid bood chi?
    }
}
