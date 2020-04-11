package Models;

import Models.User.User;

public class Score {
    private User userWhoBuyed;
    private int score;
    private Product product;

    public Score() {

    }

    public User getUserWhoBuyed() {
        return userWhoBuyed;
    }

    public void setUserWhoBuyed(User userWhoBuyed) {
        this.userWhoBuyed = userWhoBuyed;
    }

    public int getScore() {
        return score;
    }
}
