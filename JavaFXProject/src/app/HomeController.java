
// package app;
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

public class HomeController {
    @FXML
    private Label welcomeText;
    // @FXML
    // private Button Customer;

    // @FXML
    // private Button Admin;

    public String selectedItem = "";
    public double selectedPrice = 0.0;

    public static Map<String, Item> inventory = new HashMap<>();
    public static ArrayList<String> selectedItemsList = new ArrayList<>();
    public static ArrayList<ArrayList<String>> AllItemsSold = new ArrayList<>();
    public double selectedItemsPrice = 0.0;
    public static ArrayList<Double> totalSales = new ArrayList<>();

    public static Map<String, Integer> drinks = new HashMap<>();
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

    @FXML
    protected void AdminView(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("new_screen.fxml"));
            Parent root = loader.load();
            AdminController c = loader.getController();
            // c.updateInventory(HomeController.inventory);
            Stage stage = (Stage) welcomeText.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void CustomerView(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("new_screen_two.fxml"));
            Parent root = loader.load();
            CustomerController cap = loader.getController();
            // cap.updateInventory(HomeController.inventory);
            Stage stage = (Stage) welcomeText.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void HomePage1(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MainView.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
