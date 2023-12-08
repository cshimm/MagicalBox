package magicalBox;

public class MagicPocketDemo {
    public static void main(String[] args) {
        MagicPocket magicPocket = new MagicPocket();

        int[] testValues = {10,100,1000};
        System.out.println("Add n items");
        for (var value:testValues) {
            long start = System.nanoTime();
            for (int i = 0; i < value; i++)
                magicPocket.addItem(String.valueOf(i));
            System.out.println("n = " + value + ": " + (System.nanoTime() - start) + " ns");
        }
        System.out.println();
        System.out.println("Remove n items");
        for (var value:testValues) {
            long start = System.nanoTime();
            for (int i = 0; i < value; i++)
                magicPocket.removeItem(String.valueOf(i));
            System.out.println("n = " + value + ": " + (System.nanoTime() - start) + " ns");
        }

    }
}
