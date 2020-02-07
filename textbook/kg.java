

public class kg {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("converter");
        
        double kg,kg2,kg3;
        double pound,pound2,pound3;
        final double factor = 2.20462 ;

        kg = 10;
		kg2 = 50;
		kg3 = 100;
		
        pound = factor * kg;
		pound2 = factor * kg2;
		pound3 = factor * kg3;
		
	    System.out.println( + kg + " kg is equal to " + pound + "pound.");
		System.out.println( + kg2 + " kg is equal to " + pound2 + "pound.");
		System.out.println( + kg3 + " kg is equal to " + pound3 + "pound.");
    }

}
