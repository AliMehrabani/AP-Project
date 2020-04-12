package Models;

import Models.User.Costumer;
import java.util.ArrayList;
import java.util.Date;

public class DiscountCode {
    private String DiscountId;
    private Date startDate;
    private Date endDate;
    private int discountPercent;
    private long maximumDiscountAmount;
    private int discountCount;
    private ArrayList<Costumer> allowedConsumers = new ArrayList<Costumer>();

    public DiscountCode(String discountId, Date startDate, Date endDate, int discountPercent, long maximumDiscountAmount, int discountCount, ArrayList<Costumer> allowedConsumers) {
        DiscountId = discountId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.discountPercent = discountPercent;
        this.maximumDiscountAmount = maximumDiscountAmount;
        this.discountCount = discountCount;
        this.allowedConsumers = allowedConsumers;
    }
}
