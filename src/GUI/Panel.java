package GUI;

import Battle.Fight;
import Entities.Interactions;
import Loader.ImageLoader;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Panel extends JLayeredPane implements KeyListener, MouseListener {
    private static final int SCREEN_WIDTH = 700;
    private static final int SCREEN_HEIGHT = 420;
    private static int xPos;
    private static int yPos;


    Panel(){

        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.white);
        this.setFocusable(true);
        this.addKeyListener(this);
        this.addMouseListener(this);
        Panel.resetPos();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        ImagePaint.paintLevel(Run.getPlayer().getLocation(), g);
        ImagePaint.paintPlayer(Run.getPlayer(), g);
        ImagePaint.paintTxt(g);
        ImagePaint.paintInventory(g);
        ImagePaint.paintBattle(g);
        ImagePaint.paintReception(g);
        ImagePaint.paintShop(g);
        ImagePaint.paintQuest(g);
        ImagePaint.paintLose(g);
        repaint();

    }



    public static int getScreenWidth(){
        return SCREEN_WIDTH;
    }

    public static int getScreenHeight(){
        return SCREEN_HEIGHT;
    }

    public static int getXPos(){
        return xPos;
    }
    public static int getYPos(){
        return yPos;
    }

    public static void resetPos(){
        xPos = -1;
        yPos = -1;
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyChar() == 'w' || e.getKeyCode() == KeyEvent.VK_UP){
            Run.moveMap(0, -1);
            Run.getPlayer().setDir("Up");
        }
        if(e.getKeyChar() == 'a' || e.getKeyCode() == KeyEvent.VK_LEFT){
            Run.moveMap(-1, 0);
            Run.getPlayer().setDir("Left");
        }
        if(e.getKeyChar() == 's' || e.getKeyCode() == KeyEvent.VK_DOWN){
            Run.moveMap(0, 1);
            Run.getPlayer().setDir("Down");
        }
        if(e.getKeyChar() == 'd' || e.getKeyCode() == KeyEvent.VK_RIGHT){
            Run.moveMap(1, 0);
            Run.getPlayer().setDir("Right");
        }
        if(e.getKeyChar() == 'l'){
            Interactions.checkSurrounding();
        }
        if(e.getKeyChar() == 'i'){
            if(!ImagePaint.getOpenTxt() && !ImagePaint.getOpenShop() && !Fight.isEncounter() && !ImagePaint.getReception() && !ImagePaint.getOpenInfo()) {
                Run.getPlayer().setOpenInv(true);
            }
        }
        if(e.getKeyChar() == 'q'){
            if(!ImagePaint.getOpenTxt() && !ImagePaint.getOpenShop() && !Fight.isEncounter() && !ImagePaint.getReception() && !Run.getPlayer().getOpenInv() && Run.getPlayer().getPQuest() != null){
                ImagePaint.setOpenInfo();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }


    @Override
    public void mouseClicked(MouseEvent e) {
        if(Run.getPlayer().getOpenInv() || ImagePaint.getOpenTxt() || ImagePaint.getOpenShop() || Fight.isEncounter() || ImagePaint.getReception() || ImagePaint.getOpenInfo()) {
            xPos = e.getX();
            yPos = e.getY();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
