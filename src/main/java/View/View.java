package View;

import View.Menu.MainMenu;

public class View {

    public View() {

    }

    public static void printString(String string) {
        System.out.println(string);
    }

    public static void run() {
        new MainMenu().run("");
    }
}
