package View.Menu.UserArea.ManagerArea;

import View.Menu.Menu;

public class ManageRequests extends Menu {

    public ManageRequests(Menu parentMenu) {
        super("Manage Requests", parentMenu);
    }

    private void showRequests() {

    }

    @Override
    public void run(String lastCommand) {
        this.showRequests();
        String command = scanner.nextLine().trim();
        if (command.startsWith("details")) {
            controller.requestDetails(1);
            this.run("");
        }
        if (command.startsWith("accept")) {
            controller.acceptRequest(1);
            this.run("");
        }
        if (command.startsWith("decline")) {
            controller.declineRequest(1);
            this.run("");
        }
        if (command.equals("back")) {
            this.parentMenu.run("");
        }
    }
}
