package ru.netology.radio.service;

public class Radio {

    private int radioStationNumber;
    private int radioVolumeControl;
    private int allStations;

    public Radio() {
        this.allStations = 9;
    }

    public Radio(int cheangeStation) {
        this.allStations = cheangeStation - 1;
    }

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public void setRadioStationNumber(int radioStationNumber) {

        if (radioStationNumber < 0) {
            return;
        }
        if (radioStationNumber > allStations) {
            return;
        }
        this.radioStationNumber = radioStationNumber;
    }

    public int getRadioVolumeControl() {
        return radioVolumeControl;
    }

    public void setRadioVolumeControl(int radioVolumeControl) {
        if (radioVolumeControl < 0) {
            return;
        }
        if (radioVolumeControl > 100) {
            return;
        }
        this.radioVolumeControl = radioVolumeControl;
    }

    public void next() {
        if (radioStationNumber != allStations) {
            radioStationNumber++;
            return;
        }
        radioStationNumber = 0;
    }

    public void prev() {
        if (radioStationNumber != 0) {
            radioStationNumber--;
        } else {
            radioStationNumber = allStations;

        }
    }
}
