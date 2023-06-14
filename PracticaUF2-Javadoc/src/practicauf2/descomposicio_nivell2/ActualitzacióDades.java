package practicauf2.descomposicio_nivell2;

import static utils.arrays.ArrayEnter.numEquips;
import static utils.arrays.ArrayEnter.puntsCopia;
import static utils.arrays.ArrayString.NUMERO_EQUIPS;
import static utils.arrays.ArrayString.equipsCopia;
import static utils.consola.LecturaConsola.teclat;

/**
 * La classe ActualitzacióDades conté mètodes per a l'alta i la modificació de
 * les dades dels equips en una lliga.
 */
public class ActualitzacióDades {

    public static String[] equips = new String[NUMERO_EQUIPS];

    /**
     * El mètode equipNou permet donar d'alta un equip nou en la lliga. Demana
     * al usuari que introdueixi el nom de l'equip i les seves dades com el
     * nombre de partits guanyats, empatats, perduts, gols a favor i gols en
     * contra. A continuació, actualitza els registres de l'equip i incrementa
     * el comptador de nombre d'equips introduïts.
     */
    public static void equipNou() {

        // a partir del nom de l'equip es valida que no existeixi, per tal de donar-lo d'alta
        teclat.nextLine();
        System.out.println("_______________ ALTA D'EQUIP NOU _______________");
        int indTrobat = 0;
        boolean trobat;
        int i;
        if (numEquips == equipsCopia.length) {
            // Comprova si ha arribat al final de l'array, no hi ha més espai
            System.out.println("\nNO es poden donar d'alta més equips, no hi ha més espai...");
        } else {

            System.out.print("\nIntrodueix el nom del nou equip: ");
            String equipNou = teclat.nextLine();

            trobat = false;

            //cerca el nom d'equip a l'array de noms
            for (i = 0; i < equipsCopia.length && !trobat; i++) {
                if (equipNou.equalsIgnoreCase(equipsCopia[i])) {
                    trobat = true;
                    indTrobat = i;
                }
            }

            if (trobat) {

                System.out.println("HO SENTIM, aquest equip ja existeix!!!, no el pots donar d'alta");
                System.out.printf("\n\033[31m%15s %10s %10s %10s %10s %10s %-8s %-8s %10s", "Equip", "Jugats", "Guanyats", "Empatats", "Perduts", "puntsCopia   ", "G.Favor", "G.Contra  ", "Diferencia");
                System.out.printf("\n%15s", equipsCopia[i]);

                for (int j = 0; j < puntsCopia[i].length; j++) {
                    System.out.printf("%10d", puntsCopia[i][j]);
                }

            } else { //donem d'alta el nou equip, doncs no existeix i hi ha espai

                // si no troba el nom de l'equip vol dir que no existeix en l'array i el podem donar d'alta
                // assigna a l'array de noms d'equip el nom d'equip introduït per l'usuari
                equips[numEquips] = equipNou;

                System.out.print("\nPartits GUANYATS: ");
                puntsCopia[numEquips][1] = teclat.nextInt();
                System.out.print("\nPartits EMPATATS: ");
                puntsCopia[numEquips][2] = teclat.nextInt();
                System.out.print("\nPartits PERDUTS: ");
                puntsCopia[numEquips][3] = teclat.nextInt();
                System.out.print("\nGols A FAVOR: ");
                puntsCopia[numEquips][5] = teclat.nextInt();
                System.out.print("\nGols EN CONTRA: ");
                puntsCopia[numEquips][6] = teclat.nextInt();

                // Calcula el numero de partits jugats a partir dels partits guanyats, empatats i perduts
                puntsCopia[numEquips][0] = puntsCopia[numEquips][1] + puntsCopia[numEquips][2] + puntsCopia[numEquips][3];

                // Calcula el numero de puntsCopia totals de l'equip a partir dels partits guanyats, empatats i perduts
                puntsCopia[numEquips][4] = (puntsCopia[numEquips][1] * 3) + puntsCopia[numEquips][2];

                // Calcula la diferència de gols
                puntsCopia[numEquips][7] = puntsCopia[numEquips][5] - puntsCopia[numEquips][6];

                System.out.println("\n Equip donat d'ALTA correctament!!");

                System.out.printf("\n\033[31m%15s %10s %10s %10s %10s %10s %-8s %-8s %10s", "Equip", "Jugats", "Guanyats", "Empatats", "Perduts", "puntsCopia   ", "G.Favor", "G.Contra  ", "Diferencia");
                System.out.printf("\n%15s", equipsCopia[numEquips]);
                for (int j = 0; j < puntsCopia[numEquips].length; j++) {
                    System.out.printf("%10d", puntsCopia[numEquips][j]);
                }

                // incrementa la variable que porta compter del numero d'equips introduïts
                numEquips++;

            }
        }
        // Espera que l'usuari premi return per continuar
        System.out.println("\n\nPrem RETURN per continuar...");
        teclat.nextLine();
        teclat.nextLine();

    }

