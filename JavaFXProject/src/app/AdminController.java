
// package app;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.util.*;

public class AdminController {

        // Admin toggles/interations
        @FXML
        private Button GC1Refill;
        @FXML
        private Button GC2Refill;
        @FXML
        private Button CokeRefill;
        @FXML
        private Button KoolAidRefill;
        @FXML
        private Button Replacewithpop;
        @FXML
        private Button SpriteRefill;
        @FXML
        private Button WaterRefill;
        @FXML
        private Button PepsiRefill;
        @FXML
        private Button RootRefill;
        @FXML
        private TextField GC1revenue;
        @FXML
        private TextField Cokerevenue;
        @FXML
        private TextField GC2revenue;
        @FXML
        private TextField KArevenue;
        @FXML
        private TextField Spriterevenue;
        @FXML
        private TextField Pepsirevenue;
        @FXML
        private TextField Waterrevenue;
        @FXML
        private TextField RootBeerRevene;
        @FXML
        private TextField replacementRevenue;

        @FXML
        private TextField GCnumbersold;
        @FXML
        private TextField Cokenumbersold;
        @FXML
        private TextField GC2numbersold;
        @FXML
        private TextField KAnumbersold;
        @FXML
        private TextField Spritenumbersold;
        @FXML
        private TextField Pepsisoldnumbersold;
        @FXML
        private TextField Waternumbersold;
        @FXML
        private TextField rootsoldnumber;
        @FXML
        private TextField Summary;

        // public static Map<String, Item> inventory = HomeController.inventory;
        // public static ArrayList<ArrayList<String>> AllItemsSold =
        // HomeController.AllItemsSold;
        // public static ArrayList<Double> totalSales = HomeController.totalSales;
        // public static Map<String, Integer> drinks = HomeController.drinks;

        @FXML
        private void restockItem(ActionEvent event) {
                Button clickedButton = (Button) event.getSource();
                String buttonId = clickedButton.getId();
                switch (buttonId) {
                        case "GC1Refill":
                                Stock.GrilledCheeseR1ava = 32;
                                // HomeController.inventory.get("Grilled
                                // Cheese").restockGC(HomeController.inventory.get("Grilled
                                // Cheese").getQuantity());
                                break;
                        case "GC2Refill":
                                Stock.GrilledCheeseR2ava = 32;
                                // HomeController.inventory.get("Grilled
                                // Cheese2").restockGC(HomeController.inventory.get("Grilled
                                // Cheese2").getQuantity());
                                break;
                        case "CokeRefill":
                                Stock.Cokeava = 16;
                                // HomeController.inventory.get("Coke").restock(HomeController.inventory.get("Coke").getQuantity());
                                // CokeitemRestocked = true;
                                break;
                        case "SpriteRefill":
                                Stock.Spriteava = 16;
                                // HomeController.inventory.get("Sprite").restock(HomeController.inventory.get("Sprite").getQuantity());
                                break;
                        case "KoolAidRefill":
                                Stock.KoolAidava = 16;
                                // HomeController.inventory.get("KoolAid").restock(HomeController.inventory.get("KoolAid").getQuantity());
                                break;
                        case "WaterRefill":
                                Stock.Waterava = 16;
                                // HomeController.inventory.get("Water").restock(HomeController.inventory.get("Water").getQuantity());
                                break;
                        case "PepsiRefill":
                                Stock.Pepsiava = 16;
                                // HomeController.inventory.get("Pepsi").restock(HomeController.inventory.get("Pepsi").getQuantity());
                                break;
                        case "RootRefill":
                                Stock.RootBeerava = 16;
                                // HomeController.inventory.get("Root
                                // Beer").restock(HomeController.inventory.get("Root Beer").getQuantity());
                                break;
                        default:
                                break;
                }
        }
        // Admin page

