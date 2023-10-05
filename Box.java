public class Box {
    final private double width;
    final private double height;
    final private double depth;
    private final String[] inventory = new String[10];

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
            if (i == inventory.length - 1) {
                System.out.println("\nCan't add " + item + ": Box is full");
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
    public void removeItem(int index){
        inventory[index] = null;
    }

    public void printItems() {
        for (String item : inventory) {
            System.out.println(item);
        }
    }

}