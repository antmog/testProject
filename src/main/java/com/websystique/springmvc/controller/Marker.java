package com.websystique.springmvc.controller;



import java.io.Serializable;

public class Marker{
    private String position;
    private String markerPosition;

    public Marker(String position, String markerPosition) {
        this.position = position;
        this.markerPosition = markerPosition;
    }

    public void setPosition(String position) {

        this.position = position;
    }

    public void setMarkerPosition(String markerPosition) {
        this.markerPosition = markerPosition;
    }

    public String getPosition() {
        return position;
    }

    public String getMarkerPosition() {
        return markerPosition;
    }
}
