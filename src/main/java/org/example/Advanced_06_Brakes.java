package org.example;

public class Advanced_06_Brakes {

    Advanced_06_Engine engine;

    Advanced_06_Brakes(){
        engine = new Advanced_06_Engine();
    }

    void setCurrentSpeed(int deacceleration){
        engine.speed = engine.speed - deacceleration;
    }
}
