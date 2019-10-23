/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotDiferencial;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import javax.swing.JPanel;

public class Dibujo extends JPanel{
    private double angulo;
    private int PosicionX;
    private int PosicionY;
    //figura 2
    private double angulo1 = 0;
    private int PosicionX1 = 0;
    private int PosicionY1 = 0;
    
    public Dibujo() {
    setBackground(Color.ORANGE);
    this.setBounds(0, 0, 455, 455); 
    angulo=0;
    PosicionX=0;
    PosicionY=0;
   }

    @Override
    public void paint(Graphics g){
    super.paint(g);
    Graphics2D g2d = (Graphics2D) g;
    Graphics2D g3d = (Graphics2D) g;
    AffineTransform old = g2d.getTransform();
    g2d.setColor(Color.BLUE);
    g2d.rotate(angulo,PosicionX,PosicionY);
    g2d.translate(PosicionX-225, PosicionY-225);
    g2d.fillRect(200, 200, 50, 50);
    g2d.setColor(Color.RED);
    g2d.drawLine(225, 225, 260, 225);
    g2d.setColor(Color.GREEN);
    g2d.drawLine(225, 225, 225, 260);
    g2d.setTransform(old);
    g3d.setColor(Color.BLACK);
    g3d.rotate(angulo1,PosicionX1,PosicionY1);
    g3d.translate(PosicionX1-225, PosicionY1-225);
    g3d.fillOval(200, 200, 50, 50);
    g3d.setColor(Color.RED);
    g3d.drawLine(225, 225, 260, 225);
    g3d.setColor(Color.GREEN);
    g3d.drawLine(225, 225, 225, 260);


    }

    public double getAngulo1() {
        return angulo1;
    }

    public void setAngulo1(double angulo1) {
        this.angulo1 = angulo1;
    }

    public int getPosicionX1() {
        return PosicionX1;
    }

    public void setPosicionX1(int PosicionX1) {
        this.PosicionX1 = PosicionX1;
    }

    public int getPosicionY1() {
        return PosicionY1;
    }

    public void setPosicionY1(int PosicionY1) {
        this.PosicionY1 = PosicionY1;
    }
    
    
    
    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }
    public void setAngulo(int angulo) {
        this.angulo = angulo;
    } 

    public void setPosicionX(int PosicionX) {
        this.PosicionX = PosicionX;
    }

    public void setPosicionY(int PosicionY) {
        this.PosicionY = PosicionY;
    }

    public double getAngulo() {
        return angulo;
    }

    public int getPosicionX() {
        return PosicionX;
    }

    public int getPosicionY() {
        return PosicionY;
    }
        
}
