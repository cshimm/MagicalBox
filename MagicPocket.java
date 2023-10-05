import java.util.ArrayList;

public class MagicPocket implements Storage {
    private final ArrayList<String> inventory = new ArrayList<>();
    public void addItem(String itemName) {
        inventory.add(itemName);
    }
    public void removeItem(String itemName) {
        inventory.remove(itemName);
    }
    public void removeItem(int index) { inventory.remove(index); }

    public void printItems() {
        for (String item: inventory) {
            System.out.println(item);
        }
    }

    public int getNumItems() {
        return inventory.size();
    }
}
