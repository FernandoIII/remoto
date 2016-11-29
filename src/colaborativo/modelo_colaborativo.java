/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colaborativo;

import javax.swing.JOptionPane;

/**
 *
 * @author Marlene Lojan
 */
public class modelo_colaborativo {
    public int n;
    public int m;

    public modelo_colaborativo(int n, int m) {
        this.n = n;
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }
    public void multiplicar(){
        int salida;
        salida=this.m*this.m;
        JOptionPane.showMessageDialog(null, salida);
    }
    
}
