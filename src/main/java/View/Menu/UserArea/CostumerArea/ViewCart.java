package View.Menu.UserArea.CostumerArea;

import View.Menu.Menu;
import View.Menu.OffsAndProductsMenu.ShowProduct;

import java.util.HashMap;

public class ViewCart extends Menu {

    public ViewCart(Menu parentMenu) {
        super("View Cart", parentMenu);
        HashMap<String, Menu> subMenus = new HashMap<>();
        subMenus.put("Show Products", getShowProducts());
        subMenus.put("Increase Product", getIncreaseProduct());
        subMenus.put("Decrease Product", getDecreaseProduct());
        subMenus.put("Show Total Price", getShowTotalPrice());
        subMenus.put("Purchase", new Purchase(this));
        subMenus.put("Show Product", new ShowProduct(this));
        this.setSubMenus(subMenus);
    }

    @Override
    public String getCommandKey(String command) {
        return super.getCommandKey(command);
    }

    private Menu getShowProducts() {
        return new Menu("Show Products", this) {
            @Override
            public void run(String lastCommand) {
                controller.showProducts();
                this.parentMenu.run("");
            }
        };
    }

    private Menu getIncreaseProduct() {
        return new Menu("Increase Product", this) {
            @Override
            public void run(String lastCommand) {
                controller.addToCart(null);
                this.parentMenu.run("");
            }
        };
    }

    private Menu getDecreaseProduct() {
        return new Menu("Decrease Product", this) {
            @Override
            public void run(String lastCommand) {
                controller.removeFromCart(1);
                this.parentMenu.run("");
            }
        };
    }

    private Menu getShowTotalPrice() {
        return new Menu("Show Total Price", this) {
            @Override
            public void run(String lastCommand) {
                controller.getTotalPrice();
                this.parentMenu.run("");
            }
        };
    }
}
