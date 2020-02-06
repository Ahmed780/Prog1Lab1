

public class currencyconverter {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("converter");
        
        double currency;
        double currencyUSD;
        final double factor = 0.75;
		double currencyEUR;
        final double factor2 = 0.60;
		
		

        currency = 2;
        
		
  
		currencyUSD = factor * currency;
		currencyEUR = factor2 * currency;
		
		

	    System.out.println( + currency + " CAD is equal to " + currencyUSD + " USD.");
		System.out.println( + currency + " CAD is equal to " + currencyEUR + " EUR.");
		


    }

}
