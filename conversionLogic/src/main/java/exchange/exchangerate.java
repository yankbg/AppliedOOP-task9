package exchange;

public class exchangerate {
    public double getExchangeRate(String fromCurrency, String toCurrency) {

        if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) {
            return 0.85;
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) {
            return 1.18;
        }else if(fromCurrency.equals("UGX") && toCurrency.equals("USD")){
            return 0.000272;
        }else if(fromCurrency.equals("USD") && toCurrency.equals("UGX")){
            return 3665.13;
        }else if(fromCurrency.equals("USD") && toCurrency.equals("CDF")){
            return 2859.03;
        }
        else if(fromCurrency.equals("CDF") && toCurrency.equals("USD")){
            return 0.0003497;
        }else {
            System.out.println("Unsupported currency pair");
            return 0;
        }
    }
}