        @FXML
        public void updateAdmin() {
                double overallSales = 0.0;
                for (int i = 0; i < HomeController.totalSales.size(); i++) {
                        overallSales += HomeController.totalSales.get(i);
                }

                for (int i = 0; i < HomeController.AllItemsSold.size(); i++) {
                        ArrayList<String> itemX = HomeController.AllItemsSold.get(i);

                        for (int j = 0; j < itemX.size(); j++) {
                                switch (itemX.get(j)) {
                                        case "Grilled Cheese":
                                                HomeController.inventory.get("Grilled Cheese").getQuantity();
                                                break;
                                        case "Grilled Cheese2":
                                                HomeController.inventory.get("Grilled Cheese2").getQuantity();
                                                break;
                                        case "Coke":
                                                HomeController.inventory.get("Coke").getQuantity();
                                                break;
                                        case "Sprite":
                                                HomeController.inventory.get("Sprite").getQuantity();
                                                break;
                                        case "KoolAid":
                                                HomeController.inventory.get("KoolAid").getQuantity();
                                                break;
                                        case "Pepsi":
                                                HomeController.inventory.get("Pepsi").getQuantity();
                                                break;
                                        case "Water":
                                                HomeController.inventory.get("Water").getQuantity();
                                                break;
                                        case "Root Beer":
                                                HomeController.inventory.get("Root Beer").getQuantity();
                                                break;
                                        case "":
                                                break;
                                }
                        }
                }
                // drinks.put("Coke",Cokesold);
                // drinks.put("Sprite",Spritesold);
                // drinks.put("KoolAid",KoolAidsold);
                // drinks.put("Pepsi",Pepsisold);
                // drinks.put("Water",Watersold);
                // drinks.put("Root Beer",RootBeersold);
                // if(CokeitemRestocked == true){
                // Cokesold = 0;
                // }

                // if(Cokesold > 16){
                // Cokesold = 16;
                // }

                System.out.println("-------------------------------------");
                System.out.println("Items on the racks:");
                // System.out.println(Stock.GrilledCheeseR1ava);
                // System.out.println(Stock.Cokeava);
                GCnumbersold.setText("On rack:" + String.valueOf(Stock.GrilledCheeseR1ava));
                // System.out.println( "Grilled Cheese" +
                // String.valueOf(HomeController.inventory.get("Grilled
                // Cheese").getQuantity()));
                GC2numbersold.setText("On rack:" + String.valueOf(Stock.GrilledCheeseR2ava));
                // System.out.println( "Grilled Cheese2" +
                // String.valueOf(HomeController.inventory.get("Grilled
                // Cheese2").getQuantity()));
                Cokenumbersold.setText("On rack:" + String.valueOf(Stock.Cokeava));
                // System.out.println( "Coke" +
                // String.valueOf(HomeController.inventory.get("Coke").getQuantity()));
                KAnumbersold.setText("On rack:" + String.valueOf(Stock.KoolAidava));
                // System.out.println( "KoolAid" +
                // String.valueOf(HomeController.inventory.get("KoolAid").getQuantity()));
                Spritenumbersold.setText("On rack:" + String.valueOf(Stock.Spriteava));
                Pepsisoldnumbersold.setText("On rack:" + String.valueOf(Stock.Pepsiava));
                Waternumbersold.setText("On rack:" + String.valueOf(Stock.Waterava));
                rootsoldnumber.setText("On rack:" + String.valueOf(Stock.RootBeerava));

                // System.out.println("Grilled Cheese rack 1: " + (32 - GrilledCheeseR1sold));
                // System.out.println("Grilled Cheese rack 2: " + (32 - GrilledCheeseR2sold));
                // System.out.println("Coke: " + (16 - Cokesold));
                // System.out.println("KoolAid: " + (16 - KoolAidsold));
                // System.out.println("Sprite: " + (16 - Spritesold));
                // System.out.println("Pepsi: " + (16 - Pepsisold));
                // System.out.println("Water: " + (16 - Watersold));
                // System.out.println("Root Beer: " + (16 - RootBeersold));
                // public static int Cokeava = 16;
                // public static int KoolAidava = 16;
                // public static int Spriteava = 16;
                // public static int Pepsiava = 16;
                // public static int Waterava = 16;
                // public static int RootBeerava = 16;
                // public static int GrilledCheeseR1ava = 32;
                // public static int GrilledCheeseR2ava = 32;

                GC1revenue.setText("Revenue: " + String.valueOf((32 - Stock.GrilledCheeseR1ava)
                                * HomeController.inventory.get("Grilled Cheese").getPrice()));
                Cokerevenue.setText("Revenue: " + String
                                .valueOf((16 - Stock.Cokeava) * HomeController.inventory.get("Coke").getPrice()));
                GC2revenue.setText("Revenue: " + String.valueOf((32 - Stock.GrilledCheeseR2ava)
                                * HomeController.inventory.get("Grilled Cheese2").getPrice()));
                KArevenue.setText("Revenue: " + String
                                .valueOf((16 - Stock.KoolAidava) * HomeController.inventory.get("KoolAid").getPrice()));
                Spriterevenue.setText("Revenue: " + String
                                .valueOf((16 - Stock.Spriteava) * HomeController.inventory.get("Sprite").getPrice()));
                Pepsirevenue.setText("Revenue: " + String
                                .valueOf((16 - Stock.Pepsiava) * HomeController.inventory.get("Pepsi").getPrice()));
                Waterrevenue.setText("Revenue: " + String
                                .valueOf((16 - Stock.Waterava) * HomeController.inventory.get("Water").getPrice()));
                RootBeerRevene.setText("Revenue: " + String.valueOf(
                                (16 - Stock.RootBeerava) * HomeController.inventory.get("Root Beer").getPrice()));
                // System.out.println(String.valueOf((16 - Stock.RootBeerava )));
                // System.out.println(HomeController.inventory.get("Root Beer").getPrice());

                double total = 0.00;
                total += (32 - Stock.GrilledCheeseR1ava) * HomeController.inventory.get("Grilled Cheese").getPrice();
                total += (16 - Stock.Cokeava) * HomeController.inventory.get("Coke").getPrice();
                total += (32 - Stock.GrilledCheeseR2ava) * HomeController.inventory.get("Grilled Cheese2").getPrice();
                total += (16 - Stock.KoolAidava) * HomeController.inventory.get("KoolAid").getPrice();
                total += (16 - Stock.Spriteava) * HomeController.inventory.get("Sprite").getPrice();
                total += (16 - Stock.Pepsiava) * HomeController.inventory.get("Pepsi").getPrice();
                total += (16 - Stock.Waterava) * HomeController.inventory.get("Water").getPrice();
                total += (16 - Stock.RootBeerava) * HomeController.inventory.get("Root Beer").getPrice();

                Summary.setText("Total Revenue: " + String.valueOf(total));
                // System.out.println("Total revenue for each item:");
                // // System.out.println(inventory.get("Coke").getPrice());
                // //.getrevenue isn't working
                // System.out.println("Grilled Cheese rack 1: " + (GrilledCheeseR1sold *
                // inventory.get("Grilled Cheese").getPrice()));
                // System.out.println("Grilled Cheese rack 2: " + (GrilledCheeseR2sold *
                // inventory.get("Grilled Cheese2").getPrice()));
                // System.out.println("Coke: " + (Cokesold * inventory.get("Coke").getPrice()));
                // System.out.println("KoolAid: " + (KoolAidsold *
                // inventory.get("KoolAid").getPrice()));
                // System.out.println("Sprite: " + (Spritesold *
                // inventory.get("Sprite").getPrice()));
                // System.out.println("Pepsi: " + (Pepsisold *
                // inventory.get("Pepsi").getPrice()));
                // System.out.println("Water: " + (Watersold *
                // inventory.get("Water").getPrice()));
                // System.out.println("Root Beer: " + (RootBeersold * inventory.get("Root
                // Beer").getPrice()));

                // System.out.println("Total revenue: " + overallSales);
                // drinkReplacement();
                System.out.println("-------------------------------------");
                // drinkReplacement();
        }

