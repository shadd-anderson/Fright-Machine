package com.teamtreehouse.techdegree;

import com.example.accessory.Horn;
import com.example.accessory.Strobe;
import com.teamtreehouse.techdegree.hardware.Camera;
import com.teamtreehouse.techdegree.hardware.FrightMachine;

public class Main {

    public static void main(String[] args) {
        FrightMachine machine = new FrightMachine();
        machine.addAccessory("horn", new Horn());
        machine.addAccessory("strobe light", new Strobe());
        machine.addAccessory("camera", new Camera(5));
        machine.simulateMotion();
    }
}
