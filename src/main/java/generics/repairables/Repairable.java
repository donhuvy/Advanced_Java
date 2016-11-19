package generics.repairables;

/**
 * Repairable.
 *
 * @author Ken Kousen
 */
public interface Repairable {

    default void fix() {
        System.out.println("fixing " + this.getClass().getName());
    }

}
