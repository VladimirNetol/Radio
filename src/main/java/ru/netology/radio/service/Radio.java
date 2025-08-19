package ru.netology.radio.service;

public class Radio {

    private int radioStationNumber;

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public void setRadioStationNumber(int radioStationNumber) {

        if (radioStationNumber < 0) {
            return;
        }
        if (radioStationNumber > 9) {
            return;
        }
        this.radioStationNumber = radioStationNumber;
    }

    private int radioVolumeControl;

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
        if (radioStationNumber != 9) {
            radioStationNumber++;
            return;
        }
        radioStationNumber = 0;
    }

    public void prev() {
        if (radioStationNumber != 0) {
            radioStationNumber--;
        } else {
            radioStationNumber = 9;

        }
    }
}
