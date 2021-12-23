package Exercise2_TheoreticalWork2.Exercise_2;

import static org.junit.Assert.assertEquals;
import org.junit.rules.ExpectedException;

import org.junit.Rule;
import org.junit.Before;
import org.junit.Test;

public class TestTransportPlan {

	private TransportPlan t;

	@Before
	public void setUp() throws Exception {
		t = new TransportPlan(0, 7, 40);
	}

	@Test
	public void testIA() {
		assertEquals(t.getIA(), 0);
		t.setIA(200);
		assertEquals(t.getIA(), 200);
	}

	@Test
	public void testSt_price() {
		assertEquals(t.getSt_price(), 7, 0);
		t.setSt_price(8);
		assertEquals(t.getSt_price(), 8, 0);
	}

	@Test
	public void testSeats() {
		assertEquals(t.getSeats(), 40);
		t.setSeats(50);
		assertEquals(t.getSeats(), 50);
	}

	@Test
	public void testGetPrice() throws InvalidPassenger {

		assertEquals(t.calculatePrice(24, false, false), 7.0, 0);
	}

    //Exception testing

    @Rule
    public ExpectedException exception = ExpectedException.none();
     
    @Test
    public void testUsernameTooShort() throws InvalidPassenger {
        exception.expect(InvalidPassenger.class);
        exception.expectMessage("You can't travel.");
         
        t.calculatePrice(24, true, false);
    }

    
	public void testCalculatePrice() throws InvalidPassenger{
		t.calculatePrice(-80000, false, false);
		t.calculatePrice(-65535, false, false);
		t.calculatePrice(-65534, false, false);
		t.calculatePrice(-65536, false, false);
		t.calculatePrice(-60000, false, false);
		t.calculatePrice(-1, false, false);
		t.calculatePrice(0, false, false);
		t.calculatePrice(1, false, false);
		t.calculatePrice(22, false, false);
		t.calculatePrice(23, false, false);
		t.calculatePrice(24, false, false);
		t.calculatePrice(65, false, false);
		t.calculatePrice(64, false, false);
		t.calculatePrice(66, false, false);
		t.calculatePrice(60000, false, false);
		t.calculatePrice(65535, false, false);
		t.calculatePrice(65534, false, false);
		t.calculatePrice(65536, false, false);
		t.calculatePrice(80000, false, false);
	}
	
	@Test
	public void test1() throws InvalidPassenger {
		//toda una ejecucion del programa
		int age = 0;
		boolean ill_Suspected = false;
		boolean essential = false;
		int IA = 340;
		double default_price = 7.50;
		int seats = 50;
		
		TransportPlan plan = new TransportPlan(IA, default_price, seats);
		assertEquals(24.8, plan.calculatePrice(age, ill_Suspected, essential),0);
	}

}