package castlevaniachess;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fcoam
 */
public class Tablero {
    
    public char[][] tableMatrix = new char[7][7];
    
    public void mostrarTablero() {
        for(int y=0; y<3; y++) {
            for(int x=0; x<3; x++) {
                System.out.print(tableMatrix[x][y]);
            }
            System.out.println();
        }
    }
    public void moverPieza(int x, int y, char tipoPieza) {
        tableMatrix[x][y] = tipoPieza ;
    }
    public void atacarPieza (int dañoInst, int puntosVida, char tipoPieza, boolean estadoPieza){
        puntosVida -= dañoInst ;
        if (puntosVida <= 0){
            estadoPieza = false;
        }
    }
}
