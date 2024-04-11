package controller;

//Controller.java
import view.MainFrame;
import model.Ball;
import model.Cursor;
import model.ElementPosition;

import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    private MainFrame mainFrame;
    private Cursor cursor;
    private Ball ball;
    private Timer timer;
    private final int DELAY = 10; 
    private CursorController cursorController;


    public Controller() {
        mainFrame = new MainFrame();
        ball = new Ball(); 
        cursor = new Cursor();
        mainFrame.add(ball); 
        mainFrame.add(cursor);
        
        cursorController = new CursorController(cursor); 
        mainFrame.addKeyListener(cursorController);
        
        timer = new Timer(DELAY, this); 
        timer.start(); 
    }

    public void actionPerformed(ActionEvent e) {
        ball.ballMovement(); 
        ball.checkBounds(); 
        checkCollision(); // Überprüfe die Kollision
        mainFrame.repaint(); 
    }

    public void startApplication() {
        mainFrame.setVisible(true);
    }

    public void checkCollision() {
        ElementPosition ballPosition = ball.getBallPosition();
        ElementPosition cursorPosition = cursor.getCursorPosition();
    
        int ballX = ballPosition.getcurrentElementPositionX();
        int ballY = ballPosition.getcurrentElementPositionY();
        int cursorX = cursorPosition.getcurrentElementPositionX();
        int cursorY = cursorPosition.getcurrentElementPositionY();
    
        int distance = (int) Math.sqrt(Math.pow(ballX - cursorX, 2) + Math.pow(ballY - cursorY, 2));
    
        if (distance < (ball.getDiameter() / 2 + cursor.getCursorWidth() / 2)) {
            ball.setDirection(ball.getDirection() + 180);
        }
    }
    
}
