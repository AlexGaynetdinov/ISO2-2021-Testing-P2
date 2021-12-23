package App;

public class Main {

	public static void main(String[] args) {

		int age = 0;
		boolean ill_Suspected = false;
		boolean essential = false;
		int IA = 340;
		double default_price = 7.50;
		int seats = 50;
		
		TransportPlan plan = new TransportPlan(0, 7, 40);
		try {
		double clientPrice = plan.calculatePrice(24, ill_Suspected, essential);
		System.out.println(clientPrice);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
