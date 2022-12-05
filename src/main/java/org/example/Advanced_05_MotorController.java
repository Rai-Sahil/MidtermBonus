package org.example;

public class Advanced_05_MotorController {

    Advanced_05_Controller c;

    Advanced_05_MotorController(){
        c = new Advanced_05_Controller();
    }

    int powerInterpret(){
        int power = c.speed;
        return power;
    }
}
