// // package app;
import java.io.IOException;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.util.*;

public class Controller {
    // FXML elements for Customer view
    @FXML
    private Label welcomeText;

    // User toggles/interations
    @FXML
    private TextArea SelectionMessageC;
    @FXML
    private Label SelectionM;
    @FXML
    private TextArea SnoopyMessageC;
    @FXML
    private Button GrilledCheeseCButton;
    @FXML
    private Button SpriteCButton;
    @FXML
    private Button CokeCButton;
    @FXML
    private Button PepsiCButton;
    @FXML
    private Button KoolAidCButton;
    @FXML
    private Button WaterCButton;
    @FXML
    private Button RootBeerButton;
    @FXML
    private Button payButton;
    @FXML
    private Button ClearSelectMC;

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



    
    private String selectedItem = "";
    private double selectedPrice = 0.0;

    
    private static Map<String, Item> inventory = new HashMap<>();
    private static ArrayList<String> selectedItemsList = new ArrayList<>();
    private static ArrayList<ArrayList<String>> AllItemsSold = new ArrayList<>();
    private double selectedItemsPrice = 0.0;
    private static ArrayList<Double> totalSales = new ArrayList<>();

    private static Map<String, Integer> drinks = new HashMap<>();
        int Cokesold = 0;
        int KoolAidsold = 0;
        int Spritesold = 0;
        int Pepsisold = 0;
        int Watersold = 0;
        int RootBeersold = 0;
        int GrilledCheeseR1sold = 0;
        int GrilledCheeseR2sold = 0;

    
    public void initialize() {
        inventory.put("Grilled Cheese", new Item("Grilled Cheese", 3.50, 32));
        inventory.put("Grilled Cheese2", new Item("Grilled Cheese", 3.50, 32));
        inventory.put("Sprite", new Item("Sprite", 2.50, 16));
        inventory.put("Coke", new Item("Coke", 2.50, 16));
        inventory.put("Pepsi", new Item("Pepsi", 2.50, 16));
        inventory.put("KoolAid", new Item("KoolAid", 1.50, 16));
        inventory.put("Water", new Item("Water", 1.50, 16));
        inventory.put("Root Beer", new Item("Root Beer", 1.50, 16));
    }

