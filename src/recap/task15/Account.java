package recap.task15;

public class Account {
    public static void main(String[] args) {
        String[] items = {"Headset", "Meat", "Pineapple", "Book", "Dinner Coupon"};
        double[] prices = {20.04, 2.2, 3.5, 14.67, 18.02};
        System.out.println("Welcome to Ebay, your items are published");
        for (int i = 0; i < items.length; i++) {
            System.out.println("Auctioned item: " + items[i] + " " + "Price: " + prices[i]);
        }
        System.out.println("---------------------------------------");

        int IndexofSold = 3;

    }
}
