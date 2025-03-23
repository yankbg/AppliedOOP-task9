package Main1;
import exchange.exchangerate;
import Manage.CurrencyConverter;

public class Main {
    public static void main(String[] arg){
        
        CurrencyConverter currency = new CurrencyConverter(new exchangerate());
        double balance =currency.convert(200,"USD","CDF");
        System.out.println("After conversion your balance is "+balance+" CDF");
    }
}
