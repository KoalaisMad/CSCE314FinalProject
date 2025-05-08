// package app;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.util.*;



public class CustomerController {

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

    @FXML
    private Button KoolAidAvaliability;
    @FXML
    private Button GC1Avaliability;
    @FXML
    private Button GC2Avaliability;
    @FXML
    private Button SpriteAvaliability;
    @FXML
    private Button CokeAvaliability;
    @FXML
    private Button PepsiAvaliability;
    @FXML
    private Button WaterAvalibility;
    @FXML
    private Button PopularAvaliability;

    

        // public static Map<String, Item> inventory = HomeController.inventory;
        // public static ArrayList<String> selectedItemsList = HomeController.selectedItemsList;
        // public static ArrayList<ArrayList<String>> AllItemsSold = HomeController.AllItemsSold;
        // public static ArrayList<Double> totalSales = HomeController.totalSales;
        private double selectedItemsPrice = 0.00;
        private String selectedItem = "";
        private double selectedPrice = 0.00;
        private boolean paid = false;
/////////////////////Customer view
    // Selection items 

    public String sItems = "Selected items: ";
    @FXML
    protected void handleItemSelection(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        String buttonId = clickedButton.getId();
        switch (buttonId) {
            case "GrilledCheeseCButton":
                selectedItem = "Grilled Cheese";
                selectedPrice = HomeController.inventory.get("Grilled Cheese").getPrice();
                break;
            case "SpriteCButton":
                selectedItem = "Sprite";
                selectedPrice = HomeController.inventory.get("Sprite").getPrice();
                break;
            case "CokeCButton":
                selectedItem = "Coke";
                selectedPrice = HomeController.inventory.get("Coke").getPrice();
                break;
            case "PepsiCButton":
                selectedItem = "Pepsi";
                selectedPrice = HomeController.inventory.get("Pepsi").getPrice();
                break;
            case "KoolAidCButton":
                selectedItem = "KoolAid";
                selectedPrice = HomeController.inventory.get("KoolAid").getPrice();
                break;
            case "WaterCButton":
                selectedItem = "Water";
                selectedPrice = HomeController.inventory.get("Water").getPrice();
                break;
            case "RootBeerButton":
                selectedItem = "Root Beer";
                selectedPrice = HomeController.inventory.get("Root Beer").getPrice();
                break;
            default:
                selectedItem = "";
                selectedPrice = 0.00;
                break;
        }


        // Item selectedItemObj = new Item(selectedItem, selectedPrice, 0);
        // selectedItemsList.add(selectedItem);

        // for(int i = 0; i < selectedItemsList.size(); i++) {   
        //         System.out.print(selectedItemsList.get(i) + " ");
        // }  

        if(HomeController.inventory.get("Grilled Cheese").getQuantity() == 0){
                if(selectedItem.equals("Grilled Cheese")){
                        selectedItem = "Grilled Cheese2";
                }
        }

        // if (inventory.containsKey(selectedItem) && inventory.get(selectedItem).getQuantity() > 0) {
        //         inventory.get(selectedItem).decreaseQuantity();
        //         //System.out.println("Number of " + selectedItem + " remaining: " + inventory.get(selectedItem).getQuantity());
        //         System.out.println("Selected Items: " );
        //         for(int i = 0; i < selectedItemsList.size(); i++) {   
        //                 System.out.println(selectedItemsList.get(i) + " : $" + inventory.get(selectedItemsList.get(i)).getPrice());
        //         }
        //         selectedItemsPrice += inventory.get(selectedItem).getPrice();
        //         //SelectionMessageC.setText("Selected: " + selectedItem + " ($" + selectedPrice + ")");
        //                 // SnoopyMessageC.setText("Yum! Good choice!");
        //                 // if (SelectionM != null) {
        //                 //         SelectionM.setText("Selected: " + selectedItem + " ($" + selectedPrice + ")");
        //                 //     } else {
        //                 //         System.out.println("SelectionM is null");
        //                 //     }

                
        //         // SelectionM.setText("Selected: " + selectedItem + " ($" + selectedPrice + ")");
                
        //         System.out.println("Snoopy says: Yum! Good choice!");
        //         System.out.println("Your total is $" + selectedItemsPrice);
        //     } else {
        //         System.out.println("Sorry, " + selectedItem + " is out of stock!");
        //         System.out.println("Snoopy says: Please select another item.");
        //         // SelectionMessageC.setText("Sorry, " + selectedItem + " is out of stock!");
        // //     SnoopyMessageC.setText("Please select another item.");
        //     }
        
            if (HomeController.inventory.get(selectedItem).getQuantity() > 0) {
                SelectionMessageC.setText("Selected items: ");
                HomeController.selectedItemsList.add(selectedItem);
                // inventory.get(selectedItem).decreaseQuantity();
                //System.out.println("Number of " + selectedItem + " remaining: " + inventory.get(selectedItem).getQuantity());
                for(int i = 0; i < HomeController.selectedItemsList.size(); i++) {   
                        System.out.println(HomeController.selectedItemsList.get(i) + " : $" + HomeController.inventory.get(HomeController.selectedItemsList.get(i)).getPrice());
                }
                selectedItemsPrice += HomeController.inventory.get(selectedItem).getPrice();
                sItems += selectedItem + " ($" + selectedPrice + ")" + "\n";
                // if (selectedItemsList.get(selectedItemsList.size() - 1).equals(selectedItem)) {
                //         sItems += "Your total is $" + selectedItemsPrice + "\n";
                // }
                SelectionMessageC.setText(sItems);
                SnoopyMessageC.setText("Yum! Good choice!");
                        // if (SelectionM != null) {
                        //         SelectionM.setText("Selected: " + selectedItem + " ($" + selectedPrice + ")");
                        //     } else {
                        //         System.out.println("SelectionM is null");
                        //     }

                
                // SelectionM.setText("Selected: " + selectedItem + " ($" + selectedPrice + ")");
                
                System.out.println("Snoopy says: Yum! Good choice!");
                System.out.println("Your total is $" + selectedItemsPrice);
            } else {
                // System.out.println("Sorry, " + selectedItem + " is out of stock!");
                // System.out.println("Snoopy says: Please select another item.");
                SelectionMessageC.setText("Sorry, " + selectedItem + " is out of stock!");
                SnoopyMessageC.setText("Please select another item.");
            }

    }


