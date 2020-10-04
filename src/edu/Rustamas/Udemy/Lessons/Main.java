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

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        //result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);
        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);
        //result = result + 2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        //result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);
        //result = result / 3;
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);
        //result = result - 2;
        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        //AND
        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        //OR
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        //! NOT
        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCas = isCar ? true : false;
        if (wasCas) {
            System.out.println("wasCar is true");
        }

        int ageOfClient = 20;
        boolean isEighteenOrOver = (ageOfClient == 20) ? true : false;
        System.out.println(isEighteenOrOver);

        //test
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValueTotal = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("MyValueTotal = " + myValueTotal);
        double theRemainder = myValueTotal % 40.00d;
        System.out.println("theRemainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }

        //Lesson 44
        int myVariable = 50;
        if (myVariable == 50) {
            System.out.println("Printed");
        }
        myVariable++;
        myVariable--;
        System.out.println("This is test");

        System.out.println("This is" + " another" + " still more.");

        int anotherVariable = 50;
        myVariable--;
        System.out.println("This is another one");

//Lesson 45
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if(score < 5000 && score >1000) {
//            System.out.println("This was was less than 5000 but greater than 1000");
//        } else if(score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//
//        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

        // Print out a second score on the screen with the following
        // score set to 10000
        // levelCompleted set to 8
        // bonus set to 200
        // But make sure the first printout above still displays as well

//        boolean newGameOver = true;
//        int newScore = 10000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//
//        if(newGameOver) {
//            int finalScore = newScore + (newLevelCompleted * newBonus);
//            System.out.println("Your final score was " + finalScore);
//        }
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }


    }
}
