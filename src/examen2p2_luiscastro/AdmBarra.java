/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_luiscastro;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author lfern
 */
public class AdmBarra extends Thread {
    JProgressBar barra;
    JProgressBar barra2;
    JLabel label;
    boolean vive;
    Carro c1;
    Carro c2;

    public AdmBarra(JProgressBar barra, JProgressBar barra2, Carro c1, Carro c2, JLabel label) {
        this.barra = barra;
        this.barra2 = barra2;
        this.c1 = c1;
        this.c2 = c2;
        vive = true;
        this.label = label;
    }
    
    
    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public JProgressBar getBarra2() {
        return barra2;
    }

    public void setBarra2(JProgressBar barra2) {
        this.barra2 = barra2;
    }

    public Carro getC1() {
        return c1;
    }

    public void setC1(Carro c1) {
        this.c1 = c1;
    }

    public Carro getC2() {
        return c2;
    }

    public void setC2(Carro c2) {
        this.c2 = c2;
    }

    

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        int min = 0;
        int sec = 0;
        while(vive){ 
            
            boolean victoria1 = false;
            boolean victoria2 = false;
            boolean empate = false;
            String tiempo = "";
            
            if(sec != 60){
            sec++;        
            }else{
                sec = 0;
                min++;
            }
            label.setText(min+":"+sec);
            
            barra.setValue(barra.getValue()+c1.getVelocidad());
            barra2.setValue(barra2.getValue()+c2.getVelocidad());
            if(barra.getValue()== 1000|| barra2.getValue()==1000){
                tiempo = min+" minutos con "+sec+" segundos!";
                label.setText("00:00");
                if(barra.getValue()== 1000 && barra2.getValue()==1000){
                    empate = true;
                    victoria1=false;
                    victoria2=false;
                    
                }else if(barra.getValue()== 1000){
                    victoria1 = true;
                    empate = false;
                    victoria2 = false;
                    
                }else if(barra2.getValue()== 1000){
                    victoria2 = true;
                    victoria1 = false;
                    empate = false;
                    
                }
                vive = false;
            }
            if(empate){
                JOptionPane.showMessageDialog(null, "Es un empate.");
            }else if(victoria1){
                JOptionPane.showMessageDialog(null, "El ganador es "+c1.getModelo()+"!"+"\nTiempo: "+tiempo);
            }else if(victoria2){
                JOptionPane.showMessageDialog(null, "El ganador es "+c2.getModelo()+"!"+"\nTiempo: "+tiempo);
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
    
}
