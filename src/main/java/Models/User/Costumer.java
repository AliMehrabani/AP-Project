package Models.User;

import Models.Log.BuyLog;
import Models.Product;

import java.util.ArrayList;
import java.util.HashMap;

public class Costumer extends User {
    private HashMap<Product, Integer> cart;
    private ArrayList<BuyLog> buyHistory;
    private double credit;

    public Costumer(String username, String firstName, String lastName, String eMail, long phoneNumber, String password) {
        super(username, firstName, lastName, eMail, phoneNumber, password);
        this.cart = new HashMap<>();
        this.buyHistory = new ArrayList<>();
        this.credit = 0;
    }

    @Override
    public String getType() {
        return "Consumer";
    }
}
