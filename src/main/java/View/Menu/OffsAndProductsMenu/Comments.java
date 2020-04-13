package View.Menu.OffsAndProductsMenu;

import Models.Product;
import View.Menu.Menu;

public class Comments extends Menu {
    private Product product;

    public Comments(String name, Menu parentMenu) {
        super(name, parentMenu);
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
            controller.addComments(product, title, content);
            this.parentMenu.run(lastCommand);
        }
        if (command.equals("back")) {
            this.parentMenu.run(lastCommand);
        }
        //agar invalid bood chi?
    }
}
