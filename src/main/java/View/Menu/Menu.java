package View.Menu;

import Controller.Controller;
import View.View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Menu {
    private String name;
    protected HashMap<String, Menu> subMenus;
    protected Menu parentMenu;
    public static Scanner scanner;
    protected static Controller controller;
    protected static ArrayList<Menu> allMenus = new ArrayList<>();

    public Menu(String name, Menu parentMenu) {
        this.name = name;
        this.parentMenu = parentMenu;
        this.subMenus = new HashMap<>();
        this.subMenus.put("Login Menu", getLoginMenu());
        this.subMenus.put("Register Menu", getRegisterMenu());
        allMenus.add(this);
    }

    private Menu getLoginMenu() {
        return new Menu("Login Menu", this) {
            @Override
            public void run(String lastCommand) {
                controller.hasUserWithUsername("");
                controller.isPasswordCorrect("");
                View.printString(controller.loginAccount("", ""));
                this.parentMenu.run(lastCommand);
            }
        };
    }

    private Menu getRegisterMenu() {
        return new Menu("Sign Up Menu", this) {
            @Override
            public void run(String lastCommand) {
                controller.hasUserWithUsername("");
                View.printString(controller.createAccount(new String[3]));
                this.parentMenu.run(lastCommand);
            }
        };
    }

    public static void setController(Controller controller) {
        Menu.controller = controller;
    }

    public static void setScanner(Scanner scanner) {
        Menu.scanner = scanner;
    }

    public void setParentMenu(Menu parentMenu) {
        this.parentMenu = parentMenu;
    }

    public static Matcher getMatcher(String command, String regex) {
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(command);
    }

    public String getName() {
        return name;
    }

    public void showMenu() {
        String show = this.name + " :\n";
        for (String key : this.subMenus.keySet()) {
            show += subMenus.get(key).getName() + "\n";
        }
        show += "help\n";
        if (this.parentMenu == null) {
            show += "exit";
        } else {
            show += "back";
        }
        View.printString(show);
    }

    public String getCommandKey(String command) {
        return "";
    }

    public void run(String lastCommand) {
        String command = scanner.nextLine().trim();
        Menu nextMenu = null;
        if (getCommandKey(command).equals("invalid")) {
            nextMenu = this;
            View.printString("invalid command");
        } else if (getCommandKey(command).equals("back")) {
            nextMenu = this.parentMenu;
        } else if (getCommandKey(command).equals("help")) {
            this.showMenu();
        } else {
            nextMenu = this.subMenus.get(getCommandKey(command));
        }
        nextMenu.run(command);
    }
}
