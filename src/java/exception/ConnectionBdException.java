package exception;

/**
 *
 * @author iamouzeg
 */
public class ConnectionBdException extends Exception{

    public ConnectionBdException() {
        super("connection a la base de donnée impossible");
    }
    
}