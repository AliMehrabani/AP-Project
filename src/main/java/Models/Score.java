package Models;

import Models.User.User;

public class Score {
    private User Buyer;
    private int score;
    private Product product;

    public Score() {

    }

    public User getBuyer() {
        return Buyer;
    }

    public void setBuyer(User buyer) {
        this.Buyer = buyer;
    }

    public int getScore() {
        return score;
    }
}
