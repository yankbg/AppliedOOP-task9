package Manage;

import exchange.exchangerate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyConverterTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void convert() {
        exchangerate ExchangeRate = new exchangerate();
        CurrencyConverter currency = new CurrencyConverter(ExchangeRate);
        double ExpectedResult = 571806;
        double ActualResult = currency.convert(200,"USD","CDF");

        assertEquals(ExpectedResult,ActualResult);
    }
}