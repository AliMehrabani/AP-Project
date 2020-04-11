package Models.User;

import Models.Log.SellLog;
import Models.Off;
import Models.Product;

import java.util.ArrayList;

public class Seller extends User {
    private ArrayList<SellLog> sellHistory;
    private ArrayList<Product> productsForSale;
    private ArrayList<Off> offs;

    public Seller(String username, String firstName, String lastName, String eMail, long phoneNumber, String password) {
        super(username, firstName, lastName, eMail, phoneNumber, password);
        this.sellHistory = new ArrayList<>();
        this.productsForSale = new ArrayList<>();
        this.offs = new ArrayList<>();
    }

    @Override
    public String getType() {
        return "Seller";
    }
}
