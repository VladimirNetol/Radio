package ru.netology.radio.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioServiceTest {
    Radio radio = new Radio();

    @Test
    public void maxVolumeTest() {
        radio.setRadioVolumeControl(100);

        int expected = 100;
        int actual = radio.getRadioVolumeControl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minVolumeTest() {
        radio.setRadioVolumeControl(0);

        int expected = 0;
        int actual = radio.getRadioVolumeControl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minNumberOfStationTest() {
        radio.setRadioStationNumber(0);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxNumberOfStationTest() {
        radio.setRadioVolumeControl(9);

        int expected = 9;
        int actual = radio.getRadioVolumeControl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void middleNumberOfStationTest() {
        radio.setRadioVolumeControl(5);

        int expected = 5;
        int actual = radio.getRadioVolumeControl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void middleVolumeTest() {
        radio.setRadioVolumeControl(50);

        int expected = 50;
        int actual = radio.getRadioVolumeControl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belowLimitVolumeTest() {
        radio.setRadioVolumeControl(-29);

        int expected = 0;
        int actual = radio.getRadioVolumeControl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveLimitVolumeTest() {
        radio.setRadioVolumeControl(154);

        int expected = 0;
        int actual = radio.getRadioVolumeControl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveLimitNumberOfStationTest() {
        radio.setRadioStationNumber(15);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belowLimitNumberOfStationTest() {
        radio.setRadioStationNumber(-13);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchMaxStation() {
        radio.setRadioStationNumber(9);
        radio.next();

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchMinStation() {
        radio.setRadioStationNumber(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchPrevStation() {
        radio.setRadioStationNumber(9);
        radio.prev();

        int expected = 8;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchNextStation() {
        radio.setRadioStationNumber(0);
        radio.next();

        int expected = 1;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnOfStationTest() {
        Radio radio = new Radio(28);

        radio.setRadioStationNumber(15);

        int expected = 15;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
}
