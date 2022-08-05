package pilldorasinformaticas;

import java.util.*;

public class TresEnRaya {

    // Atricbutos (vector)
    static char tablero[][];

    int i = 0;
    int j = 0;

    //Constructor
    public TresEnRaya() {

    }

    //Funcionalidades
    public static char[][] mostrar() {
        return tablero;
    }

    /**
     *
     * @return
     */
    public char[][] restart() {
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                TresEnRaya.tablero[i][j] = (char) 128;
            }
        }
        return TresEnRaya.tablero;
    }

    public boolean checkvictory(int posicion1, int posicion2) {
        if ((tablero[posicion1 - 1][0] == tablero[posicion1 - 1][1] && tablero[posicion1 - 1][0] == tablero[posicion1 - 1][2])
                || ((tablero[0][posicion2 - 1] == tablero[1][posicion2 - 1]) && (tablero[0][posicion2 - 1] == tablero[2][posicion2 - 1])
                || ((tablero[posicion2 - 1][posicion2 - 1] == tablero[posicion2 - 2][posicion2 - 2]) && (tablero[posicion2 - 1][posicion2 - 1] == tablero[posicion2][posicion2])))) {
            return true;
        } else {
            return false;
        }

    }
}
