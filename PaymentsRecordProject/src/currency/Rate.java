package currency;

/**
 * Ratish created the code
 * Class for retrieving the rate
 */
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Rate {
	private Map<String, Double> rate;

	public Rate() {
		rate = new HashMap<>();
	}

	public void add(String key, double value) {
		rate.put(key, value);
	}

	public double getRate(String key) {
		return rate.getOrDefault(key, 0d);
	}

	public double getValueByRate(String key, int value) {
		return (getRate(key) != 0) ? value / getRate(key) : 0;
	}

	public String valueByRateToString(String key, int value) {
		return (getRate(key) != 0) ? " (USD " + roundOf(getValueByRate(key, value), 2) + ")" : "";
	}

	private String roundOf(double value, int scale) {
		BigDecimal original = new BigDecimal(value);
		return original.setScale(scale, BigDecimal.ROUND_HALF_EVEN).toString();
	}
}