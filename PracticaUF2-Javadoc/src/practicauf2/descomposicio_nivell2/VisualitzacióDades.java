package practicauf2.descomposicio_nivell2;

import static utils.arrays.ArrayEnter.puntsCopia;
import static utils.arrays.ArrayString.equipsCopia;
import static utils.consola.LecturaConsola.teclat;

/**
 * Aquesta classe conté mètodes per a la visualització de dades.
 */
public class VisualitzacióDades {

    /**
     * Mostra en format de taula les puntuacions de tots els equips de la lliga.
     */
    public static void visualitzarEquips() {

        System.out.println("\n_______________ PUNTUACIONS DELS equipsCopia DE LA LLIGA _______________");
        System.out.printf("\n\033[31m%15s %10s %10s %10s %10s %10s %-8s %-8s %10s", "Equip", "Jugats", "Guanyats", "Empatats", "Perduts", "puntsCopia   ", "G.Favor", "G.Contra  ", "Diferencia");
        for (int i = 0; i < equipsCopia.length && equipsCopia[i] != null; i++) {
            System.out.printf("\n%15s", equipsCopia[i]);
            for (int j = 0; j < puntsCopia[i].length; j++) {
                System.out.printf("%10d", puntsCopia[i][j]);
            }
        }

        // Espera que l'usuari premi return per continuar                    
        System.out.println("\n\nPrem RETURN per continuar...");
        teclat.nextLine();
        teclat.nextLine();
    }

    /**
     * Implementa l'algorisme de quicksort per ordenar un array de cadenes de
     * caràcters.
     *
     * @param arr l'array a ordenar
     * @param left índex de l'esquerra de l'array
     * @param right índex de la dreta de l'array
     */
    public static void quicksort(String[] arr, int left, int right) {

        int i = left;
        int j = right;
        String pivot = arr[left + (right - left) / 2];
        while (i <= j) {
            while (arr[i].compareToIgnoreCase(pivot) < 0) {
                i++;
            }
            while (arr[j].compareToIgnoreCase(pivot) > 0) {
                j--;
            }
            if (i <= j) {
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (left < j) {
            quicksort(arr, left, j);
        }
        if (i < right) {
            quicksort(arr, i, right);
        }
    }

    /**
     * Mostra les puntuacions d'un equip donat el seu nom introduït per
     * l'usuari.
     */
    public static void visualitzarEquipPerNom() {

        // Donat un nom d'equip introduït per l'usuari, visualitza les seves puntuacions
        teclat.nextLine();
        System.out.println("Introdueix el nom d'equip del que vols visualitzar les puntuacions: ");
        String equip = teclat.nextLine();
        boolean trobat = false;
        //cerquem el nom d'equip a l'array de noms
        int i = 0;
        for (i = 0; i < equipsCopia.length && equipsCopia[i] != null; i++) {
            if (equip.equalsIgnoreCase(equipsCopia[i])) {
                trobat = true;
                break;
            }
        }
        if (trobat) {
            System.out.printf("\n\033[31m%15s %10s %10s %10s %10s %10s %-8s %-8s %10s", "Equip", "Jugats", "Guanyats", "Empatats", "Perduts", "puntsCopia   ", "G.Favor", "G.Contra  ", "Diferencia");
            System.out.printf("\n%15s", equipsCopia[i]);
            for (int j = 0; j < puntsCopia[i].length; j++) {
                System.out.printf("%10d", puntsCopia[i][j]);
            }
        } else {
            System.out.println("No s'ha trobat aquest nom d'equip");
        }

        // Espera que l'usuari premi return per continuar                    
        System.out.println("\n\nPrem RETURN per continuar...");
        teclat.nextLine();
    }

    /**
     * Mostra les dades del líder i del cuer de la lliga.
     */
    public static void visualitzarLiderCuer() {
        int minpuntsCopia = puntsCopia[0][4],
                indMin = 0;
        int maxpuntsCopia = puntsCopia[0][4],
                indMax = 0;
        for (int j = 0; j < puntsCopia.length && equipsCopia[j] != null; j++) {
            if (puntsCopia[j][4] < minpuntsCopia) {
                minpuntsCopia = puntsCopia[j][4];
                indMin = j;
            }
            if (puntsCopia[j][4] > maxpuntsCopia) {
                maxpuntsCopia = puntsCopia[j][4];
                indMax = j;
            }
        }
        // Visualitza les dades del lider i del cuer
        System.out.printf("\n       \033[31m%15s %10s %10s %10s %10s %10s %-8s %-8s %10s", "Equip", "Jugats", "Guanyats", "Empatats", "Perduts", "puntsCopia   ", "G.Favor", "G.Contra  ", "Diferencia");
        System.out.printf("\nLIDER %15s", equipsCopia[indMax]);
        for (int j = 0; j < puntsCopia[indMax].length; j++) {
            System.out.printf("%10d", puntsCopia[indMax][j]);
        }
        System.out.printf("\nCUER  %15s", equipsCopia[indMin]);
        for (int j = 0; j < puntsCopia[indMin].length; j++) {
            System.out.printf("%10d", puntsCopia[indMin][j]);
        }
        // Espera que l'usuari premi return per continuar
        System.out.println("\n\nPrem RETURN per continuar...");
        teclat.nextLine();
        teclat.nextLine();
    }

}
