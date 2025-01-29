/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package televisiondemo;

import java.util.Scanner;  // Needed for the Scanner class

/**
 * The purpose of this class is to model a television.
 * Your name: [Malak Alammari]
 */
public class Television {
    // Constant fields
    private final String MANUFACTURER; // Represents the manufacturer's brand
    private final int SCREEN_SIZE;      // Represents the size of the screen in inches

    // Instance fields
    private boolean powerOn; // Represents whether the television is on or off
    private int channel;      // Represents the current channel number
    private int volume;       // Represents the current volume level

    /**
     * Constructor to initialize the television's manufacturer and screen size.
     * @param manufacturer The manufacturer's brand.
     * @param screenSize The size of the screen in inches.
     */
    public Television(String manufacturer, int screenSize) {
        this.MANUFACTURER = manufacturer; // Assign manufacturer
        this.SCREEN_SIZE = screenSize;     // Assign screen size
        this.powerOn = false;              // Power is initially off
        this.volume = 20;                  // Default volume
        this.channel = 2;                  // Default channel
    }

    // Accessor methods
    public int getVolume() {
        return volume;
    }

    public int getChannel() {
        return channel;
    }

    public String getManufacturer() {
        return MANUFACTURER;
    }

    public int getScreenSize() {
        return SCREEN_SIZE;
    }

    /**
     * Sets the channel to the specified value.
     * @param channel The channel number to set.
     */
    public void setChannel(int channel) {
        this.channel = channel;
    }

    /**
     * Toggles the power state of the television.
     */
    public void power() {
        powerOn = !powerOn;
    }

    /**
     * Increases the volume by 1, ensuring it doesn't exceed 100.
     */
    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    /**
     * Decreases the volume by 1, ensuring it doesn't fall below 0.
     */
    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }
}
