README.txt - explain how to compile and run your project, clearly explain any additional features in this file

The project consists of 3 screen which include the main, admin panel and the customer view. The inital screen 
prompts the user to take any action on which kind of user they are. Based on the user input, the code will take 
them to the admin panel or the customer panel.

The customer panel has the following functions: selecting items, deselecting items, paying, checking avaliabilty of an item.
The user can select the items and when he/she is ready to pay, they can click the pay button which will save the transaction in 
the system for the admin to view. The system also spits out when there is an item that it out of stock. 
Furthermore, there are multiple other feature that were in the process of implementation which include
displaying the selected items, and the shop vendor's message (Snoopy's message) on the customer page.

The admin panel consists of refilling each item, shows the summary of the sales, and displays the most or the least brought drink. 
The summary include the number of things sold, their revenue, and the total income all displyed in multiple boxes. 

Apart from the functionailty, most of the code is divided among the three controllers (AmdinController.java, HomeController.java, and CustomerController.java) 
which has all the logic, while MainView.fxml, new_screen_two.fxml, and new_screen.fxml implement the logic from Controllers and their own UI Componenets. 
They also utilize the styles.css to prompt better display. 

We also utilize an Item class that implements a new item for every kind of objects. For, instance "Coke" will have the following properties 
name, price, quantity (avaliabilty), numberSold, and revenue of the item. The other classes in the Controller utilize Item class to maintain the functionaly of
the program.


-- additional descriptions for gradescope:
AdminController.java: 
The AdminController makes sure the restock buttons is working correctly and displays the amount of avalible quantities and the revenue generated to the admin.
Furthermore, it attempts to get the values from the inventory from HomeController but wasn't able to retrive the data due how the visibility of the files is processed.
So in order to over come the chanllenge, we have a public class called Stock.java which stores the updated value


CustomerController.java:
The customercontroller handles all the logic for the customer page with include the purchase, selling, veiwing avalibility. This includes getting a grilledcheese from the 
second rack of Grilledcheese if the first one is empty. It handles multiple things like making a selection but doesn't update the inventory until the purchase button is pressed.
It has the home button and also has a clear selection message.

HomeController.java:
The homeController handles all the fippling with the pages and it handles the initial screen toggles.

Item.java:
The iterm.java implements a new item for every kind of objects. For, instance "Coke" will have the following properties 
name, price, quantity (avaliabilty), numberSold, and revenue of the item. The other classes in the Controller utilize Item class to maintain the functionaly of
the program.

Stock.java:
The Stock.java keeps track of the inventory and makes sure the update values are passed accorss from customer and admin. This is done because using the hide and show between pages isn't 
working out and caused multiple errors. Thus, this was a back up option.

inventory defined:
The inventory keeps track of the sales and updates the stock class.

MainView.fxml:
Contains the visual for the foodtruck screen with the admin and customer buttons. This file was edited in scene builder.

new_screen_two.fxml:
Contains the visual for the Customer screen with the buy, make selection, clear and more buttons. This file was edited in scene builder.

new_screen.fxml:
Contains the visual for the admin screenn with the buttons refill, summary and a replace suggestion. This file was edited in scene builder.

Styles.css:
The styles.css is utilized across all platforms (fxml files) to make the buttons look pretty.
