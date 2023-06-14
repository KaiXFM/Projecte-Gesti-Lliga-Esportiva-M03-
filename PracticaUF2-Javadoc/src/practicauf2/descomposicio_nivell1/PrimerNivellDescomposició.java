package practicauf2.descomposicio_nivell1;
import static utils.consola.LecturaConsola.teclat;
import static practicauf2.descomposicio_nivell2.ActualitzacióDades.equipNou;
import static practicauf2.descomposicio_nivell2.ActualitzacióDades.modificarEquip;
import static practicauf2.descomposicio_nivell2.VisualitzacióDades.visualitzarEquipPerNom;
import static practicauf2.descomposicio_nivell2.VisualitzacióDades.visualitzarEquips;
import static practicauf2.descomposicio_nivell2.VisualitzacióDades.visualitzarLiderCuer;
import static practicauf2.descomposicio_nivell2.VisualitzacióDades.quicksort;
import static utils.arrays.ArrayEnter.numEquips;
import static utils.arrays.ArrayString.volcarString;
import static practicauf2.descomposicio_nivell2.ActualitzacióDades.modificarEquip;

import static practicauf2.descomposicio_nivell2.ActualitzacióDades.modificarEquip;


public class PrimerNivellDescomposició{

    /**
     * Mostra el menú d'opcions i retorna la opció seleccionada per l'usuari.
     *
     * @return L'opció seleccionada per l'usuari.
     */
    public static int menuOpcions(){

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
            return opcio;

        }while (opcio != 7);

    }
    
    /**
     * Executa les opcions del menú segons l'opció seleccionada per l'usuari.
     */
    public static void Opcions(){
       
        switch (menuOpcions()) {

            case 1 -> {
                visualitzarEquips();
                Opcions();
            }
            case 2 -> {
                System.out.println("\n_______________ NOMS DELS EQUIPS ORDENATS ALFABÈTICAMENT _______________\n");
                String[] equipsOrd = new String[numEquips];

                volcarString(equipsOrd);
                int a = 0;
                int b = numEquips -1;
                quicksort(equipsOrd,a,b);

                for (int i2 = 0; i2 < equipsOrd.length; i2++) {
                    System.out.println(equipsOrd[i2]);
                }

                System.out.println("\n\nPrem RETURN per continuar...");
                teclat.nextLine();
                teclat.nextLine();

                Opcions(); 
            }
            case 3 -> {
                visualitzarEquipPerNom();
                Opcions();
            }
            case 4 -> {
                visualitzarLiderCuer();
                Opcions();
            }
            case 5 -> {
                equipNou();
                Opcions();
            }
            case 6 -> {
                // opció de modificar les dades d'un equip introduït per l'usuari per consola
                modificarEquip();
                Opcions();
            }
            case 7 ->{ // opció de sortir del programa
                System.out.println("ADEU....");
                break;
            }
            default -> // quan l'usuari prem una opció no contemplada en el menu
                System.out.println("Opció no correcta");
        }
    }
}