/*
 *  UCF COP3330 Summer 2021 Assignment 18 Solution
 *  Copyright 2021 Zachary Flanagan
 */

package ex18;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner unitchoice = new Scanner(System.in);
        System.out.print("Press C to convert from Fahrenheit to Celsius.\n");
        System.out.print("Press F to convert from Celsius to Fahrenheit.\n");
        System.out.print("Your choice: ");
        String unitchoiceS = unitchoice.nextLine();
        char letter = unitchoiceS.charAt(0);

        int convertedtemp;

        if(letter == 'C' || letter == 'c'){
            Scanner tempinput = new Scanner(System.in);
            System.out.print("Please enter the temperature in Fahrenheit: ");
            String tempinputS = tempinput.nextLine();
            int tempinputI = Integer.parseInt(tempinputS);

            convertedtemp = (tempinputI - 32) * 5 / 9;
            System.out.format("The temperature in Celsius is %d.", convertedtemp);
        } else {
            Scanner tempinput = new Scanner(System.in);
            System.out.print("Please enter the temperature in Celsius: ");
            String tempinputS = tempinput.nextLine();
            int tempinputI = Integer.parseInt(tempinputS);

            convertedtemp = (tempinputI * 9 / 5) + 32;
            System.out.format("The temperature in Fahrenheit is %d.", convertedtemp);
        }

    }
}