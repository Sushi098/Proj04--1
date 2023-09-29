package in.co.rays.proj4.Exception;
/**
 * DatabaseException is propogated by DAO classes when an unhandled Database
 * exception occurred
 *
 * @author Sushmita Gohiya
 *
 */
public class DatabaseException extends Exception {
	/**
     *            : Error message
     */
	 public DatabaseException(String msg) {
	        super(msg);
	    }
}