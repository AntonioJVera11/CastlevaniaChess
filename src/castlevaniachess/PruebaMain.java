/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package castlevaniachess;

/**
 *
 * @author fcoam
 */
public class PruebaMain {
    public static void main(String[] args) {
        Tablero tablero = new Tablero();
        
        tablero.fillMatrix();
        tablero.moverPieza(1, 1, 'R');
        System.out.println("");
        
        tablero.mostrarTablero();
    }
}
