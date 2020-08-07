package Bank;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AccountTest {

	Account acc;
	
	@Test
	public void testGetBalance() {
		// newly created default account has balance of 0.0
		Account tacc1 = new Account();
		assertEquals(0.0, tacc1.getBalance(), 0.0);
		
		// newly created account has balance of 0.0
		Account tacc2 = new Account("001", "temp account 2", 1000.0);
		assertEquals(1000.0, tacc2.getBalance(), 0.0);

		// newly created account has balance of 0.0
		Account tacc3 = new Account("002", "temp account 3", 250.5);
		assertEquals(250.5, tacc3.getBalance(), 0.0);
	}
	
	@Test
	public void testDeposit() {
		acc = new Account();
		
		acc.deposit(550.5);	//deposit $550.5 into the test account 
		assertEquals(550.5, acc.getBalance(), 0.0);
		
		acc.deposit(20.5);	//deposit $20.5 into the test account
		assertEquals(571.0, acc.getBalance(), 0.0);
		
		acc.deposit(0.0);	//deposit $0.0 should not change the balance
		assertEquals(571.0, acc.getBalance(), 0.0);
	}

	@Test
	public void testWithdraw() {
		acc = new Account("003", "temp account 4", 571.0);
		
		acc.withdraw(0.0);	//withdraw $0.0 should not change the balance
		assertEquals(571.0, acc.getBalance(), 0.0);
		
		acc.withdraw(550.5);	//withdraw $550.5 into the test account 
		assertEquals(20.5, acc.getBalance(), 0.0);
		
		acc.withdraw(20.5);	//withdraw $20.5 into the test account
		assertEquals(0.0, acc.getBalance(), 0.0);
	}

}
