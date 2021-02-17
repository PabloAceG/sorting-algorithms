package src.exceptions;

public class BadArgumentTypeException extends Exception {

	private static final long serialVersionUID = -1810155361801278476L;

	public BadArgumentTypeException(String message) {
		super(message);
	}
	
	public BadArgumentTypeException(Throwable cause) {
		super(cause);
	}
	
	public BadArgumentTypeException(String message, Throwable cause) {
		super(message, cause);
	}
}
