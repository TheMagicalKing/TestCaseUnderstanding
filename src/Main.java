import com.sun.jdi.ThreadReference;

import java.util.IllegalFormatCodePointException;

public class Main {
    public static void main(String[] args) {
        /*
        If code is done without a method it'll look like this, otherwise we just write tests

        Test Case 1


        Program Code 3


        Test Code 2
        */
        int first = 41;
        int second = 67;

        String output = ValueGreaterThan(first,second);

        if (output == "Second")

            System.out.println(output + " PASS");
        else
            System.out.println("FAIL");

        first = 67;
        second = 41;
        output = ValueGreaterThan(first,second);
        if (output == "First")
            System.out.println(output + " PASS");
        else
            System.out.println(output + " FAIL");

        first=400;
        second=250;
        int third=100;
        output = ThreeValGreat(first,second,third);
        if (output == "First")
            System.out.println(output + " PASS");
        else
            System.out.println(output + " FAIL");

        first = 12;
        second = 30;
        third = 45;
        output = ThreeValGreat(first,second,third);
        if (output == "Third")
            System.out.println(output + " PASS");
        else
            System.out.println(output + " FAIL");

        first = 34;
        second = 42;
        third = 30;
        output = ThreeValGreat(first,second,third);
        if (output == "Second")
            System.out.println(output+" PASS");
        else
            System.out.println(output+" FAIL");
    }
    static String ValueGreaterThan(int first, int second){
        String output ="";
        if (first>second)
            output = "First";
        else if (first<second)
            output = "Second";

        return output;

    }
    static String ThreeValGreat(int first, int second, int third){
        String output="";
        if (first < third && second < third)
            output = "Third";
        else if (second < first && third < first)
            output = "First";
        else if (third < second && first < second)
            output = "Second";
        return output;
    }
}