    @FXML
    protected void handleAvalibility(ActionEvent event) {
    Button clickedButton = (Button) event.getSource();
    String buttonId = clickedButton.getId();

    SnoopyMessageC.setText("Stop worrying about the avaliability! That's my job!");


    switch (buttonId) {
        case "GC1Avaliability":
            selectedItem = "Grilled Cheese";
            SelectionMessageC.setText("Number of Grilled Cheese remaining on Rack1 is " + HomeController.inventory.get(selectedItem).getQuantity());
        //     GrilledCheeseR1sold = 0;
            break;
        case "GC2Avaliability":
            selectedItem = "Grilled Cheese2";
            SelectionMessageC.setText("Number of Grilled Cheese remaining on Rack2 is " + HomeController.inventory.get(selectedItem).getQuantity());
        //     GrilledCheeseR2sold = 0;
            break;
        case "SpriteAvaliability":
            selectedItem = "Sprite";
            SelectionMessageC.setText("Number of " + selectedItem + " remaining: " + HomeController.inventory.get(selectedItem).getQuantity());
        //     Spritesold = 0;
            break;
        case "CokeAvaliability":
            selectedItem = "Coke";
            SelectionMessageC.setText("Number of " + selectedItem + " remaining: " + HomeController.inventory.get(selectedItem).getQuantity());
        //     Cokesold = 0;
            break;
        case "PepsiAvaliability":
            selectedItem = "Pepsi";
            SelectionMessageC.setText("Number of " + selectedItem + " remaining: " + HomeController.inventory.get(selectedItem).getQuantity());
        //     Pepsisold = 0;
            break;
        case "KoolAidAvaliability":
            selectedItem = "KoolAid";
            SelectionMessageC.setText("Number of " + selectedItem + " remaining: " +HomeController.inventory.get(selectedItem).getQuantity());
        //     selectedPrice = inventory.get("KoolAid").getQuantity();
        //     KoolAidsold = 0;
            break;
        case "WaterAvalibility":
            selectedItem = "Water";
            SelectionMessageC.setText("Number of " + selectedItem + " remaining: " + HomeController.inventory.get(selectedItem).getQuantity());
        //     Watersold = 0;
            break;
        case "PopularAvaliability":
            selectedItem = "Root Beer";
            SelectionMessageC.setText("Number of " + selectedItem + " remaining: " + HomeController.inventory.get(selectedItem).getQuantity());
            //     RootBeersold = 0;
            break;
        default:
            selectedItem = "";
            selectedPrice = 0.00;
            break;
    }
}


