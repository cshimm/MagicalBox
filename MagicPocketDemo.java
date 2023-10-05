public class MagicPocketDemo {
    public static void main(String[] args) {
        MagicPocket magicPocket = new MagicPocket();
        magicPocket.addItem("Item1");
        magicPocket.addItem("Item2");
        magicPocket.addItem("Item3");
        magicPocket.addItem("Item4");

        System.out.println("\nNum items: " + magicPocket.getNumItems());
        magicPocket.printItems();
        magicPocket.removeItem("Item2");
        magicPocket.removeItem(2);
        System.out.println("\nNum items: " + magicPocket.getNumItems());
        magicPocket.printItems();
    }
}
