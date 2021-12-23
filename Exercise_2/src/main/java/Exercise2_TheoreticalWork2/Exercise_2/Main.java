package Exercise2_TheoreticalWork2.Exercise_2;

public class Main {

	public static void main(String[] args) {

		int age = 0;
		boolean ill_Suspected = false;
		boolean essential = false;
		int IA = 340;
		double default_price = 7.50;
		int seats = 50;
		
		TransportPlan plan = new TransportPlan(IA, default_price, seats);
		try {
		double clientPrice = plan.calculatePrice(age, ill_Suspected, essential);
		System.out.println(clientPrice);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}