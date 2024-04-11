package controller;

import model.Cursor;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CursorController extends KeyAdapter {
    private Cursor cursor;

    public CursorController(Cursor cursor) {
        this.cursor = cursor;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_LEFT:
                cursor.cursorMoveLeft();
                break;
            case KeyEvent.VK_RIGHT:
                cursor.cursorMoveright();
                break;
            // Weitere Fälle für andere Tasten, falls nötig
        }
    }
}

