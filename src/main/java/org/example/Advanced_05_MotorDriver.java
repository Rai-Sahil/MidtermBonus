package org.example;

public class Advanced_05_MotorDriver {

    Advanced_05_Controller c;
    Advanced_05_MotorController c2;

    Advanced_05_MotorDriver(){
        c = new Advanced_05_Controller();
        c2 = new Advanced_05_MotorController();
    }

    int direction(){
        return c.direction;
    }

    int speed(){
        return c.speed;
    }

    int angle(){
        return c.angle;
    }

    int power(){
        return c2.powerInterpret();
    }

}
