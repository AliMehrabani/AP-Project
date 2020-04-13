package View.Menu.UserArea.ManagerArea;

import View.Menu.Menu;

public class ManageCategories extends Menu {

    public ManageCategories(Menu parentMenu) {
        super("Manage Categories", parentMenu);
    }

    private void doEditCategory(String command) {
        controller.editCategory("");
    }

    private void doAddCategory(String command) {
        controller.addCategory("");
    }

    private void showCategories() {

    }

    @Override
    public void run(String lastCommand) {
        this.showCategories();
        String command = scanner.nextLine().trim();
        if (command.startsWith("remove")) {
            controller.removeCategory("");
            this.run("");
        }
        if (command.startsWith("add")) {
            this.doAddCategory(command);
            this.run("");
        }
        if (command.startsWith("edit")) {
            this.doEditCategory(command);
            this.run("");
        }
        if (command.equals("back")){
            this.parentMenu.run("");
        }
    }
}
