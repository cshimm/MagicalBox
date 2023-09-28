public class Main {
    public static void main(String[] args) {
        Box box = new Box(10.,10., 10.);
        box.addItem("Test1");
        box.addItem("Test2");
        box.addItem("Test3");
        box.addItem("Test4");
        System.out.println("***************Before Deletion*****************");
        box.printItems();
        box.removeItem("Test1");
        box.removeItem("Test3");
        System.out.println("***************After Deletion*****************");
        box.printItems();
    }
}
