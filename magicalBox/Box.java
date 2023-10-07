package magicalBox;

public class Box {
    final private double width;
    final private double height;
    final private double depth;
    private final String[] inventory = new String[10];

    public Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    public final double volume() {
        return width * height * depth;
    }

    public final boolean addItem(String item) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {
                inventory[i] = item;
                return true;
            }
        }
        return false;
    }

    public final int removeItem(String item) {
        int itemsRemoved = 0;
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] != null && inventory[i].equals(item)) {
                inventory[i] = null;
                itemsRemoved++;
            }
        }
        return itemsRemoved;
    }

    public final boolean removeItem(int index) {
        if ((index >= 0) && (index < inventory.length) && (inventory[index] != null)) {
            inventory[index] = null;
            return true;
        }
        return false;
    }

    public final void printItems() {
        for (String item : inventory) {
            System.out.println(item);
        }
    }
}