    // Admin and Customer View Switch
    @FXML
    protected void AdminVeiw() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("new_screen.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = (Stage) welcomeText.getScene().getWindow(); 
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void CustomerView() {
        try {
            // welcomeText.setText("Let's go!!");
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("new_screen_two.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = (Stage) welcomeText.getScene().getWindow(); 
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //  Food truck page weeeweee

    @FXML
    protected void HomePage1(javafx.event.ActionEvent event) {
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
    
    ///////////////////// Admin Page:
    private boolean CokeitemRestocked = false;
    // private boolean SpriteitemRestocked = false;
    // private boolean CokeitemRestocked = false;
    // private boolean SpriteitemRestocked = false;

    @FXML
    private void restockItem(ActionEvent event) {
    Button clickedButton = (Button) event.getSource();
    String buttonId = clickedButton.getId();

    switch (buttonId) {
        case "GC1Refill":
            inventory.get("Grilled Cheese").restockGC(inventory.get("Grilled Cheese").getQuantity()); 
            System.out.println(inventory.get("Grilled Cheese").getQuantity());
            //Summary.setText("Restocked Grilled Cheese rack one");
            System.out.println("Snoopy just restocked Grilled Cheese rack one");
            // itemRestocked = true;
            break;
        case "GC2Refill":
            inventory.get("Grilled Cheese2").restockGC(inventory.get("Grilled Cheese2").getQuantity()); 
            //Summary.setText("Restocked Grilled Cheese rack two");
            System.out.println("Snoopy just restocked Grilled Cheese rack two");
            // itemRestocked = true;
            break;
        case "CokeRefill":
            System.out.println( inventory.get("Coke").getQuantity());
            inventory.get("Coke").restock(inventory.get("Coke").getQuantity());
            //Summary.setText("Restocked Coke rack one");
            System.out.println("Snoopy just restocked Coke");
            CokeitemRestocked = true;
            break;
        case "SpriteRefill":
            inventory.get("Sprite").restock(inventory.get("Sprite").getQuantity());
            System.out.println("Snoopy just restocked Sprite");
            // itemRestocked = true;
            break;
        case "KoolAidRefill":
            inventory.get("KoolAid").restock(inventory.get("KoolAid").getQuantity());
            System.out.println("Snoopy just restocked KoolAid");
            // itemRestocked = true;
            break;
        case "WaterRefill":
            inventory.get("Water").restock(inventory.get("Water").getQuantity());
            System.out.println("Snoopy just restocked Water");
            // itemRestocked = true;
            break;
        case "PepsiRefill":
            inventory.get("Pepsi").restock(inventory.get("Pepsi").getQuantity());
            System.out.println("Snoopy just restocked Pepsi");
            // itemRestocked = true;
            break;
        case "RootRefill":
            inventory.get("Root Beer").restock(inventory.get("Root Beer").getQuantity());
            System.out.println("Snoopy just restocked Root Beer");
            // itemRestocked = true;
            break;
        default:
            break;
        }
        }
        // Admin page

        @FXML
        public void updateAdmin() {
            double overallSales = 0.0;
            for(int i = 0; i < totalSales.size(); i++){
                overallSales += totalSales.get(i);
            }
            

            for (int i = 0; i < AllItemsSold.size(); i++) {
                ArrayList<String> itemX = AllItemsSold.get(i); 

                for (int j = 0; j < itemX.size(); j++) {
                    switch (itemX.get(j)) {
                        case "Grilled Cheese":
                            GrilledCheeseR1sold++;
                            break;
                        case "Grilled Cheese2":
                            GrilledCheeseR2sold++;
                            break;
                        case "Coke":
                            Cokesold++;
                            break;
                        case "Sprite":
                            Spritesold++;
                            break;
                        case "KoolAid":
                            KoolAidsold++;
                            break;
                        case "Pepsi":
                            Pepsisold++;
                            break;
                        case "Water":
                            Watersold++;
                            break;
                        case "Root Beer":
                            RootBeersold++;
                            break;
                }
            }
        }
        drinks.put("Coke",Cokesold);
        drinks.put("Sprite",Spritesold);
        drinks.put("KoolAid",KoolAidsold);
        drinks.put("Pepsi",Pepsisold);
        drinks.put("Water",Watersold);
        drinks.put("Root Beer",RootBeersold);
        if(CokeitemRestocked == true){
            Cokesold = 0;
        }

        if(Cokesold > 16){
            Cokesold = 16;
        }


        System.out.println("-------------------------------------");
        //         GCnumbersold.setText(String.valueOf(inventory.get("Grilled Cheese").getQuantity()));
        //         Cokenumbersold.setText(String.valueOf(inventory.get("Coke").getQuantity()));
        //         GC2numbersold.setText(String.valueOf(inventory.get("Grilled Cheese2").getQuantity()));
        //         KAnumbersold.setText(String.valueOf(inventory.get("KoolAid").getQuantity()));
        //         Spritenumbersold.setText(String.valueOf(inventory.get("Sprite").getQuantity()));
        //         Pepsisoldnumbersold.setText(String.valueOf(inventory.get("Pepsi").getQuantity()));
        //         Waternumbersold.setText(String.valueOf(inventory.get("Water").getQuantity()));
        //         rootsoldnumber.setText(String.valueOf(inventory.get("Root Beer").getQuantity()));
                    System.out.println("Items on the racks:");
                   
                   System.out.println("Grilled Cheese rack 1: " + (32 - GrilledCheeseR1sold));
                   System.out.println("Grilled Cheese rack 2: " + (32 - GrilledCheeseR2sold));
                   System.out.println("Coke: " + (16 - Cokesold));
                   System.out.println("KoolAid: " + (16 - KoolAidsold));
                   System.out.println("Sprite: " + (16 - Spritesold));
                   System.out.println("Pepsi: " + (16 - Pepsisold));
                   System.out.println("Water: " + (16 - Watersold));
                   System.out.println("Root Beer: " + (16 - RootBeersold));
                
        //         GC1revenue.setText(String.valueOf(inventory.get("Grilled Cheese").getRevenue()));
        //         Cokerevenue.setText(String.valueOf(inventory.get("Coke").getRevenue()));
        //         GC2revenue.setText(String.valueOf(inventory.get("Grilled Cheese2").getRevenue()));
        //         KArevenue.setText(String.valueOf(inventory.get("KoolAid").getRevenue()));
        //         Spriterevenue.setText(String.valueOf(inventory.get("Sprite").getRevenue()));
        //         Pepsirevenue.setText(String.valueOf(inventory.get("Pepsi").getRevenue()));
        //         Waterrevenue.setText(String.valueOf(inventory.get("Water").getRevenue()));
        //         RootBeerButton.setText(String.valueOf(inventory.get("Root Beer").getRevenue()));
        System.out.println("Total revenue for each item:");
            // System.out.println(inventory.get("Coke").getPrice());
            //.getrevenue isn't working
            System.out.println("Grilled Cheese rack 1: " + (GrilledCheeseR1sold * inventory.get("Grilled Cheese").getPrice()));
            System.out.println("Grilled Cheese rack 2: " + (GrilledCheeseR2sold * inventory.get("Grilled Cheese2").getPrice()));
            System.out.println("Coke: " + (Cokesold * inventory.get("Coke").getPrice()));
            System.out.println("KoolAid: " + (KoolAidsold * inventory.get("KoolAid").getPrice()));
            System.out.println("Sprite: " + (Spritesold * inventory.get("Sprite").getPrice()));
            System.out.println("Pepsi: " + (Pepsisold * inventory.get("Pepsi").getPrice()));
            System.out.println("Water: " + (Watersold * inventory.get("Water").getPrice()));
            System.out.println("Root Beer: " + (RootBeersold * inventory.get("Root Beer").getPrice()));

            System.out.println("Total revenue: " + overallSales);
            drinkReplacement();
            System.out.println("-------------------------------------");
            // drinkReplacement();
        }

        private void drinkReplacement() {
                String leastfav = "Coke";
                String mostfav = "Coke";
                for (Map.Entry<String, Integer> entry : drinks.entrySet()) {
                    String drink = entry.getKey();
                    int sales = entry.getValue();
                    if (drinks.get(mostfav) < sales) {
                        mostfav = drink;
                    }
                    if (drinks.get(leastfav) > sales) {
                        leastfav = drink;
                    }
                    // if (drinks.get(leastfav) == sales) {
                    //     leastfav += leastfav + "," +drink;
                    // }

                }
                System.out.println("Most favorite drink: " + mostfav);
                System.out.println("Least favorite drink: " + leastfav);
        }


    // inventory Class
    public static class Item {
        private String name;
        private double price;
        private int quantity;
        private int numberSold; 
        private double revenue; 
    
        public Item(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
            this.numberSold = 0; 
            this.revenue = 0.0; 
        }
    
        public String getName() {
            return name;
        }
    
        public double getPrice() {
            return price;
        }
    
        public int getQuantity() {
            return quantity;
        }
    
        public int getNumberSold() {
            return numberSold; 
        }
    
        public double getRevenue() {
            return revenue; 
        }
    
        public void decreaseQuantity() {
            if (quantity > 0) {
                quantity--;
                numberSold++; 
                revenue += price;
            }
        }
    
        public void restockGC(int amount) {
            if(amount < 32){
                this.quantity = 32;
            } 
        }
        public void restock(int amount) {
            if(amount < 16){
                this.quantity = 16;
            } 
        }
    }    
}
