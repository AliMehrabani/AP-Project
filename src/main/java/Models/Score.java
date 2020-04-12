package Models;

import Models.User.User;

public class Score {
    private User userWhoBuy;
    private int score;
    private Product product;

    public Score() {

    }

    public User getUserWhoBuy() {
        return userWhoBuy;
    }

    public void setUserWhoBuy(User userWhoBuyed) {
        this.userWhoBuy = userWhoBuyed;
    }

    public int getScore() {
        return score;
    }
}
