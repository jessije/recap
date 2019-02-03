package recap.task11;

public class Task11Util {

    public void view(String[] items) {
        for (int counter = 0; counter < items.length; counter++) {
            if (!items[counter].isEmpty()) {
                System.out.print(items[counter] + " ");
            }
        }
        System.out.println();
    }


    public void search(String searchItem, String[] items) {
        boolean foundItem = false;
        for (int counter = 0; counter < items.length; counter++) {
            if (items[counter].equalsIgnoreCase(searchItem)) {
                System.out.println("Item located at index: " + counter);
                foundItem = true;
            }
        }
        if (!foundItem) {
            System.out.println("There is no such item in the list");
        }
    }

    public String[] add(String itemAdded, String[] items) {
        for (int counter = 0; counter < items.length; counter++) {
            if (items[counter].equalsIgnoreCase(itemAdded)) {
                System.out.println("Item located at index " + counter + " No need to add.");
                return items;
            }
        }
        for (int counter = 0; counter < items.length; counter++) {
            if (items[counter].isEmpty()) {
                items[counter] = itemAdded;
                System.out.println("Item added");
                return items;
            }
        }

        System.out.println("Array is full. We cannot add any item.");
        return items;
    }

    public String[] remove(String itemRemoved, String[] items) {
        for (int counter = 0; counter < items.length; counter++) {
            if (items[counter].equalsIgnoreCase(itemRemoved)) {
                System.out.println("Item located at index " + counter);
                items[counter] = "";
                System.out.println("item removed");
                return items;
            }
        }
        System.out.println("item not found");
        return items;
    }
}




