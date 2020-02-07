

public class meter {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("converter");
        
        double inch,inch2,inch3;
        double meters,meters2,meters3;
        final double factor = 25.4 ;

        inch = 2;
		inch2 = 5;
		inch3 = 10;
		
        meters = factor * inch;
		meters2 = factor * inch2;
		meters3 = factor * inch3;
		
	    System.out.println( + inch + " inch is equal to " + meters + "meter.");
		System.out.println( + inch2 + " inch is equal to " + meters2 + "meter.");
		System.out.println( + inch3 + " inch is equal to " + meters3 + "meter.");
    }

}
