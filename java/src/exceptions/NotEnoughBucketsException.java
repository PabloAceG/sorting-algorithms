package src.exceptions;

public class NotEnoughBucketsException extends Exception {
	
	private static final long serialVersionUID = -2992314427545935403L;

	public NotEnoughBucketsException(String message) {
		super(message);
	}
	
	public NotEnoughBucketsException(Throwable cause) {
		super(cause);
	}
	
	public NotEnoughBucketsException(String message, Throwable cause) {
		super(message, cause);
	}
}
