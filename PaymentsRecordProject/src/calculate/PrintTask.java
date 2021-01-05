package calculate;

/**
 * Ratish created the code 05-Jan-2020
 * Class for printing the output
 */

import java.util.TimerTask;

import currency.Data;

public class PrintTask extends TimerTask {
	private Data data;

	public PrintTask(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		System.out.println(data);
	}
}