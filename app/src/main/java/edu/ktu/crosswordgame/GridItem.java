package edu.ktu.crosswordgame;

public class GridItem {

    private String currentLetter;
    private String correctLetter;
    private Boolean empty;

    public GridItem(String currentLetter, String correctLetter, Boolean empty) {
        this.currentLetter = currentLetter;
        this.correctLetter = correctLetter;
        this.empty = empty;

    }



    public String getCorrectLetter() {
        return correctLetter;
    }

    public String getCurrentLetter() {
        return currentLetter;
    }

    public Boolean getEmpty() {
        return empty;
    }
}
