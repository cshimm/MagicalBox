package test;

import magicalBox.Box;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

    /**
     * Box Created Successfully<hr/>
     * <p>
     * Test to verify the Box class constructor
     * instantiates a valid box object
     * </p>
     */
    @Test
    void boxCreatedSuccessfully() {
        // Create box object
        Box box = new Box(1., 1., 1.);

        // Assert that the box object is not null
        assertNotNull(box);
    }

    /**
     * Volume<hr/>
     * <p>
     * Test to ensure the correct volume is returned
     * when provided with width, height and depth double values
     * </p>
     */
    @Test
    void volume() {
        //Create box object
        Box box = new Box(5., 5., 5.);

        // Calculate and save the volume
        double volume = box.volume();

        assertEquals(125., volume);
    }

    /**
     * Add Item With Room<hr/>
     * <p>
     * Test to ensure items are successfully added to the box object
     * when there is room in the box object
     * </p>
     */
    @Test
    void addItemWithRoom() {
        // Create box object
        Box box = new Box(1., 1., 1.);

        // Get the result of adding an item
        boolean itemAdded = box.addItem("Item");

        assertTrue(itemAdded);
    }

    /**
     * Add Item Without Room<hr/>
     * <p>
     * Test to ensure items are not successfully added
     * when the box object is full
     * </p>
     */
    @Test
    void addItemWithoutRoom() {
        // Create box object
        Box box = new Box(1., 1., 1.);

        // Fill the box with 10 items
        for (int i = 0; i < 10; i++) {
            box.addItem("Item" + i);
        }
        // Get the result from trying to add one more
        boolean itemAdded = box.addItem("Item11");

        // addItem should have returned false to the itemAdded variable
        assertFalse(itemAdded);
    }

    /**
     * Remove Item Not In Box<hr/>
     * <p>
     * Test to ensure items are not successfully
     * removed from the box object when item doesn't
     * exist in the box object.
     * </p>
     */
    @Test
    void removeItemNotInBox() {
        // Create box object
        Box box = new Box(1., 1., 1.);

        // Get the number of items removed from passing in a String argument
        int numItemsRemoved_StringArg = box.removeItem("Item");
        // Get boolean result from passing in an index argument
        boolean itemRemoved_IndexArg = box.removeItem(0);

        // Since the box was empty, 0 is expected for the String overload
        assertEquals(0, numItemsRemoved_StringArg);
        // Since the box was empty, false is expected from the index overload
        assertFalse(itemRemoved_IndexArg);
    }

    /**
     * Remove Item With String Argument<hr/>
     * <p>
     * Test to ensure items are successfully
     * removed from the box object with a String argument
     * </p>
     */
    @Test
    void removeItemWithStringArg() {
        // Define item to remove
        String itemToRemove = "Item1";

        // Create box object and add item to remove
        Box box = new Box(1., 1., 1.);
        box.addItem(itemToRemove);

        // Determine the number of items removed
        int numItemsRemoved = box.removeItem(itemToRemove);

        assertEquals(1, numItemsRemoved);
    }

    /**
     * Remove Many Identical Items<hr/>
     * <p>
     * Test to ensure all items are successfully
     * removed from the box object with a String argument
     * </p>
     */
    @Test
    void removeManyIdenticalItems() {
        // Define the item to remove and the number
        String itemToRemove = "Item1";
        // Define the number of identical items to remove
        int numItemsAdded = 3;

        // Create box object
        Box box = new Box(1., 1., 1.);

        // Add identical objects to the box for removal
        for (int i = 0; i < numItemsAdded; i++) {
            box.addItem(itemToRemove);
        }

        // Determine the number of items that are removed
        int numItemsRemoved = box.removeItem(itemToRemove);
        assertEquals(numItemsAdded, numItemsRemoved);
    }

    /**
     * Remove Item With Index Argument<hr/>
     * <p>
     * Test to ensure items are successfully
     * removed from the box object with an index argument
     * </p>
     */
    @Test
    void removeItemWithIndexArg() {
        String itemToRemove = "Item1"; // Define the item to remove
        Box box = new Box(1., 1., 1.); // Create new box
        box.addItem(itemToRemove); //Add item to remove to box
        box.addItem(itemToRemove); //Add item to remove to box

        //Get the result from trying to remove the item using an index
        boolean firstItemRemoved = box.removeItem(0);
        boolean secondItemRemoved = box.removeItem(1);

        assertTrue(firstItemRemoved);
        assertTrue(secondItemRemoved);

        // removeItem will return false when an out-of-bounds index is passed
        assertFalse(box.removeItem(11));
        assertFalse(box.removeItem(-1));
    }
}