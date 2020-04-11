package Models.Log;

import Models.Product;

import java.util.ArrayList;
import java.util.Date;

public class BuyLog extends Log {
    private double paidAmount;
    private int saleCodeApplied;
    private ArrayList<Product> boughtProduct = new ArrayList<Product>();
    private String sellerName;
    private ReceiveStatus receiveStatus;

    public BuyLog(double paidAmount, int saleCodeApplied, ArrayList<Product> boughtProduct,
                  String sellerName, ReceiveStatus receiveStatus, long logId, Date logDate) {
        this.paidAmount = paidAmount;
        this.saleCodeApplied = saleCodeApplied;
        this.boughtProduct = boughtProduct;
        this.sellerName = sellerName;
        this.receiveStatus = receiveStatus;
        this.logId = logId;
        this.logDate = logDate;
    }
}
