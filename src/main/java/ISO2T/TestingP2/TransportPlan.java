package ISO2T.TestingP2;

public class TransportPlan {

	private int Age = 0;
	private int IA = 0;
	private boolean Ill_Suspected = false;
	private int OcupiedSeats = 0;

	// Getters

	public int getAge() {
		return Age;
	}

	public int getIA() {
		return IA;
	}

	public boolean getIll_Suspected() {
		return Ill_Suspected;
	}

	public int getOcupiedSeats() {
		return OcupiedSeats;
	}

	// Setters

	public void setAge(int Age) {
		this.Age = Age;
	}

	public void setIA(int IA) {
		this.IA = IA;
	}

	public void SetIll_Suspected(boolean Ill_Suspected) {
		this.Ill_Suspected = Ill_Suspected;
	}

	public void setOcupiedSeats(int OcupiedSeats) {
		this.OcupiedSeats = OcupiedSeats;
	}

	// Methods

	public double GetPrice() {

		double Price = 8;
		int Seats = 60;

		if (Ill_Suspected = false) {

			if (IA < 100) { // level 0

				if (Age < 23 && Seats > OcupiedSeats) {
					Price = Price - (Price * 0.6);
				} else if (Age > 65 && Seats > OcupiedSeats) {
					Price = Price - (Price * 0.8);
				} else {
					// Exception
				}

			} else if (100 < IA && IA < 200) { // level 1

				Seats = (int) (Seats * 0.8);

				if (Age < 23 && Seats > OcupiedSeats) {
					Price = Price - (Price * 0.3);
				} else if (Age > 65 && Seats > OcupiedSeats) {
					Price = Price - (Price * 0.5);
				} else {
					// Exception
				}

			} else if (201 < IA && IA < 300) { // level 2

				Seats = (int) (Seats * 0.6);
				Seats = (int) (Seats - (Seats * 0.6));

				if (Age < 23 && Seats > OcupiedSeats) {
					Price = Price * 1;
				} else if (Age > 65 && Seats > OcupiedSeats) {
					Price = Price + (Price * 0.2);
				} else {
					// Exception
				}

			} else if (301 < IA && IA < 500) { // level 3

				Seats = (int) (Seats * 0.4);
				Seats = (int) (Seats - (Seats * 0.8));

				if (Age < 23 && Seats > OcupiedSeats) {
					Price = Price + (Price * 0.2);
				} else if (Age > 65 && Seats > OcupiedSeats) {
					Price = Price + (Price * 0.5);
				} else {
					// Exception
				}

			} else if (IA > 501) { // level 4

				Seats = (int) (Seats * 0.3);
				Seats = (int) (Seats - (Seats * 0.9));

				if (Age < 23 && Seats > OcupiedSeats) {
					Price = Price + (Price * 0.5);
				} else if (Age > 65 && Seats > OcupiedSeats) {
					// Exception
				} else {
					// Exception
				}
			}

			return Price;

		} else {

			// Exception

			return 0.0;
		}
	}

}
