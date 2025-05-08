// package app;

public class Item {
        // inventory Class
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
                if (amount < 32) {
                        this.quantity = 32;
                }
        }

        public void restock(int amount) {
                if (amount < 16) {
                        this.quantity = 16;
                }
        }
}
