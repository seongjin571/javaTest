package com.interface_practice;

public class TVCR extends TV implements IVCR {
    Vcr vcr = new Vcr();

    public void play() {
        vcr.play();
    }

    public void stop() {
        vcr.stop();
    }
}
