package ru.netology.qa.service;

public class Radio {
    private int minRadioStationNumber;
    private int maxRadioStationNumber = 9;

    private int currentRadioStationNumber = minRadioStationNumber;
    private int minVolume;
    private int maxVolume = 100;
    private int currentVolume = minVolume;
    public Radio() {

    }

    public Radio(int quantityRadioStation) {
        this.maxRadioStationNumber = minRadioStationNumber + (quantityRadioStation - 1);
    }
    public int getMinRadioStationNumber() {
        return minRadioStationNumber;
    }
    public int getMaxRadioStationNumber() {
        return maxRadioStationNumber;
    }
    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }


    public int getCurrentRadioStationNumber() {

        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < minRadioStationNumber) {
            return;
        }
        if (newCurrentRadioStationNumber > maxRadioStationNumber) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void next() {
        if (currentRadioStationNumber < maxRadioStationNumber) {
            currentRadioStationNumber++;
        } else {
            currentRadioStationNumber = minRadioStationNumber;
        }
    }

    public void prev() {
        if (currentRadioStationNumber > minRadioStationNumber) {
            currentRadioStationNumber--;
        } else {
            currentRadioStationNumber = maxRadioStationNumber;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
    }


}
