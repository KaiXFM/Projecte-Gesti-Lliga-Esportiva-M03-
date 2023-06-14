
package uf2.curs22.pkg23;

import java.util.Scanner;

public class PracticaJugadors {

    // definim una constant pel numero d'equips màxim que considerem que pot tenir la lliga
    // aquesta constant la farem servir per definir la llargada del arrays
    static final int NUMERO_EQUIPS = 40;

    public static void main(String[] args) {
        // creem els arrays amb uns valors inicials, per tenir dades introduïdes quan executem el programa
        String[] equipsCodi = {"Barcelona", "Real Madrid", "Real Sociedad", "Athletic", "Atletico Madrid", "Real Betis", "Osasuna CF", "Rayo Vallecano", "Villareal", "Valencia", "Mallorca", "Valladolid", "Girona CF", "Almeria CF", "Getafe CF", "Espanyol", "Cela de Vigo", "Sevilla CF", "Cadiz CF", "Elche CF"};

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
        int[][] puntsCodi = {{14, 12, 1, 1, 37, 33, 5, 28},
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

        // en la variable numEquips es tindrà en tot moment el numero d'equips que es tenen emmagatzemats
        //aquesta variable ens limitarà el final del recorregut dels arrays, el limit ara no serà 
        // només la longitud de l'array
        int numEquips = equipsCodi.length;

        // Declarem arrays amb més posicions per poder afegir equips a la nostra lliga
        String[] equips = new String[NUMERO_EQUIPS]; // inicialitza per defecte a null
        int[][] punts = new int[NUMERO_EQUIPS][8];  // inicialitza per defecte a zero

        // copia els arrays amb valors inicialitzats al codi als arrays amb més posicions
        for (int i = 0; i < equipsCodi.length; i++) {
            equips[i] = equipsCodi[i];
            for (int j = 0; j < puntsCodi[i].length; j++) {
                punts[i][j] = puntsCodi[i][j];

            }
        }

        // Presenta menú amb les opcios de l'aplicació
        Scanner teclat = new Scanner(System.in);

        int opcio;
        do {

            System.out.println("\nGESTIÓ PUNTUACIONS EQUIPS LLIGA");
            System.out.println("___________________________________________________________");

            System.out.println("\nOpcions que pots triar: \n");
            System.out.println("1. Visualitza les dades dels equips");
            System.out.println("2. Visualitza els noms dels equips ordenats");
            System.out.println("3. Visualitza les dades d'un equip, per nom equip");
            System.out.println("4. Visualitza les dades de l'equip lider i de l'equip cuer");
            System.out.println("5. Introdueix dades de nou equip");
            System.out.println("6. Modificar dades d'un equip");
            System.out.println("7. Sortir");
            System.out.println("\nTria una opció: ");
            System.out.println("____________________________________________________________");

            opcio = teclat.nextInt();

            switch (opcio) {

                case 1:
                    // Es visualitza en format taula tots els equips i les seves puntuacions de la lliga
                    System.out.println("\n_______________ PUNTUACIONS DELS EQUIPS DE LA LLIGA _______________");
                    System.out.printf("\n\033[31m%15s %10s %10s %10s %10s %10s %-8s %-8s %10s", "Equip", "Jugats", "Guanyats", "Empatats", "Perduts", "PUNTS   ", "G.Favor", "G.Contra  ", "Diferencia");
                    for (int i = 0; i < equips.length && equips[i] != null; i++) {
                        System.out.printf("\n%15s", equips[i]);
                        for (int j = 0; j < punts[i].length; j++) {
                            System.out.printf("%10d", punts[i][j]);
                        }

                    }

                    // Espera que l'usuari premi return per continuar                    
                    System.out.println("\n\nPrem RETURN per continuar...");
                    teclat.nextLine();
                    teclat.nextLine();
                    break;
                case 2:
                    // Ordena els noms d'equips per Ordre Alfabètic ascendent
                    // Per tal de no perdre la correspondència amb les puntuacions de l'array bidimensional
                    // Es fa una copia de l'array de noms d'equips en un altre array, i ordena aquest ultim
                    
                    String[] equipsOrd = new String[NUMERO_EQUIPS];
                    
                    for (int i = 0; i < numEquips; i++) {
                        equipsOrd[i] = equips[i];
                    }
                    // un cop copiat l'array original, s'ordena l'array copia, per a no perdre la correspondencia amb les puntuacions
                    
                    System.out.println("\n_______________ NOMS DELS EQUIPS ORDENATS ALFABÈTICAMENT _______________\n");
                    String tmp;
                    // recorrem del primer a l'últim
                    for (int i = 0; i < numEquips - 1; i++) {
                        // des de l'últim fins al següent de la i
                        for (int j = numEquips - 1; j > i; j--) {

                            if (equipsOrd[j].compareToIgnoreCase(equipsOrd[j - 1]) < 0) {
                                tmp = equipsOrd[j];
                                equipsOrd[j] = equipsOrd[j - 1];
                                equipsOrd[j - 1] = tmp;
                            }
                        }
                    }
                    // es visualitza els noms d'equips ordenats
                    for (int i = 0; i < equipsOrd.length && equips[i] != null; i++) {
                        System.out.println(equipsOrd[i]);
                    }

                    // Espera que l'usuari premi return per continuar                    
                    System.out.println("\n\nPrem RETURN per continuar...");
                    teclat.nextLine();
                    teclat.nextLine();

                    break;
                case 3:
                    // Donat un nom d'equip introduït per l'usuari, visualitza les seves puntuacions
                    teclat.nextLine();
                    System.out.println("Introdueix el nom d'equip del que vols visualitzar les puntuacions: ");
                    String equip = teclat.nextLine();
                    boolean trobat = false;
                    //cerquem el nom d'equip a l'array de noms
                    int i= 0;
                    for ( i = 0; i < equips.length && equips[i] != null; i++) {
                        if (equip.equalsIgnoreCase(equips[i])) {
                            trobat = true;
                            break; 
                        }    
                    }
                    if (trobat) {
                        System.out.printf("\n\033[31m%15s %10s %10s %10s %10s %10s %-8s %-8s %10s", "Equip", "Jugats", "Guanyats", "Empatats", "Perduts", "PUNTS   ", "G.Favor", "G.Contra  ", "Diferencia");
                            System.out.printf("\n%15s", equips[i]);
                            for (int j = 0; j < punts[i].length; j++) {
                                System.out.printf("%10d", punts[i][j]);
                            }
                    } else{     
                        System.out.println("No s'ha trobat aquest nom d'equip");
                    }

                    // Espera que l'usuari premi return per continuar                    
                    System.out.println("\n\nPrem RETURN per continuar...");
                    teclat.nextLine();

                    break;
                case 4:
                    // cerca l'equip amb més punts totals (lider) i amb menys punts totals (cuer)
                    int minPunts = punts[0][4],
                     indMin = 0;
                    int maxPunts = punts[0][4],
                     indMax = 0;

                    for (int j = 0; j < punts.length && equips[j] != null; j++) {
                        if (punts[j][4] < minPunts) {
                            minPunts = punts[j][4];
                            indMin = j;
                        }
                        if (punts[j][4] > maxPunts) {
                            maxPunts = punts[j][4];
                            indMax = j;
                        }
                    }

                    // Visualitza les dades del lider i del cuer
                    System.out.printf("\n       \033[31m%15s %10s %10s %10s %10s %10s %-8s %-8s %10s", "Equip", "Jugats", "Guanyats", "Empatats", "Perduts", "PUNTS   ", "G.Favor", "G.Contra  ", "Diferencia");

                    System.out.printf("\nLIDER %15s", equips[indMax]);
                    for (int j = 0; j < punts[indMax].length; j++) {
                        System.out.printf("%10d", punts[indMax][j]);
                    }

                    System.out.printf("\nCUER  %15s", equips[indMin]);
                    for (int j = 0; j < punts[indMin].length; j++) {
                        System.out.printf("%10d", punts[indMin][j]);
                    }

                    // Espera que l'usuari premi return per continuar
                    System.out.println("\n\nPrem RETURN per continuar...");
                    teclat.nextLine();
                    teclat.nextLine();

                    break;

                case 5:
                    // a partir del nom de l'equip es valida que no existeixi, per tal de donar-lo d'alta
                    teclat.nextLine();
                    System.out.println("_______________ ALTA D'EQUIP NOU _______________");
                    int indTrobat = 0;
                    if (numEquips == equips.length) {
                        // Comprova si ha arribat al final de l'array, no hi ha més espai
                        System.out.println("\nNO es poden donar d'alta més equips, no hi ha més espai...");
                    } else {

                        System.out.print("\nIntrodueix el nom del nou equip: ");
                        String equipNou = teclat.nextLine();

                        trobat = false;
                        
                        //cerca el nom d'equip a l'array de noms
                        
                        for (i = 0; i < equips.length && !trobat; i++) {
                            if (equipNou.equalsIgnoreCase(equips[i])) {
                                trobat = true;
                                indTrobat = i;
                            }
                        }

                        if (trobat) {

                            System.out.println("HO SENTIM, aquest equip ja existeix!!!, no el pots donar d'alta");
                            System.out.printf("\n\033[31m%15s %10s %10s %10s %10s %10s %-8s %-8s %10s", "Equip", "Jugats", "Guanyats", "Empatats", "Perduts", "PUNTS   ", "G.Favor", "G.Contra  ", "Diferencia");
                            System.out.printf("\n%15s", equips[i]);

                            for (int j = 0; j < punts[i].length; j++) {
                                System.out.printf("%10d", punts[i][j]);
                            }

                        } else { //donem d'alta el nou equip, doncs no existeix i hi ha espai

                            // si no troba el nom de l'equip vol dir que no existeix en l'array i el podem donar d'alta
                            // assigna a l'array de noms d'equip el nom d'equip introduït per l'usuari
                            equips[numEquips] = equipNou;

                            System.out.print("\nPartits GUANYATS: ");
                            punts[numEquips][1] = teclat.nextInt();
                            System.out.print("\nPartits EMPATATS: ");
                            punts[numEquips][2] = teclat.nextInt();
                            System.out.print("\nPartits PERDUTS: ");
                            punts[numEquips][3] = teclat.nextInt();
                            System.out.print("\nGols A FAVOR: ");
                            punts[numEquips][5] = teclat.nextInt();
                            System.out.print("\nGols EN CONTRA: ");
                            punts[numEquips][6] = teclat.nextInt();

                            // Calcula el numero de partits jugats a partir dels partits guanyats, empatats i perduts
                            punts[numEquips][0] = punts[numEquips][1] + punts[numEquips][2] + punts[numEquips][3];

                            // Calcula el numero de punts totals de l'equip a partir dels partits guanyats, empatats i perduts
                            punts[numEquips][4] = (punts[numEquips][1] * 3) + punts[numEquips][2];

                            // Calcula la diferència de gols
                            punts[numEquips][7] = punts[numEquips][5] - punts[numEquips][6];

                            System.out.println("\n Equip donat d'ALTA correctament!!");

                            System.out.printf("\n\033[31m%15s %10s %10s %10s %10s %10s %-8s %-8s %10s", "Equip", "Jugats", "Guanyats", "Empatats", "Perduts", "PUNTS   ", "G.Favor", "G.Contra  ", "Diferencia");
                            System.out.printf("\n%15s", equips[numEquips]);
                            for (int j = 0; j < punts[numEquips].length; j++) {
                                System.out.printf("%10d", punts[numEquips][j]);
                            }

                            // incrementa la variable que porta compter del numero d'equips introduïts
                            numEquips++;

                        }
                    }
                    // Espera que l'usuari premi return per continuar
                    System.out.println("\n\nPrem RETURN per continuar...");
                    teclat.nextLine();
                    teclat.nextLine();

                    break;
                case 6:
                    // opció de modificar les dades d'un equip introduït per l'usuari per consola
                    teclat.nextLine();
                    System.out.println("\n_______________ MODIFICACIÓ DE DADES D'UN EQUIP _______________");
                    System.out.println("\nIntrodueix el nom de l'equip que vols modificar:");
                    equip = teclat.nextLine();

                    trobat = false;
                    indTrobat = 0;
                    //cerca el nom d'equip a l'array de noms
                    
                    for (i = 0; i < equips.length && (!trobat); i++) {
                        if (equip.equalsIgnoreCase(equips[i])) {
                            trobat = true;
                            indTrobat = i;
                            System.out.printf("\n\033[31m%15s %10s %10s %10s %10s %10s %-8s %-8s %10s", "Equip", "Jugats", "Guanyats", "Empatats", "Perduts", "PUNTS   ", "G.Favor", "G.Contra  ", "Diferencia");
                            System.out.printf("\n%15s", equips[i]);

                            for (int j = 0; j < punts[i].length; j++) {
                                System.out.printf("%10d", punts[i][j]);
                            }
                        }

                    }
                    if (!trobat) {
                        // No troba l'equip, per tant, no es pot modificar
                        System.out.println("No s'ha trobat aquest equip");
                    } else {
                        // S'ha trobat l'equip, es demana a l'usuari quina informació vol modificar.
                        System.out.println("\nVols modificar el NOM equip? " + equips[indTrobat] + " (s/n)");
                        char mod = teclat.nextLine().charAt(0);
                        if (mod == 's' || mod == 'S') {
                            System.out.print("Nom d'equip: ");
                            equips[indTrobat] = teclat.nextLine();
                        }

                        System.out.println("Vols modificar partits GUANYATs? " + punts[indTrobat][1] + " (s/n)");
                        mod = teclat.nextLine().charAt(0);
                        if (mod == 's' || mod == 'S') {
                            System.out.print("Partits guanyats:  ");
                            punts[indTrobat][1] = teclat.nextInt();
                            teclat.nextLine();
                        }

                        System.out.println("Vols modificar partits EMPATATS? " + punts[indTrobat][2] + " (s/n)");
                        mod = teclat.nextLine().charAt(0);
                        if (mod == 's' || mod == 'S') {
                            System.out.print("Partits empatats:  ");
                            punts[indTrobat][2] = teclat.nextInt();
                            teclat.nextLine();
                        }

                        System.out.println("Vols modificar partits PERDUTS? " + punts[indTrobat][3] + " (s/n)");
                        mod = teclat.nextLine().charAt(0);
                        if (mod == 's' || mod == 'S') {
                            System.out.print("Partits perduts:  ");
                            punts[indTrobat][3] = teclat.nextInt();
                            teclat.nextLine();
                        }

                        System.out.println("Vols modificar gols A FAVOR? " + punts[indTrobat][5] + "  (s/n)");
                        mod = teclat.nextLine().charAt(0);
                        if (mod == 's' || mod == 'S') {
                            System.out.print("Gols a favor:  ");
                            punts[indTrobat][5] = teclat.nextInt();
                            teclat.nextLine();
                        }

                        System.out.println("Vols modificar gols EN CONTRA? " + punts[indTrobat][6] + "  (s/n)");
                        mod = teclat.nextLine().charAt(0);
                        if (mod == 's' || mod == 'S') {
                            System.out.print("Gols en contra:  ");
                            punts[indTrobat][6] = teclat.nextInt();
                            teclat.nextLine();
                        }

                        // Calcula el numero de partits jugats a partir dels partits guanyats, empatats i perduts
                        punts[indTrobat][0] = punts[indTrobat][1] + punts[indTrobat][2] + punts[indTrobat][3];

                        // Calcula el numero de punts totals de l'equip a partir dels partits guanyats, empatats i perduts
                        punts[indTrobat][4] = (punts[indTrobat][1] * 3) + punts[indTrobat][2];

                        // Calcula la diferència de gols
                        punts[indTrobat][7] = punts[indTrobat][5] - punts[indTrobat][6];

                        System.out.println("\n Equip MODIFICAT correctament!!");

                        // tornem a visualitzar les dades actualitzades 
                        System.out.printf("\n\033[31m%15s %10s %10s %10s %10s %10s %-8s %-8s %10s", "Equip", "Jugats", "Guanyats", "Empatats", "Perduts", "PUNTS   ", "G.Favor", "G.Contra  ", "Diferencia");
                        System.out.printf("\n%15s", equips[indTrobat]);
                        for (int j = 0; j < punts[indTrobat].length; j++) {
                            System.out.printf("%10d", punts[indTrobat][j]);
                        }

                    }

                    // Espera que l'usuari premi return per continuar
                    System.out.println("\n\nPrem RETURN per continuar...");
                    teclat.nextLine();
                    break;
                case 7:
                    // opció de sortir del programa
                    System.out.println("ADEU....");
                    break;
                default:
                    // quan l'usuari prem una opció no contemplada en el menu
                    System.out.println("Opció no correcta");
            }
        } while (opcio != 7);
    }
}
