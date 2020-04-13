package View.Menu.UserArea.ManagerArea;

import View.Menu.Menu;

public class ManageRequests extends Menu {

    public ManageRequests(Menu parentMenu) {
        super("Manage Requests", parentMenu);
    }

    @Override
    public String getCommandKey(String command) {
        return null;
    }

    private Menu getDetails() {
        return new Menu("Details", this) {
            @Override
            public String getCommandKey(String command) {
                return null;
            }

            @Override
            public void run(String lastCommand) {
                controller.requestDetails(1);
            }
        };
    }

    private Menu getAcceptRequest() {
        return new Menu("Accept Request", this) {
            @Override
            public String getCommandKey(String command) {
                return null;
            }

            @Override
            public void run(String lastCommand) {
                controller.acceptRequest(1);
            }
        };
    }

    private Menu getDeclineRequest() {
        return new Menu("Decline Request", this) {
            @Override
            public String getCommandKey(String command) {
                return null;
            }

            @Override
            public void run(String lastCommand) {
                controller.declineRequest(1);
            }
        };
    }

    private void showRequests() {

    }

    @Override
    public void run(String lastCommand) {
        this.showRequests();
        super.run(lastCommand);
    }
}
