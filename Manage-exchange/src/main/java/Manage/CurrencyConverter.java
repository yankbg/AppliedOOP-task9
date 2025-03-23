package Manage;
import exchange.exchangerate;
public class CurrencyConverter {
   private exchangerate Exchangerate;

    public CurrencyConverter(exchangerate exchangerate) {
        this.Exchangerate = exchangerate;
    }

    public double convert(double amount, String fromCurrency, String toCurrency) {
        double rate = Exchangerate.getExchangeRate(fromCurrency, toCurrency);
        return amount * rate;
    }
}
