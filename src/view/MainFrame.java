package view;
// MainFrame.java
import javax.swing.JFrame;

import variables.Var;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Ballspiel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(Var.globalWindowWidth, Var.globalWindowHeight);
        setUndecorated(false);
        
    }
}
