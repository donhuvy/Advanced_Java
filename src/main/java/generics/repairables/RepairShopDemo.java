package generics.repairables;

import java.util.Arrays;

/**
 * Repair shop demo.
 *
 * @author Ken Kousen
 */
public class RepairShopDemo {

    public static void main(String[] args) {
        RepairShop.fixAll(Arrays.asList(
                new Toaster(), new Blender(), new Furniture()));
    }

}
