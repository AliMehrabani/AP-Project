package Models.Log;

import Models.Product;

import java.util.ArrayList;
import java.util.Date;

public class SellLog extends Log {
    private double receivedAmount;
    private double reducedAmountForSale;
    private ArrayList<Product> soldProduct = new ArrayList<Product>();
    private String buyerName;
    private DeliveryStatus deliveryStatus;

    public SellLog(double receivedAmount, double reducedAmountForSale, ArrayList<Product> soldProduct,
                   String buyerName, DeliveryStatus deliveryStatus, long logId, Date logDate) {
        this.receivedAmount = receivedAmount;
        this.reducedAmountForSale = reducedAmountForSale;
        this.soldProduct = soldProduct;
        this.buyerName = buyerName;
        this.deliveryStatus = deliveryStatus;
        this.logId = logId;
        this.logDate = logDate;
    }
}
