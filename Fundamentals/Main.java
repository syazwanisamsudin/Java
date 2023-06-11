// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
package com.syazwani;

import java.awt.*; //To use Point object
import java.util.Arrays;
import java.util.Date; //To use Date object

public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        //Primitive Types - Store simple values
        int viewCount = 123_456_789; //int viewCount = 3_123_456_789 will prompt error
                                     //long viewCount = 3_123_456_789; will perceive as int

        long viewCount2 = 3_123_456_789L; //Need to put suffix L or l to indicate as long type

        float price = 10.99F; //Need to put suffix if like float price = 10.99 will prompt error

        byte age = 30;

        //Reference Types - Store complex objects
        Date now = new Date();
        //System.out.println(now);

        //Primitive store value - Independent memory management
        //byte x = 1;
        //byte y = 1;
        //x = 2;
        //System.out.println(y); //Output: y=1

        //Reference store reference
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        //System.out.println(point2);

        //Escape Character
        String message = "Hello \"Ani\" :) "; //Put \ before any character you wish to escape
        //System.out.println(message);

        //Backslash
        //We want to print like this "C:\Users\Syazwani";
        String path = "C:\\Users\\Syazwani"; //Have to put double backslash, because if single consider escape
        String newLine = "C:\n Users"; // \n will create new line
        String extraSpace = "C: \t Users"; // \t will create extra space
        //System.out.println(path);

        //Arrays

        //1-Dimensional Array
        //Method 1 Array declaration
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;

        //Method 2 Array declaration
        int[] numbers2 = {1,4,2,3,5};
        Arrays.sort(numbers2);

        //System.out.println(numbers); //Will print nasty output
        //System.out.println(Arrays.toString((numbers))); //Will print readable and neat array
        //System.out.println(Arrays.toString(numbers2));


    }
}
