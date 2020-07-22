package udemy.learnjava;

public class Main {

    public static void main(String[] args) {
	    // integer - 32 bits
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum: " + myMinIntValue); // -2147483648
        System.out.println("Integer Maximum: " + myMaxIntValue); // 2147483647
        System.out.println("Busted Int Max Val: " + (myMaxIntValue + 1)); // overflow
        System.out.println("Busted Int Min Val: " + (myMinIntValue - 1)); // underflow

        // int myMaxIntText = 2147483648; this will give an error of Integer number too large
        int myUnderscoreInt = 2_147_483_647; // underscores add to readability on large numbers but don't change meaning
        System.out.println("Established w underscores: " + myUnderscoreInt); // output with no underscores 2147483647


        // byte - 8 bits
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum: " + myMinByteValue); // -129
        System.out.println("Byte Maximum: " + myMaxByteValue); // 128
        System.out.println("Busted Byte Max Val: " + (myMaxByteValue + 1)); // overflow
        System.out.println("Busted Byte Min Val: " + (myMinByteValue - 1)); // underflow

        // short - 16 bits
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum: " + myMinShortValue); // -32769
        System.out.println("Short Maximum: " + myMaxShortValue); // 32768
        System.out.println("Busted Short Max Val: " + (myMaxShortValue + 1)); // overflow
        System.out.println("Busted Short Min Val: " + (myMinShortValue - 1)); // underflow

        // long - 64 bits
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("My Long Value: " + myLongValue);
        System.out.println("Long Minimum: " + myMinLongValue); // -9223372036854775808
        System.out.println("Long Maximum: " + myMaxLongValue); // 9223372036854775807
        System.out.println("Busted Long Max Val: " + (myMaxLongValue + 1)); // overflow
        System.out.println("Busted Long Min Val: " + (myMinLongValue - 1)); // underflow
        long myUnderscoreLong = 9_223_372_036_854_775_807L;
        System.out.println("Established w underscores: " + myUnderscoreLong); // output with no underscores

        // casting
        int myTotal = (myMinIntValue / 2); // no error b/c var/2 is type int
        byte myNewByteValue = (byte)(myMinByteValue / 2); // without desired type java thinks var/2 is type int
        short myNewShortValue = (short)(myMinShortValue / 2); // without desired type java thinks var/2 is type int

        // challenge
        byte validByte = 100;
        short validShort = 2000;
        int validInt = 2000000000;
        // -1_474_765_480
        int sumThree = validByte + validShort + validInt;

        long longTotal = 50000 + 10 * (long)(validByte + validShort + validInt);

        System.out.println("long sum works: " + (50000 + 10 * (long)(validByte + validShort + validInt)));
        System.out.println("long sum works: " + (50000 + 10L * (validByte + validShort + validInt)));
        System.out.println("long sum busts: " + (long)(50000 + 10 * (validByte + validShort + validInt)));

    }
}
