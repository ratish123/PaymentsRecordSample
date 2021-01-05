package calculate;

/**
 * Ratish created the code 05-Jan-2020
 * Class for retrieving the calculated data based on timer
 */

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import currency.Data;

public class CalculateRate {
	final private Scanner scanner = new Scanner(System.in);
	final private int minute = 1000 * 60; // 1 minute
	final private String CMD_QUIT = "quit";

	public CalculateRate(Data data, String[] args) {
		if (args.length > 0)
			data.addFromFile(args[0]);
		TimerTask timerTask = new PrintTask(data);
		Timer timer = new Timer(true);
		timer.scheduleAtFixedRate(timerTask, 0, minute);
		while (true) {
			String line = scanner.nextLine();
			if (line.equalsIgnoreCase(CMD_QUIT))
				break;
			data.processLine(line);
		}
	}
}