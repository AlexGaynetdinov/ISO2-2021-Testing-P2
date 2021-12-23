package App;

import Exceptions.InvalidPassenger;

public class TransportPlan {
	
	private int IA;
	private double price;
	private int seats;
	
	
	public TransportPlan(int IA, double price, int seats) {
		this.IA = IA;
		this.price = price;
		this.seats = seats;
	}

	// Setters

	public void setIA(int IA) {
		this.IA = IA;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}

	// Methods

	public double GetPrice(int age, boolean ill_suspected, boolean essential) throws InvalidPassenger {

		int ocupiedSeats = 0;

		if (ill_suspected = false) {

			if (IA < 100) { // level 0

				if (age < 23 && seats > ocupiedSeats) {
					price = price - (price * 0.6);
				} else if (age > 65 && seats > ocupiedSeats) {
					price = price - (price * 0.8);
				} else if (23 < age && age < 65 && seats > ocupiedSeats) {
					price = 8;
				} else {
					throw new InvalidPassenger("You can't travel.");
				}

			} else if (100 < IA && IA < 200) { // level 1

				seats = (int) (seats * 0.8);

				if (age < 23 && seats > ocupiedSeats) {
					price = price - (price * 0.3);
				} else if (age > 65 && seats > ocupiedSeats) {
					price = price - (price * 0.5);
				} else if (23 < age && age < 65 && seats > ocupiedSeats) {
					price = 8;
				} else {
					throw new InvalidPassenger("You can't travel.");
				}

			} else if (201 < IA && IA < 300) { // level 2

				seats = (int) (seats * 0.6);

				if (essential = false) {

					seats = (int) (seats - (seats * 0.6));

					if (age < 23 && seats > ocupiedSeats) {
						price = price * 1;
					} else if (age > 65 && seats > ocupiedSeats) {
						price = price + (price * 0.2);
					} else if (23 < age && age < 65 && seats > ocupiedSeats) {
						price = 8;
					} else {
						throw new InvalidPassenger("You can't travel.");
					}

				} else {

					if (age < 23 && seats > ocupiedSeats) {
						price = price * 1;
					} else if (age > 65 && seats > ocupiedSeats) {
						price = price + (price * 0.2);
					} else if (23 < age && age < 65 && seats > ocupiedSeats) {
						price = 8;
					} else {
						throw new InvalidPassenger("You can't travel.");
					}
				}

			} else if (301 < IA && IA < 500) { // level 3

				seats = (int) (seats * 0.4);

				if (essential = false) {

					seats = (int) (seats - (seats * 0.8));

					if (age < 23 && seats > ocupiedSeats) {
						price = price + (price * 0.2);
					} else if (age > 65 && seats > ocupiedSeats) {
						price = price + (price * 0.5);
					} else if (23 < age && age < 65 && seats > ocupiedSeats) {
						price = 8;
					} else {
						throw new InvalidPassenger("You can't travel.");
					}

				} else {

					if (age < 23 && seats > ocupiedSeats) {
						price = price + (price * 0.2);
					} else if (age > 65 && seats > ocupiedSeats) {
						price = price + (price * 0.5);
					} else if (23 < age && age < 65 && seats > ocupiedSeats) {
						price = 8;
					} else {
						throw new InvalidPassenger("You can't travel.");
					}
				}

			} else if (IA > 501) { // level 4

				seats = (int) (seats * 0.3);

				if (essential = false) {

					seats = (int) (seats - (seats * 0.9));

					if (age < 23 && seats > ocupiedSeats) {
						price = price + (price * 0.5);
					} else if (age > 65 && seats > ocupiedSeats) {
						throw new InvalidPassenger("You can't travel.");
					} else if (23 < age && age < 65 && seats > ocupiedSeats) {
						price = 8;
					} else {
						throw new InvalidPassenger("You can't travel.");
					}

				} else {

					if (age < 23 && seats > ocupiedSeats) {
						price = price + (price * 0.5);
					} else if (age > 65 && seats > ocupiedSeats) {
						throw new InvalidPassenger("You can't travel.");
					} else if (23 < age && age < 65 && seats > ocupiedSeats) {
						price = 8;
					} else {
						throw new InvalidPassenger("You can't travel.");
					}
				}
			}

			ocupiedSeats += 1;
			return price;

		} else {

			throw new InvalidPassenger("You can't travel.");

		}
	}

}
