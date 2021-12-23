package Exceptions;

public class InvalidPassenger extends Exception {
	public InvalidPassenger() {

	}

	public InvalidPassenger(String description) {
		super(description);
	}

}
