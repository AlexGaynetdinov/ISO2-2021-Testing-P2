package App;

import Exceptions.InvalidPassenger;

public class TransportPlan {

	private int Age = 0;
	private boolean Ill_Suspected = false;
	private boolean Essential = false;

	// Getters

	public int getAge() {
		return Age;
	}

	public boolean getIll_Suspected() {
		return Ill_Suspected;
	}

	public boolean Essential() {
		return Essential;
	}

	// Setters

	public void setAge(int Age) {
		this.Age = Age;
	}

	public void SetIll_Suspected(boolean Ill_Suspected) {
		this.Ill_Suspected = Ill_Suspected;
	}

	public void Essential(boolean Essential) {
		this.Essential = Essential;
	}

	// Methods

	public double GetPrice() throws InvalidPassenger {

		int IA = 340;
		double Price = 8;
		int Seats = 60;
		int OcupiedSeats = 20;

		if (Ill_Suspected = false) {

			if (IA < 100) { // level 0

				if (Age < 23 && Seats > OcupiedSeats) {
					Price = Price - (Price * 0.6);
				} else if (Age > 65 && Seats > OcupiedSeats) {
					Price = Price - (Price * 0.8);
				} else if (23 < Age && Age < 65 && Seats > OcupiedSeats) {
					Price = 8;
				} else {
					throw new InvalidPassenger("You can't travel.");
				}

			} else if (100 < IA && IA < 200) { // level 1

				Seats = (int) (Seats * 0.8);

				if (Age < 23 && Seats > OcupiedSeats) {
					Price = Price - (Price * 0.3);
				} else if (Age > 65 && Seats > OcupiedSeats) {
					Price = Price - (Price * 0.5);
				} else if (23 < Age && Age < 65 && Seats > OcupiedSeats) {
					Price = 8;
				} else {
					throw new InvalidPassenger("You can't travel.");
				}

			} else if (201 < IA && IA < 300) { // level 2

				Seats = (int) (Seats * 0.6);

				if (Essential = false) {

					Seats = (int) (Seats - (Seats * 0.6));

					if (Age < 23 && Seats > OcupiedSeats) {
						Price = Price * 1;
					} else if (Age > 65 && Seats > OcupiedSeats) {
						Price = Price + (Price * 0.2);
					} else if (23 < Age && Age < 65 && Seats > OcupiedSeats) {
						Price = 8;
					} else {
						throw new InvalidPassenger("You can't travel.");
					}

				} else {

					if (Age < 23 && Seats > OcupiedSeats) {
						Price = Price * 1;
					} else if (Age > 65 && Seats > OcupiedSeats) {
						Price = Price + (Price * 0.2);
					} else if (23 < Age && Age < 65 && Seats > OcupiedSeats) {
						Price = 8;
					} else {
						throw new InvalidPassenger("You can't travel.");
					}
				}

			} else if (301 < IA && IA < 500) { // level 3

				Seats = (int) (Seats * 0.4);

				if (Essential = false) {

					Seats = (int) (Seats - (Seats * 0.8));

					if (Age < 23 && Seats > OcupiedSeats) {
						Price = Price + (Price * 0.2);
					} else if (Age > 65 && Seats > OcupiedSeats) {
						Price = Price + (Price * 0.5);
					} else if (23 < Age && Age < 65 && Seats > OcupiedSeats) {
						Price = 8;
					} else {
						throw new InvalidPassenger("You can't travel.");
					}

				} else {

					if (Age < 23 && Seats > OcupiedSeats) {
						Price = Price + (Price * 0.2);
					} else if (Age > 65 && Seats > OcupiedSeats) {
						Price = Price + (Price * 0.5);
					} else if (23 < Age && Age < 65 && Seats > OcupiedSeats) {
						Price = 8;
					} else {
						throw new InvalidPassenger("You can't travel.");
					}
				}

			} else if (IA > 501) { // level 4

				Seats = (int) (Seats * 0.3);

				if (Essential = false) {

					Seats = (int) (Seats - (Seats * 0.9));

					if (Age < 23 && Seats > OcupiedSeats) {
						Price = Price + (Price * 0.5);
					} else if (Age > 65 && Seats > OcupiedSeats) {
						throw new InvalidPassenger("You can't travel.");
					} else if (23 < Age && Age < 65 && Seats > OcupiedSeats) {
						Price = 8;
					} else {
						throw new InvalidPassenger("You can't travel.");
					}

				} else {

					if (Age < 23 && Seats > OcupiedSeats) {
						Price = Price + (Price * 0.5);
					} else if (Age > 65 && Seats > OcupiedSeats) {
						throw new InvalidPassenger("You can't travel.");
					} else if (23 < Age && Age < 65 && Seats > OcupiedSeats) {
						Price = 8;
					} else {
						throw new InvalidPassenger("You can't travel.");
					}
				}
			}

			return Price;

		} else {

			throw new InvalidPassenger("You can't travel.");

		}
	}

}
