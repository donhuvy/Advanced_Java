package exceptions;

/**
 * My own exception class.
 *
 * @author Ken Kousen
 */
public class MyException extends Exception {

    public MyException() {
        this("default message");
    }

    public MyException(String message) {
        super(message);
    }

}
