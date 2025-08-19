package ru.netology.radio.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioServiceTest {

    @Test
    public void maxVolumeTest() {
        Radio radio = new Radio();

        radio.setRadioVolumeControl(100);

        int expected = 100;
        int actual = radio.getRadioVolumeControl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minVolumeTest() {
        Radio radio = new Radio();

        radio.setRadioVolumeControl(0);

        int expected = 0;
        int actual = radio.getRadioVolumeControl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minNumberOfStationTest() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(0);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxNumberOfStationTest() {
        Radio radio = new Radio();

        radio.setRadioVolumeControl(9);

        int expected = 9;
        int actual = radio.getRadioVolumeControl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void middleNumberOfStationTest() {
        Radio radio = new Radio();

        radio.setRadioVolumeControl(5);

        int expected = 5;
        int actual = radio.getRadioVolumeControl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void middleVolumeTest() {
        Radio radio = new Radio();

        radio.setRadioVolumeControl(50);

        int expected = 50;
        int actual = radio.getRadioVolumeControl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belowLimitVolumeTest() {
        Radio radio = new Radio();

        radio.setRadioVolumeControl(-29);

        int expected = 0;
        int actual = radio.getRadioVolumeControl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveLimitVolumeTest() {
        Radio radio = new Radio();

        radio.setRadioVolumeControl(154);

        int expected = 0;
        int actual = radio.getRadioVolumeControl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveLimitNumberOfStationTest() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(15);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belowLimitNumberOfStationTest() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(-13);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchMaxStation() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(9);
        radio.next();

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchMinStation() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchPrevStation() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(9);
        radio.prev();

        int expected = 8;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchNextStation() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(0);
        radio.next();

        int expected = 1;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
}
