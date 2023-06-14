package utils.arrays;

import static utils.arrays.ArrayString.NUMERO_EQUIPS;
import static utils.arrays.ArrayString.equipsCodi;

public class ArrayEnter{
    
    // creem els arrays amb uns valors inicials, per tenir dades introduïdes quan executem el programa
        // En aquest array bidimensional, s'emmagatzema les puntuacions dels equips de la lliga. 
        // Cada fila emmagatzema les puntuacions de l'equip situat en la mateixa posició que la fila
        // Cada columna d'aquest array guarda la següent informació:
        // Columna 0: partits jugats
        // Columna 1: partits guanyats
        // Columna 2: partits empatats
        // Columna 3: partits perduts
        // Columna 4: punts totals
        // Columna 5: gols a favor
        // Columna 6: gols en contra
        // Columna 7: diferència de gols
    
    public static int[][] puntsCodi = 
       {{14, 12, 1, 1, 37, 33, 5, 28},
        //Real Madrid
        {14, 11, 2, 1, 35, 33, 14, 19},
        //Real Sociedad
        {14, 8, 2, 4, 26, 19, 17, 2},
        //Athletic Club
        {14, 7, 3, 4, 24, 24, 14, 10},
        //Atlético de Madrid
        {14, 7, 3, 4, 24, 21, 14, 10},
        //Betis
        {14, 7, 3, 4, 24, 17, 12, 5},
        //Osasuna
        {14, 7, 2, 5, 23, 16, 14, 2},
        //Rayo Vallecano
        {14, 6, 4, 4, 22, 20, 16, 4},
        //Villarreal
        {14, 6, 3, 5, 21, 15, 10, 5},
        //Valencia
        {14, 5, 4, 5, 19, 22, 15, 7},
        //Mallorca
        {14, 5, 4, 5, 19, 13, 13, 0},
        //Valladolid
        {14, 5, 2, 7, 17, 13, 21, -8},
        //Girona    
        {14, 4, 4, 6, 16, 20, 22, -2},
        //Almería
        {14, 5, 5, 8, 16, 16, 22, -6},
        //Getafe
        {14, 3, 5, 6, 14, 12, 20, -8},
        //Espanyol
        {14, 2, 6, 6, 12, 16, 22, -6},
        //Celta de Vigo
        {14, 3, 3, 8, 12, 14, 26, -12},
        //Sevilla
        {14, 2, 5, 7, 11, 13, 22, -9},
        //Cadiz
        {14, 2, 5, 7, 11, 9, 26, -17},
        //Elche
        {14, 0, 4, 10, 4, 10, 31, -21}};
    
    public static int[][] puntsCopia = 
       {{14, 12, 1, 1, 37, 33, 5, 28},
        //Real Madrid
        {14, 11, 2, 1, 35, 33, 14, 19},
        //Real Sociedad
        {14, 8, 2, 4, 26, 19, 17, 2},
        //Athletic Club
        {14, 7, 3, 4, 24, 24, 14, 10},
        //Atlético de Madrid
        {14, 7, 3, 4, 24, 21, 14, 10},
        //Betis
        {14, 7, 3, 4, 24, 17, 12, 5},
        //Osasuna
        {14, 7, 2, 5, 23, 16, 14, 2},
        //Rayo Vallecano
        {14, 6, 4, 4, 22, 20, 16, 4},
        //Villarreal
        {14, 6, 3, 5, 21, 15, 10, 5},
        //Valencia
        {14, 5, 4, 5, 19, 22, 15, 7},
        //Mallorca
        {14, 5, 4, 5, 19, 13, 13, 0},
        //Valladolid
        {14, 5, 2, 7, 17, 13, 21, -8},
        //Girona    
        {14, 4, 4, 6, 16, 20, 22, -2},
        //Almería
        {14, 5, 5, 8, 16, 16, 22, -6},
        //Getafe
        {14, 3, 5, 6, 14, 12, 20, -8},
        //Espanyol
        {14, 2, 6, 6, 12, 16, 22, -6},
        //Celta de Vigo
        {14, 3, 3, 8, 12, 14, 26, -12},
        //Sevilla
        {14, 2, 5, 7, 11, 13, 22, -9},
        //Cadiz
        {14, 2, 5, 7, 11, 9, 26, -17},
        //Elche
        {14, 0, 4, 10, 4, 10, 31, -21},
        {0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0}};
    

        public static int numEquips = equipsCodi.length;
}

