package ru.netology.qa.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void getMinRadioStationNumber() {
        Radio rad = new Radio();

        int expected = 0;
        int actual = rad.getMinRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMinVolume() {
        Radio rad = new Radio();

        int expected = 0;
        int actual = rad.getMinVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMaxVolume() {
        Radio rad = new Radio();

        int expected = 100;
        int actual = rad.getMaxVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationNumberBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(-1);

        int expected = 0;
        int actual = rad.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumberMin() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(0);

        int expected = 0;
        int actual = rad.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationMax() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(9);

        int expected = 9;
        int actual = rad.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationNumberAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(10);

        int expected = 0;
        int actual = rad.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeAboveMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);

        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(101);

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToNextRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(0);

        rad.next();

        int expected = 1;
        int actual = rad.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToNextRadioStationAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(9);

        rad.next();
        int expected = 0;
        int actual = rad.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToPrevRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(9);

        rad.prev();

        int expected = 8;
        int actual = rad.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToPrevRadioStationBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(0);

        rad.prev();

        int expected = 9;
        int actual = rad.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.increaseVolume();

        int expected = 1;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);

        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);

        rad.reduceVolume();
        int expected = 99;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void reduceVolumeBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.reduceVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldSetQuantityRadioStation() {
        Radio rad = new Radio(30);

        int expected = 29;
        int actual = rad.getMaxRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void switchToNextRadioStationAboveQuantity() {
        Radio rad = new Radio(40);
        rad.setCurrentRadioStationNumber(39);

        rad.next();
        int expected = 0;
        int actual = rad.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }
}