    /**
     * El mètode modificarEquip permet modificar les dades d'un equip existent
     * en la lliga. Demana al usuari que introdueixi el nom de l'equip que vol
     * modificar i les dades que desitja canviar, com el nom de l'equip, el
     * nombre de partits guanyats, empatats, perduts, gols a favor i gols en
     * contra. A continuació, actualitza els registres de l'equip.
     */
    public static void modificarEquip() {
        teclat.nextLine();

        System.out.println("\n_______________ MODIFICACIÓ DE DADES D'UN EQUIP _______________");
        System.out.println("\nIntrodueix el nom de l'equip que vols modificar:");
        String equip = teclat.nextLine();

        boolean trobat = false;
        int indTrobat = 0;
        //cerca el nom d'equip a l'array de noms

        for (int i = 0; i < equipsCopia.length && (!trobat); i++) {
            if (equip.equalsIgnoreCase(equipsCopia[i])) {
                trobat = true;
                indTrobat = i;
                System.out.printf("\n\033[31m%15s %10s %10s %10s %10s %10s %-8s %-8s %10s", "Equip", "Jugats", "Guanyats", "Empatats", "Perduts", "puntsCopia   ", "G.Favor", "G.Contra  ", "Diferencia");
                System.out.printf("\n%15s", equipsCopia[i]);

                for (int j = 0; j < puntsCopia[i].length; j++) {
                    System.out.printf("%10d", puntsCopia[i][j]);
                }
            }

        }
        if (!trobat) {
            // No troba l'equip, per tant, no es pot modificar
            System.out.println("No s'ha trobat aquest equip");
        } else {
            // S'ha trobat l'equip, es demana a l'usuari quina informació vol modificar.
            System.out.println("\nVols modificar el NOM equip? " + equipsCopia[indTrobat] + " (s/n)");
            char mod = teclat.nextLine().charAt(0);
            if (mod == 's' || mod == 'S') {
                System.out.print("Nom d'equip: ");
                equipsCopia[indTrobat] = teclat.nextLine();
            }

            System.out.println("Vols modificar partits GUANYATs? " + puntsCopia[indTrobat][1] + " (s/n)");
            mod = teclat.nextLine().charAt(0);
            if (mod == 's' || mod == 'S') {
                System.out.print("Partits guanyats:  ");
                puntsCopia[indTrobat][1] = teclat.nextInt();
                teclat.nextLine();
            }

            System.out.println("Vols modificar partits EMPATATS? " + puntsCopia[indTrobat][2] + " (s/n)");
            mod = teclat.nextLine().charAt(0);
            if (mod == 's' || mod == 'S') {
                System.out.print("Partits empatats:  ");
                puntsCopia[indTrobat][2] = teclat.nextInt();
                teclat.nextLine();
            }

            System.out.println("Vols modificar partits PERDUTS? " + puntsCopia[indTrobat][3] + " (s/n)");
            mod = teclat.nextLine().charAt(0);
            if (mod == 's' || mod == 'S') {
                System.out.print("Partits perduts:  ");
                puntsCopia[indTrobat][3] = teclat.nextInt();
                teclat.nextLine();
            }

            System.out.println("Vols modificar gols A FAVOR? " + puntsCopia[indTrobat][5] + "  (s/n)");
            mod = teclat.nextLine().charAt(0);
            if (mod == 's' || mod == 'S') {
                System.out.print("Gols a favor:  ");
                puntsCopia[indTrobat][5] = teclat.nextInt();
                teclat.nextLine();
            }

            System.out.println("Vols modificar gols EN CONTRA? " + puntsCopia[indTrobat][6] + "  (s/n)");
            mod = teclat.nextLine().charAt(0);
            if (mod == 's' || mod == 'S') {
                System.out.print("Gols en contra:  ");
                puntsCopia[indTrobat][6] = teclat.nextInt();
                teclat.nextLine();
            }

            // Calcula el numero de partits jugats a partir dels partits guanyats, empatats i perduts
            puntsCopia[indTrobat][0] = puntsCopia[indTrobat][1] + puntsCopia[indTrobat][2] + puntsCopia[indTrobat][3];

            // Calcula el numero de puntsCopia totals de l'equip a partir dels partits guanyats, empatats i perduts
            puntsCopia[indTrobat][4] = (puntsCopia[indTrobat][1] * 3) + puntsCopia[indTrobat][2];

            // Calcula la diferència de gols
            puntsCopia[indTrobat][7] = puntsCopia[indTrobat][5] - puntsCopia[indTrobat][6];

            System.out.println("\n Equip MODIFICAT correctament!!");

            // tornem a visualitzar les dades actualitzades
            System.out.printf("\n\033[31m%15s %10s %10s %10s %10s %10s %-8s %-8s %10s", "Equip", "Jugats", "Guanyats", "Empatats", "Perduts", "puntsCopia   ", "G.Favor", "G.Contra  ", "Diferencia");
            System.out.printf("\n%15s", equipsCopia[indTrobat]);
            for (int j = 0; j < puntsCopia[indTrobat].length; j++) {
                System.out.printf("%10d", puntsCopia[indTrobat][j]);
            }

        }
        // Espera que l'usuari premi return per continuar
        System.out.println("\n\nPrem RETURN per continuar...");
        teclat.nextLine();
    }
}
