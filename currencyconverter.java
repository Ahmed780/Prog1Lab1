

/******************************************************************************
 *  Compilation:  javac HelloWorld.java
 *  Execution:    java HelloWorld
 *
 *  Prints "Hello, World". By tradition, this is everyone's first program.
 *
 *  % java HelloWorld
 *  Hello, World
 *
 *  These 17 lines of text are comments. They are not part of the program;
 *  they serve to remind us about its properties. The first two lines tell
 *  us what to type to compile and test the program. The next line describes
 *  the purpose of the program. The next few lines give a sample execution
 *  of the program and the resulting output. We will always include such 
 *  lines in our programs and encourage you to do the same.
 *
 ******************************************************************************/

public class Converter {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("converter");
        double distanceInMeters;
        double distanceInFeet;
        final double factor = 3.28084;

        distanceInMeters = 5;
        distanceInfeet = factor * distanceInMeters;

	    System.out.println("\n" + distanceInMeters + "meters is equal to + distanceInFeet + "feet.");


    }

}
