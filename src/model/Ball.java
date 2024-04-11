package model;

import javax.swing.JPanel;

import variables.Var;

import java.awt.Graphics;
import java.awt.Color;

import java.util.concurrent.ThreadLocalRandom;


public class Ball extends JPanel {
    
    private int ballPositionX = Var.globalBallX,
    ballPositionY = Var.globalBallY,
    diameter = Var.globalBallDiameter,
    speed = Var.globalBallSpeed;
    private double direction,
    deltaX, deltaY;

    public Ball() {
        setRandomStartDirection();
    }

    //#region getter/setter
    public int getballPositionX() {
        return ballPositionX;
    }

    public void setballPositionX(int ballPositionX) {
        this.ballPositionX = ballPositionX;
    }

    public int getPositionpositionY() {
        return ballPositionY;
    }

    public void setPositionpositionY(int ballPositionY) {
        this.ballPositionY = ballPositionY;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }
    //#endregion

    public void ballMovement() {
        deltaX = speed * Math.cos(Math.toRadians(direction));
        deltaY = speed * Math.sin(Math.toRadians(direction));
    
        ballPositionX += deltaX;
        ballPositionY += deltaY;
    }
    
    public void checkBounds() {
        if (ballPositionX <= (diameter/2 - Var.globalHorizontalCorrection) || ballPositionX >= Var.globalWindowWidth - diameter - Var.globalHorizontalCorrection) {
            direction = 180 - direction;
            ballPositionX += Var.globalCorrection * Math.cos(Math.toRadians(direction));
        }
    
        if (ballPositionY <= (diameter/2) || ballPositionY >= Var.globalWindowHeight - diameter/2 - Var.globalFrameCorrection) {
            direction = 360 - direction;
            ballPositionY += Var.globalCorrection * Math.sin(Math.toRadians(direction));
        }
    }

    public void setRandomStartDirection () {
        direction = ThreadLocalRandom.current().nextInt(Var.globalBallDirectionLow, Var.globalBallDirectionHigh + 1);
        if(direction == 90) {
            direction+=5;
        }
    }

    public ElementPosition getBallPosition () {
        ElementPosition cursorPosition = new ElementPosition(ballPositionX, ballPositionY);
        return cursorPosition;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(ballPositionX - diameter/2, ballPositionY - diameter/2, diameter, diameter);
    }
}
