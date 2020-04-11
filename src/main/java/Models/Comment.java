package Models;

import Models.User.User;

public class Comment {
    private User userWhoComment;
    private Product product;
    private String note;
    private enum commentStatus {REVIEWFORCONFIRMATION, ACCEPTED , NOTCONFIRMEDFROMMANAGER};
    private boolean isUserBuyedThisProduct;

    public Comment() {

    }

    public User getUserWhoComment() {
        return userWhoComment;
    }

    public Product getProduct() {
        return product;
    }

    public String getNote() {
        return note;
    }

    public boolean isUserBuyedThisProduct() {
        return isUserBuyedThisProduct;
    }
}
