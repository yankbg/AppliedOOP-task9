package Manage;
import exchange.exchangerate;
public class CurrencyConverter {
    exchangerate Exchangerate;
    public double convert(double amount, String fromCurrency, String toCurrency) {
        double rate = Exchangerate.getExchangeRate(fromCurrency, toCurrency);
        return amount * rate;
    }
}
