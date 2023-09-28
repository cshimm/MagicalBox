public class Box {
    final private double width;
    final private double height;
    final private double depth;
    String[] inventory = new String[10];

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    public double volume() {
        return width * height * depth;
    }

    public void addItem(String item) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {
                inventory[i] = item;
                break;
            }
        }
    }

    public void removeItem(String item) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) continue;
            if (inventory[i].equals(item)) {
                inventory[i] = null;
            }
        }
    }

    public void printItems() {
        for (String item : inventory) {
            System.out.println(item);
        }
    }

}