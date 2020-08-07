package Bank;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CreditAccountTest {
	CreditAccount creAcc;

	@Test
	public void testChargeInterest() {
		CreditAccount creAcc1 = new CreditAccount("001", "Credit Account 1", 500.0, 10, 5000.0);
		// interest should equal balance + balance*interest_rate
		assertEquals(500.0, creAcc1.getBalance(), 0.0);
		creAcc1.chargeInterest();
		assertEquals(500.0*10/100+500.0, creAcc1.getBalance(), 0.0);
		
		CreditAccount creAcc2 = new CreditAccount("002", "Credit Account 2", 0.0, 10, 5000.0);
		// when balance is 0 there should be no interest added
		assertEquals(0.0, creAcc2.getBalance(), 0.0);
		creAcc2.chargeInterest();
		assertEquals(0.0, creAcc2.getBalance(), 0.0);
		
		CreditAccount creAcc3 = new CreditAccount("003", "Credit Account 3", 500.0, 0, 5000.0);
		// when interest rate is 0 there should be no interest added
		assertEquals(500.0, creAcc3.getBalance(), 0.0);
		creAcc3.chargeInterest();
		assertEquals(500.0, creAcc3.getBalance(), 0.0);
	}
}
