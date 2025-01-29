/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package televisiondemo;

import java.util.Scanner;  // Needed for the Scanner class

/**
 * This class demonstrates the Television class.
 */
public class TelevisionDemo {
    public static void main(String[] args) {
        // Create a Scanner object to read from the keyboard
        Scanner keyboard = new Scanner(System.in);
        
        // Declare variables
        int station; // The user's channel choice
        
        // Declare and instantiate a television object
        Television bigScreen = new Television("Toshiba", 55);
        
        // Turn the power on
        bigScreen.power();
        
        // Display the state of the television
        System.out.println("A " + bigScreen.getScreenSize() + 
                           " inch " + bigScreen.getManufacturer() + 
                           " has been turned on.");
        
        // Prompt the user for input and store into station
        System.out.print("What channel do you want? ");
        station = keyboard.nextInt();
        
        // Change the channel on the television
        bigScreen.setChannel(station);
        
        // Increase the volume of the television
        bigScreen.increaseVolume();
        
        // Display the current channel and volume of the television
        System.out.println("Channel: " + bigScreen.getChannel() + 
                           " Volume: " + bigScreen.getVolume());
        
        // Check if the volume is too loud
        if (bigScreen.getVolume() > 20) {
            System.out.println("Too loud! Lowering the volume.");
            // Decrease the volume multiple times
            for (int i = 0; i < 5; i++) {
                bigScreen.decreaseVolume();
            }
        }
        
        // Display the current channel and volume after adjustments
        System.out.println("Channel: " + bigScreen.getChannel() + 
                           " Volume: " + bigScreen.getVolume());
        
        System.out.println(); // For a blank line
        
        // TASK #5: Create another instance of Television
        Television portable = new Television("Sharp", 19);
        portable.power(); // Turn the power on
        
        // Display the state of the portable television
        System.out.println("A " + portable.getScreenSize() + 
                           " inch " + portable.getManufacturer() + 
                           " has been turned on.");
        
        // Prompt the user for input for the portable TV
        System.out.print("What channel do you want? ");
        station = keyboard.nextInt();
        
        // Change the channel on the portable television
        portable.setChannel(station);
        
        // Decrease the volume by 2
        for (int i = 0; i < 2; i++) {
            portable.decreaseVolume();
        }
        
        // Display the changed state of the portable
        System.out.println("Channel: " + portable.getChannel() + 
                           " Volume: " + portable.getVolume());
        
        // Close the scanner
        keyboard.close();
    }
}
