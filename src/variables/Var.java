package variables;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.crypto.spec.GCMParameterSpec;

public class Var {
    //#region Frame
    private static Dimension ScreenDimension = Toolkit.getDefaultToolkit().getScreenSize();
    public static final int globalWindowWidth = (int) ScreenDimension.getWidth();
    public static final int globalWindowHeight = (int) ScreenDimension.getHeight();
    public static final int globalFrameCorrection = 0;

    //#endregion

    //#region globalGeneral

    //#region Ball
    public static final int globalCorrection = 2;
    public static final int globalHorizontalCorrection = 4;
    public static final int globalBallX = globalWindowWidth/2;
    public static final int globalBallY = 100;
    public static final int globalBallSpeed = 5;
    public static final int globalBallDiameter = 20;
    public static int globalBallDirectionLow = 50;
    public static int globalBallDirectionHigh = 130;
    //#endregion

    //#region Cursor
    public static final int globalCursorPositionX = globalWindowWidth/2;
    public static final int globalCursorPositionY = (int) (globalWindowHeight*0.9);
    public static final int globalCursorSpeed = 5;
    public static final int globalCursorWidth = 100;
    public static final int globaCursorHeight = 10;
}
