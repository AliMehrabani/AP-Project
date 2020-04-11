package Models;

import Models.OffStatus;

import java.util.ArrayList;
import java.util.Date;

public class Off {
    private long offId;
    private ArrayList<Product> products = new ArrayList<Product>();
    private OffStatus offStatus;
    private Date startDate;
    private Date endDate;
    private int offAmount;

    public Off(long offId, ArrayList<Product> products, OffStatus offStatus,
               Date startDate, Date endDate, int offAmount) {
        this.offId = offId;
        this.products = products;
        this.offStatus = offStatus;
        this.startDate = startDate;
        this.endDate = endDate;
        this.offAmount = offAmount;
    }
}
