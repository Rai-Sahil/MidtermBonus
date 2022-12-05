package org.example;

public class Advanced_05_Controller {
    Advanced_05_RadioReciever r;
    int direction;
    int speed;
    int angle;

    Advanced_05_Controller(){
        r = new Advanced_05_RadioReciever();
    }

    int getDirection(){
        return direction;
    }

    int getSpeed(){
        return speed;
    }

    int getAngle(){
        return angle;
    }

    void setDirection(int dir){
        direction = dir;
    }

    void setSpeed(int s){
        speed = s;
    }

    void setAngle(int a){
        angle = a;
    }

    int signalRecieved(){
        return r.signalReciever();
    }
}
