/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalocate;
import javax.swing.*;
import java.lang.Math;

/**
 *
 * @author gydokosten
 */
public class JavaLocate {

    /**
     * @param args the command line arguments
     */
    //private class DistanceCalculator {
      
        public double get(int txPower, int rssi) {
            int db_ratio = txPower - rssi;
            double ratio = (double)db_ratio / (double)10;
            double linear_ratio = Math.pow(10,ratio);         
            double result = Math.sqrt(linear_ratio);
            return result;
        }
    //}
    
    public static void main(String[] args) {
        // TODO code application logic here
        String txPower = JOptionPane.showInputDialog(null,"Enter AP calibrated TX Power");
        while(true){
        String rssi = JOptionPane.showInputDialog(null,"Enter AP received RSSI");
        JavaLocate i = new JavaLocate();
        double result = i.get(Integer.parseInt(txPower), Integer.parseInt(rssi));
        String resultStr = Double.toString(result);
        JOptionPane.showMessageDialog(null, resultStr);
        }
        
    } 
    
}
