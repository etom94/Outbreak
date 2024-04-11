package model;

import variables.Var;

import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Color;


public class Cursor extends JPanel {
    private int cursorPositionX = Var.globalCursorPositionX, 
    cursorPositionY = Var.globalCursorPositionY, 
    speed = Var.globalCursorSpeed,
    cursorWidth = Var.globalCursorWidth, 
    cursorHeight = Var.globaCursorHeight;

    public Cursor() {

    }
    //#region Getter/Setter

    public int getStartPositionX() {
        return cursorPositionX;
    }

    public void setStartPositionX(int cursorPositionX) {
        this.cursorPositionX = cursorPositionX;
    }

    public int getStartPositionY() {
        return cursorPositionY;
    }

    public void setStartPositionY(int cursorPositionY) {
        this.cursorPositionY = cursorPositionY;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCursorWidth() {
        return cursorWidth;
    }

    public void setCursorWidth(int cursorWidth) {
        this.cursorWidth = cursorWidth;
    }

    public int getCursorHeight() {
        return cursorHeight;
    }

    public void setCursorHeight(int cursorHeight) {
        this.cursorHeight = cursorHeight;
    }
    //#endregion

    public void cursorMoveright() {
        if(!cursorCheckBounds()){
            cursorPositionX += speed;
        }

    }

    public void cursorMoveLeft() {
        if(!cursorCheckBounds()) {
            cursorPositionX -= speed;
        }
    }

    public boolean cursorCheckBounds() {
        return cursorPositionX <= 0 + cursorWidth/2 || cursorPositionX >= Var.globalWindowWidth -cursorWidth/2;
    }

    public ElementPosition getCursorPosition () {
        ElementPosition cursorPosition = new ElementPosition(cursorPositionX, cursorPositionY);
        return cursorPosition;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK); // Farbe des Cursors
        g.fillRect(cursorPositionX - cursorWidth/2, cursorPositionY - cursorHeight/2, cursorWidth, cursorHeight); // Zeichne den Cursor
    }
}