        @FXML
        protected void handlePayment(ActionEvent event) {
                // for(String i : selectedItemsList){
                //         System.out.println((i));
                // }
                // for(String i : HomeController.selectedItemsList){
                //         if (HomeController.inventory.containsKey(i) && HomeController.inventory.get(i).getQuantity() > 0) {
                //                 System.out.println(HomeController.inventory.get(i) + ":  " + HomeController.inventory.get(i).getQuantity());
                //                 SelectionMessageC.setText("Payment processed");
                //         }
                // }

                paid = true;
                if(paid == true){
                        for(String i : HomeController.selectedItemsList){
                                if (HomeController.inventory.containsKey(i) && HomeController.inventory.get(i).getQuantity() > 0) {
                                        HomeController.inventory.get(i).decreaseQuantity();
                                        // System.out.println(HomeController.inventory.get(i) + ":  " + HomeController.inventory.get(i).getQuantity());
                                        SelectionMessageC.setText("Payment processed");
                                }
                        }
                        sItems += "Your total is $" + selectedItemsPrice + "\n";
                        SelectionMessageC.setText(sItems);
                }


        
                for (String i : HomeController.selectedItemsList) {
                        // ArrayList<String> itemX = HomeController.selectedItemsList.get(i); 

                        // for (int j = 0; j < itemX.size(); j++) {
                                switch (i) {
                                        case "Grilled Cheese":
                                                Stock.GrilledCheeseR1ava = HomeController.inventory.get("Grilled Cheese").getQuantity(); 
                                                // System.out.println(Stock.GrilledCheeseR1ava);
                                                break;
                                        case "Grilled Cheese2":
                                                Stock.GrilledCheeseR2ava = HomeController.inventory.get("Grilled Cheese2").getQuantity(); 
                                                break;
                                        case "Coke":
                                                Stock.Cokeava = HomeController.inventory.get("Coke").getQuantity(); 
                                                // System.out.println(Stock.Cokeava);
                                                break;
                                        case "Sprite":
                                                Stock.Spriteava = HomeController.inventory.get("Sprite").getQuantity(); 
                                                break;
                                        case "KoolAid":
                                                Stock.KoolAidava = HomeController.inventory.get("KoolAid").getQuantity(); 
                                                break;
                                        case "Pepsi":
                                                Stock.Pepsiava = HomeController.inventory.get("Pepsi").getQuantity(); 
                                                break;
                                        case "Water":
                                                Stock.Waterava = HomeController.inventory.get("Water").getQuantity(); 
                                                break;
                                        case "Root Beer":
                                                Stock.RootBeerava = HomeController.inventory.get("Root Beer").getQuantity(); 
                                                break;
                                        case "":
                                                break;
        //       }
          }

        }
                // sItems += "Your total is $" + selectedItemsPrice + "\n";
                // SelectionMessageC.setText(sItems);
                HomeController.totalSales.add(selectedItemsPrice);
                // AllItemsSold.add(selectedItemsList);
                // System.out.println(selectedItemsList);
                if (!HomeController.selectedItemsList.isEmpty()) {
                        HomeController.AllItemsSold.add(new ArrayList<>(HomeController.selectedItemsList)); 
                }
                // for(ArrayList<String> i: AllItemsSold){
                //         System.out.println(i);
                //     }
                selectedItemsPrice = 0;
                sItems = "";
                HomeController.selectedItemsList.clear();
                SnoopyMessageC.clear();
                System.out.println("Make a new selection!");

                // if(paid == true){
                //         SelectionMessageC.setText("Payment Processed!");
                // }

                // SelectionMessageC.setText("Thank you for shopping at Jyo's!");
                SnoopyMessageC.setText("Have a good day!");
                // System.out.println("Thank you for shopping at Jyo's!");
                // SnoopyMessageC.setText("Snoopy says: Have a good day!");
        }
        @FXML
        private void clearSelection(ActionEvent event) {
                SelectionMessageC.clear();
                SnoopyMessageC.clear();
                selectedItem = "";
                sItems = "";
                selectedPrice = 0.00;
                HomeController.selectedItemsList.clear();
                HomeController.totalSales.clear();
                selectedItemsPrice = 0.00;
        }
        // @FXML
        // protected void HomePage2(ActionEvent event) {
        //         try {   
        //                 FXMLLoader(getClass().getResource("new_screen_two.fxml")).hide();
        //                 FXMLLoader(getClass().getResource("MainView.fxml")).
        //                 Parent root = loader.load();
        //                 Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        //                 stage.show();
        //         } catch (IOException e) {
        //                 e.printStackTrace();
        //         }
        // }
        
        @FXML
    protected void HomePage2(javafx.event.ActionEvent event) {
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
        // protected void HomePage2(ActionEvent event) {
        // customerPage.setVisible(false);
        // adminPage.setVisible(false);
        // homePage.setVisible(true);
//     }
    
}
