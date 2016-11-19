package concurrency.blockingqueue;

/**
 * Message.
 *
 * @author Ken Kousen
 */
public final class Message {

    private final int id;

    public Message(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

}
