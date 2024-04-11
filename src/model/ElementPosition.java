package model;

public class ElementPosition {
    int currentElementPositionX;
    int currentElementPositionY;

    public ElementPosition(int currentElementPositionX, int currentElementPositionY) {
        this.currentElementPositionX = currentElementPositionX;
        this.currentElementPositionY = currentElementPositionY;
    }

    public int getcurrentElementPositionX() {
        return currentElementPositionX;
    }

    public void setcurrentElementPositionX(int currentElementPositionX) {
        this.currentElementPositionX = currentElementPositionX;
    }

    public int getcurrentElementPositionY() {
        return currentElementPositionY;
    }

    public void setcurrentElementPositionY(int currentElementPositionY) {
        this.currentElementPositionY = currentElementPositionY;
    }
}
