package Models.User;

import Models.DiscountCode;
import Models.User.Request.Request;

import java.util.ArrayList;

public class Manager extends User {
    private static ArrayList<Request> allActiveRequests = new ArrayList<>();
    private static ArrayList<DiscountCode> allDiscountCodes = new ArrayList<>();

    public Manager(String username, String firstName, String lastName, String eMail, long phoneNumber, String password) {
        super(username, firstName, lastName, eMail, phoneNumber, password);
    }

    public static void answerRequest(String answer, long requestID) {

    }

    public static Request getRequestByID(long ID) {
        return null;
    }

    public static DiscountCode getDiscountCodeByID(long ID) {
        return null;
    }

    public static void addDiscountCode(DiscountCode discountCode) {}

    public static void  editDiscountCode() {

    }

    public void addCategory(){}

    public void editCategory() {}

    @Override
    public String getType() {
        return "Manager";
    }
}