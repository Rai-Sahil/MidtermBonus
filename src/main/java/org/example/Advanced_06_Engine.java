package org.example;

public class Advanced_06_Engine {

    int CurrentGasOutput = 0;
    int speed = 0;

    void morePower(int acceleration){
        CurrentGasOutput += acceleration;
    }

    void lessPower(int deacceleration){
        CurrentGasOutput -= deacceleration;
    }
}
