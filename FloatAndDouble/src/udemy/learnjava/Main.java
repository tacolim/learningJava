package udemy.learnjava;

public class Main {

    public static void main(String[] args) {
	    // Floating Point Number
            // single precision number 32 bit
            // range 1.4E-45 to 3.4028235E+38

        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;

        System.out.println("Float min val: " + myMinFloat);
        System.out.println("Float max val: " + myMaxFloat);


        // Double
            // double precision 64 bit
            // range 4.9E-324 to 1.7976931348623157E+308

        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;

        System.out.println("Double min val: " + myMinDouble);
        System.out.println("Double max val: " + myMaxDouble);

        int myIntVal = 5 / 3; // divion like 5/2 we only get the number of times 2 goes into 5: 2 and lose remainder
        float myFloatVal = 5f / 3f;
        double myDoubleVal = 5d / 3d; // d not NEEDED b/c Java assumes any decimal is a double but nice for human eyes

        System.out.println("myIntVal: " + myIntVal);
        System.out.println("myFloatVal: " + myFloatVal);
        System.out.println("myDoubleVal: " + myDoubleVal);

        // challenge -- kilo to pound conversion
        double kiloToPound = 0.45359237;
        int pounds = 190;

        double weightInKilos = pounds * kiloToPound;

        System.out.println("Weight in Pounds: " + pounds + " | Weight in Kilos: " + weightInKilos);

        // BigDecimal type --> overcomes issues with precision when dealing with very precise decimal calculations


    }
}
