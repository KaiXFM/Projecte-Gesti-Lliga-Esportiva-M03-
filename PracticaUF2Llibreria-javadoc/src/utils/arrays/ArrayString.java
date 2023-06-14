
package utils.arrays;

public class ArrayString{
    
   public static String[] equipsCodi = {"Barcelona", "Real Madrid", "Real Sociedad", "Athletic", "Atletico Madrid", "Real Betis", "Osasuna CF", "Rayo Vallecano", "Villareal", "Valencia", "Mallorca", "Valladolid", "Girona CF", "Almeria CF", "Getafe CF", "Espanyol", "Cela de Vigo", "Sevilla CF", "Cadiz CF", "Elche CF"};
   
   public static String[] equipsCopia= {"Barcelona", "Real Madrid", "Real Sociedad", "Athletic", "Atletico Madrid", "Real Betis", "Osasuna CF", "Rayo Vallecano", "Villareal", "Valencia", "Mallorca", "Valladolid", "Girona CF", "Almeria CF", "Getafe CF", "Espanyol", "Cela de Vigo", "Sevilla CF", "Cadiz CF", "Elche CF","","",""};
   
   public static final int NUMERO_EQUIPS = 40;
   
   public static String[] volcarString(String[] arr){
   for (int i = 0; i < equipsCodi.length; i++) {
      arr[i] = equipsCodi[i];
   }
   return arr;
   }
   
}
