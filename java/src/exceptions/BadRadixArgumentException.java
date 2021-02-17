package src.exceptions;

public class BadRadixArgumentException extends Exception {

	private static final long serialVersionUID = -2885219591623713351L;

	public BadRadixArgumentException(String message) {
		super(message);
	}
	
	public BadRadixArgumentException(Throwable cause) {
		super(cause);
	}
	
	public BadRadixArgumentException(String message, Throwable cause) {
		super(message, cause);
	}
}
 