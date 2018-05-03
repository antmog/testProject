package com.websystique.springmvc.controller;



import java.io.Serializable;

public class Marker implements Serializable{
    private int position;
    private String markerPosition;

    public Marker() {

    }
    public Marker(int position, String markerPosition) {
        this.position = position;
        this.markerPosition = markerPosition;
    }

    public void setPosition(int position) {

        this.position = position;
    }

    public void setMarkerPosition(String markerPosition) {
        this.markerPosition = markerPosition;
    }

    public int getPosition() {
        return position;
    }

    public String getMarkerPosition() {
        return markerPosition;
    }

    @Override
    public String toString() {
        return "Position: "+position+" markerPosition: " + markerPosition;
    }
}
