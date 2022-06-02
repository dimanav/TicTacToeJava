/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.kurs;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author miten
 */
public class Kurs extends JFrame {
    String player;
    public String [][] ArrayField = new String [3][3];
    Kurs(){  
        
    }
    
    public boolean CheckWin(String myToken, String otherToken){
        
        
        if("X".equals(myToken)) player = "Крестики";
        if("O".equals(myToken)) player = "Нолики";
        
        if ((ArrayField[0][0].equals(myToken) && ArrayField[0][1].equals(myToken) && ArrayField[0][2].equals(myToken)) || 
            (ArrayField[1][0].equals(myToken) && ArrayField[1][1].equals(myToken) && ArrayField[1][2].equals(myToken)) ||
            (ArrayField[2][0].equals(myToken) && ArrayField[2][1].equals(myToken) && ArrayField[2][2].equals(myToken)) ||
            (ArrayField[0][0].equals(myToken) && ArrayField[1][0].equals(myToken) && ArrayField[2][0].equals(myToken)) ||
            (ArrayField[0][1].equals(myToken) && ArrayField[1][1].equals(myToken) && ArrayField[2][1].equals(myToken)) ||  
            (ArrayField[0][2].equals(myToken) && ArrayField[1][2].equals(myToken) && ArrayField[2][2].equals(myToken)) ||  
            (ArrayField[0][0].equals(myToken) && ArrayField[1][1].equals(myToken) && ArrayField[2][2].equals(myToken)) ||
            (ArrayField[0][2].equals(myToken) && ArrayField[1][1].equals(myToken) && ArrayField[2][0].equals(myToken))){
            JOptionPane.showMessageDialog(null, "Вы Выиграли!", player, JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
        if ((ArrayField[0][0].equals(otherToken) && ArrayField[0][1].equals(otherToken) && ArrayField[0][2].equals(otherToken)) || 
            (ArrayField[1][0].equals(otherToken) && ArrayField[1][1].equals(otherToken) && ArrayField[1][2].equals(otherToken)) ||
            (ArrayField[2][0].equals(otherToken) && ArrayField[2][1].equals(otherToken) && ArrayField[2][2].equals(otherToken)) ||
            (ArrayField[0][0].equals(otherToken) && ArrayField[1][0].equals(otherToken) && ArrayField[2][0].equals(otherToken)) ||
            (ArrayField[0][1].equals(otherToken) && ArrayField[1][1].equals(otherToken) && ArrayField[2][1].equals(otherToken)) ||  
            (ArrayField[0][2].equals(otherToken) && ArrayField[1][2].equals(otherToken) && ArrayField[2][2].equals(otherToken)) ||  
            (ArrayField[0][0].equals(otherToken) && ArrayField[1][1].equals(otherToken) && ArrayField[2][2].equals(otherToken)) ||
            (ArrayField[0][2].equals(otherToken) && ArrayField[1][1].equals(otherToken) && ArrayField[2][0].equals(otherToken))){
            JOptionPane.showMessageDialog(null, "Вы Проиграли!", player, JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
        if(isFull()){
            JOptionPane.showMessageDialog(null, "Ничья!", player, JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
        else return false;
    }
    public void StartGame(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                ArrayField[i][j] = "";
            }
        }
        
    }
    
    private boolean isFull(){
        int count = 0;
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if(("X".equals(ArrayField[i][j])) || ("O".equals(ArrayField[i][j]))) count++;
            }
        }
        if (count == 9) return true;
        else return false;
    }
        
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            } 
            
        });
        
    }
    

    
    
}
