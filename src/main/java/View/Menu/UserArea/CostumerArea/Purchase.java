package View.Menu.UserArea.CostumerArea;

import View.Menu.Menu;

public class Purchase extends Menu {

    public Purchase(Menu parentMenu) {
        super("Purchase", parentMenu);
    }

    private void getReceiverInformation() {

    }

    private void getDiscountCode() {

    }

    private void doPayment() {

    }

    @Override
    public void run(String lastCommand) {
        this.getReceiverInformation();
        this.getDiscountCode();
        this.doPayment();
        this.parentMenu.run("");
    }
}