        // private void drinkReplacement() {
        // // String leastfav = "Coke";
        // // String mostfav = "Coke";
        // String[] drinkNames = { "Coke", "KoolAid", "Sprite", "Water", "Pepsi", "Root
        // Beer" };
        // int[] stockVal = {
        // Stock.Cokeava,
        // Stock.KoolAidava,
        // Stock.Spriteava,
        // Stock.Waterava,
        // Stock.Pepsiava,
        // Stock.RootBeerava
        // };
        // int popDrink = 0; // least avalibility
        // int badDrink = 0; // most avalibility

        // for (int i = 1; i < stockVal.length; i++) {
        // if (stockVal[i] < stockVal[popDrink]) {
        // popDrink = i;
        // }
        // if (stockVal[i] > stockVal[badDrink]) {
        // badDrink = i;
        // }
        // }

        // for (Map.Entry<String, Integer> entry : HomeController.drinks.entrySet()) {
        // String drink = entry.getKey();
        // int sales = entry.getValue();
        // if (HomeController.drinks.get(mostfav) < sales) {
        // mostfav = drink;
        // }
        // if (HomeController.drinks.get(leastfav) > sales) {
        // leastfav = drink;
        // }
        // // if (drinks.get(leastfav) == sales) {
        // // leastfav += leastfav + "," +drink;
        // // }

        // }
        // System.out.println("Most favorite drink: " + popDrink);
        // System.out.println("Least favorite drink: " + badDrink);
        // }

        @FXML
        protected void ReplacementDrink() {
                String[] drinkNames = { "Coke", "KoolAid", "Sprite", "Water", "Pepsi", "Root Beer" };
                int[] stockVal = {
                                Stock.Cokeava,
                                Stock.KoolAidava,
                                Stock.Spriteava,
                                Stock.Waterava,
                                Stock.Pepsiava,
                                Stock.RootBeerava
                };
                int popDrink = 0; // least avalibility
                int badDrink = 0; // most avalibility

                for (int i = 1; i < stockVal.length; i++) {
                        if (stockVal[i] < stockVal[popDrink]) {
                                popDrink = i;
                        }
                        if (stockVal[i] > stockVal[badDrink]) {
                                badDrink = i;
                        }
                }
                String goodText = "Most favorite drink: " + drinkNames[popDrink] + "    " + "Least favorite drink: "
                                + drinkNames[badDrink];
                Summary.setText(goodText);
                // System.out.println();
        }

        @FXML
        protected void HomePage3(javafx.event.ActionEvent event) {
                try {
                        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainView.fxml"));
                        Parent root = fxmlLoader.load();
                        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
                        Scene scene = new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }
        // @FXML
        // protected void HomePage3(ActionEvent event) {
        // HomeController.adminView.setVisible(false);
        // HomeController.customerView.setVisible(false);
        // HomeController.homePane.setVisible(true);
        // }
}
