package View.Menu;

import Controller.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

public abstract class Menu {
    private String name;
    private HashMap<String, Menu> subMenus;
    private Menu parentMenu;
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

    public void setSubMenus(HashMap<String, Menu> subMenus) {
        this.subMenus = subMenus;
    }

    public void run() {
        while (true) {
            String command = scanner.nextLine().trim();

        }
    }
}
