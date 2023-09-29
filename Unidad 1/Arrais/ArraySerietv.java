
package arrais;
import java.util.ArrayList; 
public class ArraySerietv {

    public static void main(String[] args) {
        ArrayList<String>listaseries = new ArrayList<>();
        listaseries.add("Breaking bad"); 
        listaseries.add("friends");
        listaseries.add("Vinkings");
        
        System.out.println(listaseries);
        
        listaseries.remove("friends");
        System.out.println(listaseries);
        
        boolean containFriends = listaseries.contains("friends");
        System.out.println("LA LISTA CONTIENE A FRIENDS?: "+containFriends);
        
        int tamano = listaseries.size(); 
        System.out.println("El tamaño de la lista es : "+tamano );
        
        ArrayList<Integer>listaInteger = new ArrayList<>(); 
        ArrayList<Double>ListaDouble = new ArrayList<>();
        ArrayList<Boolean>ListaBoolean = new ArrayList<>();
        
    }
    
}
