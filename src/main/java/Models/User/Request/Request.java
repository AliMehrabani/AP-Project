package Models.User.Request;

import java.util.ArrayList;

public abstract class Request {
    private static ArrayList<Request> allRequests = new ArrayList<>();
    protected String managerAnswer;
    protected long requestID;

    public Request() {
        this.managerAnswer = null;
        this.requestID = allRequests.size() + 1;
        allRequests.add(this);
    }

    public void setManagerAnswer(String managerAnswer) {
        this.managerAnswer = managerAnswer;
    }

    public String getManagerAnswer() {
        return managerAnswer;
    }

    public long getRequestID() {
        return requestID;
    }

    public abstract String getType();

    public abstract void run();
}
