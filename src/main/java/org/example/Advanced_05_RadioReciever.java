package org.example;

public class Advanced_05_RadioReciever {

    Advanced_05_RCHandHeld_Remote remote;

    Advanced_05_RadioReciever(){
        remote = new Advanced_05_RCHandHeld_Remote();
    }

    int signalReciever(){
         int signal = remote.SignalInterpreter();
         return signal;
    }


}
