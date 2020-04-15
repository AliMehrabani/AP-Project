package Controller;

import Models.DiscountCode;

public class ManagerAreaController {

    public static String viewUser(String username) {
        return "";
    }

    public static void deleteUser(String username) {
    }

    public static void changeUserType(String username, String newType) {

    }

    public static void createManagerProfile(String[] info) {

    }

    public static void deleteProduct(long productID) {

    }

    public static void createDiscountCode(String[] info) {
        DiscountCode.addDiscountCode(null);
    }

    public static void editDiscountCode(long code) {

    }

    public static void removeDiscountCode(long code) {

    }

    public static void requestDetails(long requestID) {
        //manager class is not complete
    }

    public static void acceptRequest(long requestID) {

    }

    public static void declineRequest(long requestID) {

    }

    public static void editCategory(String name) {

    }

    public static void addCategory(String name) {

    }

    public static void removeCategory(String name) {

    }

    public static String viewDiscountCode(long discountCode) {
        return "";
    }
}
