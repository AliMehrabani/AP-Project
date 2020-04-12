package View.Menu.UserArea.ManagerArea;

import View.Menu.Menu;

public class ManageCategories extends Menu {

    public ManageCategories(Menu parentMenu) {
        super("Manage Categories", parentMenu);
    }

    @Override
    public String getCommandKey(String command) {
        return null;
    }

    private Menu getEditCategory() {
        return new Menu("Edit Category", this) {
            @Override
            public String getCommandKey(String command) {
                return null;
            }

            @Override
            public void run(String lastCommand) {
                controller.editCategory("");
            }
        };
    }

    private Menu getAddCategory() {
        return new Menu("Add Category", this) {
            @Override
            public String getCommandKey(String command) {
                return null;
            }

            @Override
            public void run(String lastCommand) {
                controller.addCategory("");
            }
        };
    }

    private Menu getRemoveCategory() {
        return new Menu("Remove Category", this) {
            @Override
            public String getCommandKey(String command) {
                return null;
            }

            @Override
            public void run(String lastCommand) {
                controller.removeCategory("");
            }
        };
    }

    private void showCategories() {

    }

    @Override
    public void run(String lastCommand) {
        this.showCategories();
        super.run(lastCommand);
    }
}
