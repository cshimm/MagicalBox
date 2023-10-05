public class MagicalBoxDemo {
    public static void main(String[] args) {
        Box box = new Box(5.,5., 5.);
        box.addItem("Item1");
        box.addItem("Item1");
        box.addItem("Item3");
        box.addItem("Item4");
        box.addItem("Item5");
        box.addItem("Item6");
        box.addItem("Item7");
        box.addItem("Item8");
        box.addItem("Item9");
        box.addItem("Item10");
        System.out.println("\n***************Before Deletion*****************");
        box.printItems();
        box.addItem("Item11");
        box.removeItem("Item1");
        box.removeItem("Item3");
        box.removeItem("Item7");
        box.removeItem(8);
        box.removeItem("Item10");
        System.out.println("\n***************After Deletion*****************");
        box.printItems();
        box.removeItem("Item99");
        System.out.println("\nBox Volume: " + box.volume());
    }
}
