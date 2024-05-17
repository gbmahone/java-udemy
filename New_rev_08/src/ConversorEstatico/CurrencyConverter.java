package ConversorEstatico;

public class CurrencyConverter {

    public static double IOF = 0.06;
    /**
    Calcule o preço em dolar
     @param amount total para converter
     @param dollarPrice preço do dolar
     @return total convertido
     */
    public static double dollarToReal(double amount, double dollarPrice){
        return amount * dollarPrice * (1.0 * IOF) + amount * dollarPrice;
    }
}
