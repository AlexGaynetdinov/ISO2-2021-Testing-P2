package App;

public class Main {

	public static void main(String[] args) {

		int age = 0;
		boolean ill_Suspected = false;
		boolean essential = false;
		int IA = 340;
		double price = 7.50;
		int seats = 50;
		
		TransportPlan plan = new TransportPlan(IA, price, seats);
		try {
		double clientPrice = plan.GetPrice(age, ill_Suspected, essential);
		System.out.println(clientPrice);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
