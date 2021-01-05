

/**
 * Ratish created the code 05-Jan-2020
 * Main class for invoking the payment records
 */

import calculate.CalculateRate;
import currency.Data;
import currency.Rate;

public class PaymentRecord {

	public static void main(String[] args) {
		//Testing
		//String[] filename = { "C:\\HSBC\\TestCode Workspace\\PaymentsRecordProject\\src\\payments.txt" };
		// filename[0] = "C:\\HSBC\\TestCode
		// Workspace\\PaymentsRecordProject\\src\\payments.txt";
		new CalculateRate(new Data(new Rate()), args);
	}
}