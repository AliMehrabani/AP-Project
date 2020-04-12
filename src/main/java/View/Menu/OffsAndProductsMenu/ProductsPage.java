package View.Menu.OffsAndProductsMenu;

import View.Menu.Menu;

import java.util.HashMap;

public class ProductsPage extends Menu {
    public ProductsPage(Menu parentMenu) {
        super("Products Page", parentMenu);
        HashMap<String, Menu> subMenus = new HashMap<String, Menu>();
        subMenus.put("Show All Product",new ShowAllProducts("Show All Product",this));
        subMenus.put("Show Categories",new ShowCategories("Show Categories",this));
        subMenus.put("Filtering",new Filtering("Filtering",this));
        subMenus.put("Sotring",new Sorting("Sorting",this));
        subMenus.put("Show Product",new ShowProduct("Show Product",this,productId ));
        this.setSubMenus(subMenus);
    }
    private long productId;
    @Override
    public String getCommandKey(String command) {
        return null;
    }

//    private Menu showProduct() {
//        return new Menu("Show Product", this) {
//            @Override
//            public String getCommandKey(String command) {
//                return null;
//            }
//
//            @Override
//            public void run() {
//                View.printProduct(Controller.getAllProduct(false));
//                this.parentMenu.run();
//            }
//        };
//    }

//    private Menu showCategories(){
//        return new Menu("Show Categories",this) {
//            @Override
//            public String getCommandKey(String command) {
//                return null;
//            }
//
//            @Override
//            public void run() {
//                View.printCategories(Controller.getAllCategory());
//                this.parentMenu.run();
//            }
//        };
//    }

//    private Menu filtering(){
//        return new Menu("Filtering",this) {
//            @Override
//            public String getCommandKey(String command) {
//                return null;
//            }
//
//            @Override
//            public void run() {
//                String input=scanner.nextLine();
//                if (input.equals("show available filters")) {
//                    View.printAvailableFilters(Controller.getAllAvailableFilters());
//                    this.run();
//                }
//                if (input.equals("filter [an available filter]")){
//                    //Alireza tabee ro neveshte
//                    this.run();
//                }
//                if (input.equals("current filters")){
//                    //
//                    this.run();
//                }
//            }
//        };
//    }
}
