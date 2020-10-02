package edu.Rustamas.Udemy.Lessons;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, Rustam!");

        int MyFirstNumber = (5 + 10) + (2 * 10);
        int MySecondNumber = 12;
        int MyThirdNumber = MyFirstNumber * 2;
        int MyTotal = MyFirstNumber + MySecondNumber + MyThirdNumber;
        System.out.println(MyTotal);
        int MyLastOne = 1000 - MyTotal;
        System.out.println(MyLastOne);
//occupies 32 bits. 1 byte = 8 bits.
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("My Minimum Int Value: " + myMinIntValue);
        System.out.println("My Maximum Value: " + myMaxIntValue);
        System.out.println("Busted MAX value: " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value: " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;
//occupies 8 bits.
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("My Minimum Byte Value: " + myMinByteValue);
        System.out.println("My Maximum Value: " + myMaxByteValue);
//occupies 16 bits.
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("My Minimum Short Value: " + myMinShortValue);
        System.out.println("My Maximum Value: " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("My Minimum Long Value: " + myMinLongValue);
        System.out.println("My Maximum Value: " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;
        System.out.println(bigShortLiteralValue);

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

        //test
        byte myByteTestValue = 10;
        short myShortTestValue = 20;
        int myIntTestValue = 50;
        long myLongTotalValue = 50_000L + 10L * (myByteTestValue + myShortTestValue + myIntTestValue);
        System.out.println(myLongTotalValue);

        short myShortTotalValue = (short) (1_000 + 10 * (myByteTestValue + myShortTestValue + myIntTestValue));
        System.out.println(myShortTotalValue);

        //occupies 32 bits.

        //occupies 64 bits.
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("My Minimum Float Value: " + myMinFloatValue);
        System.out.println("My Maximum Value: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("My Minimum Double Value: " + myMinDoubleValue);
        System.out.println("My Maximum Value: " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        //test
        double pounds = 200;
        double poundsTokg = pounds * 0.45359237d;
        System.out.println("Pounds to kilograms: " + poundsTokg);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

        //occupies 2 bytes of memory or 16 bits.
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOverTwentyOne = true;

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + "\u00A9 2019";
        System.out.println("myString is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);










    }
}
