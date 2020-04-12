package View.Menu;

import Controller.Controller;
import View.View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

public abstract class Menu {
    private String name;
    protected HashMap<String, Menu> subMenus;
    protected Menu parentMenu;
    public static Scanner scanner;
    private static Controller controller;
    private static ArrayList<Menu> allMenus;

    public Menu(String name, Menu parentMenu) {
        this.name = name;
        this.parentMenu = parentMenu;
        allMenus.add(this);
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

    public void setSubMenus(HashMap<String, Menu> subMenus) {
        this.subMenus = subMenus;
    }

    public abstract String getCommandKey(String command);

    public void run() {
        String command = scanner.nextLine().trim();
        Menu nextMenu = null;
        if (getCommandKey(command).equals("invalid")) {
            nextMenu = this;
            View.printString("invalid command");
        } else if (getCommandKey(command).equals("back")) {
            nextMenu = this.parentMenu;
        } else {
            nextMenu = this.subMenus.get(getCommandKey(command));
        }
        nextMenu.run();
    }
}
